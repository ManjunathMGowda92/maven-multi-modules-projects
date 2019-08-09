package org.manjunath.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheetsInExcel {

	private static Map<String, ArrayList<String>> getMap() {
		Map<String, ArrayList<String>> bookMap = new HashMap<>();

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Rajani");
		al1.add("Sanjeev");
		al1.add("RajaniSanjeev");
		bookMap.put("ABC", al1);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Kumari");
		al2.add("Meghana");
		al2.add("Chintamani");
		bookMap.put("DEF", al2);

		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Abhilash");
		al3.add("Supritha");
		al3.add("Akshitha");
		bookMap.put("GHI", al3);

		ArrayList<String> al4 = new ArrayList<>();
		al4.add("Manjunath");
		al4.add("Manoj");
		al4.add("Sushma");
		bookMap.put("JKL", al4);

		return bookMap;
	}

	public static void writeToExcel() {
		XSSFWorkbook workbook = new XSSFWorkbook();
		File xlsFile = new File("C:\\personal\\sample.xlsx");

		try {
			xlsFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Map<String, ArrayList<String>> bookMap = getMap();

		for (Entry<String, ArrayList<String>> entry : bookMap.entrySet()) {
			XSSFSheet sheet = workbook.createSheet(entry.getKey());
			System.out.println("Sheet created with : " + entry.getKey());

			ArrayList<String> entryList = entry.getValue();
			int rowNum = 0;
			for (String name : entryList) {
				Row row = sheet.createRow(rowNum++);

				Cell cell = row.createCell(0);
				cell.setCellValue(name);
			}

		}

		try {
			FileOutputStream outStream = new FileOutputStream(xlsFile, xlsFile.exists());
			workbook.write(outStream);
			outStream.flush();
			workbook.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("done");

	}

	public static void main(String[] args) {
		//writeToExcel();
		
		
	}
}
