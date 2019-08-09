package org.manjunath.httpServices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpPostman {

	private void getVoters(String url) {
		URL urlObj = null;
		HttpURLConnection connection = null;
		BufferedReader reader = null;

		try {
			urlObj = new URL(url);
			connection = (HttpURLConnection) urlObj.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Accept", "application/json");

			int responseCode = connection.getResponseCode();
			System.out.println("Response Code :" + responseCode);

			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer response = new StringBuffer();

			String line;
			line = reader.readLine();
			while (line != null) {
				response.append(line);

				line = reader.readLine();
			}

			System.out.println(response.toString());
		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException occurred: " + e);
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e);
		} finally {
			connection.disconnect();
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("IOException occurred while closing the BufferedReader :" + e);
			}
		}
	}
	
	private void postContentToUrl(String url, String content) {
		URL urlObject =null;
		HttpURLConnection connection = null;
		BufferedReader reader = null;
		
		try {
			urlObject = new URL(url);
			connection = (HttpURLConnection) urlObject.openConnection();
			
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Accept", "application/json");			
			connection.setDoOutput(true);
			
			OutputStream outStream = connection.getOutputStream();
			outStream.write(content.getBytes());
			outStream.flush();
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer response = new StringBuffer();
			
			
			String line;
			line = reader.readLine();
			while (line != null) {
				response.append(line);
				
				line = reader.readLine();
			}
			
			System.out.println(response.toString());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void postJsonContentToUrl(String url) {
		String jsonContent = readJsonFromFile1("jsonFiles/voters.json");
		postContentToUrl(url, jsonContent);
	}

	private String readJsonFromFile1(String filePath){
		File file = null;
		BufferedReader reader = null;
		StringBuffer jsonContent = null;
			
			try {
				//get File from resources folder
				file = new File(getClass().getClassLoader().getResource(filePath).getFile());
				
				reader = new BufferedReader(new FileReader(file));
				jsonContent = new StringBuffer();
				
				String line;
				line = reader.readLine();
				while(line != null) {
					jsonContent.append(line);
					
					line = reader.readLine();
				}
				
				//System.out.println(jsonContent.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			return jsonContent.toString();
	}
	
	private void readResourceAsStream(String filePath){
		InputStream stream = null;
		BufferedReader reader = null;
		
		try {
			stream = getClass().getClassLoader().getResourceAsStream(filePath);
			reader = new BufferedReader(new InputStreamReader(stream));
			StringBuffer jsonContent = new StringBuffer();
			
			String line;
			line = reader.readLine();
			
			while (line != null) {
				jsonContent.append(line);
				
				line = reader.readLine();
			}
			
			System.out.println(jsonContent.toString());
			
		} catch (Exception e) {
			System.out.println("Exception Occurred :"+e);
		} finally {
			try {
				stream.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		HttpPostman postman = new HttpPostman();
		String url = "http://localhost:8080/voter/webapi/voters";
		postman.getVoters(url+"/result");
		
		//postman.readJsonFromFile1("jsonFiles/voters.json");
		//postman.readResourceAsStream("jsonFiles/voters.json");
		
		postman.postJsonContentToUrl(url);

	}
}
