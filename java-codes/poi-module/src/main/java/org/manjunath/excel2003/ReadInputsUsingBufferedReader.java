package org.manjunath.excel2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputsUsingBufferedReader {
	private BufferedReader bReader= null;
	private int number;
	private String str;
	
	public int readInt() {
		try {
			bReader = new BufferedReader(new InputStreamReader(System.in));
			number = Integer.parseInt(bReader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return number;
	}
	
	public String readStr(){
		try {
			bReader = new BufferedReader(new InputStreamReader(System.in));
			str = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
