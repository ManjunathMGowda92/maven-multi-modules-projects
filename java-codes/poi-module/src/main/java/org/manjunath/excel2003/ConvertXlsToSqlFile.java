package org.manjunath.excel2003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ConvertXlsToSqlFile {
	String filePath ="";

	public String readAndCheckFileExists() {
		try {
			System.out.println("Please enter the file name with path");
			BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
			filePath = bReader.readLine();
			
			File file = new File(filePath);
			if (!file.exists()) {
				System.out.println("File not exists, please check");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}
	
	public void convertXls(String filename) {
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;
		HSSFRow row = null;
		
		try {
			workbook = new HSSFWorkbook(new FileInputStream(new File(filename)));
			
			sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getPhysicalNumberOfRows();
			
			FileWriter fileWriter = new FileWriter(new File("C:/Users/mahm0001/Desktop/NcNci-Xml's/ncnciTest.sql"));
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for (int i = 0; i < rowCount; i++) {
				row = sheet.getRow(i);
				if (row != null) {
					String tempStr = getSqlFormatRow(row);
					
					if ( (i != 0) && (i % 100 == 0)) {
						bufferedWriter.append(tempStr);
						bufferedWriter.append("\n");
						bufferedWriter.append("commit;");
						bufferedWriter.append("\n");
					} else {
						bufferedWriter.append(tempStr);
						bufferedWriter.append("\n");
					}
				}
			}
			
			bufferedWriter.close();
			fileWriter.close();
			
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getSqlFormatRow(HSSFRow row) {
		String sqlFormatRow = "";
		String rowValue = "";
		String tempCellValue ="";
		
		HSSFCell tempCell =null;
		//int colCount = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i < 4; i++ ) {
			tempCell = row.getCell(i);
			tempCellValue = tempCell.getStringCellValue();
			
			rowValue = rowValue +"'"+tempCellValue+"',";
			
		}
		rowValue = rowValue + "'WISOR'";
		sqlFormatRow = "Insert into NCNCICOMPATIBILITY (NCNCICOMPATIBILITYID, NC, LOCATION , NCI, SECNCI, WISORUSERID, CREATIONDATETIME) values (NCNCICOMPATIBILITYID_SEQ.NEXTVAL,";
		sqlFormatRow = sqlFormatRow + rowValue + ",SYSTIMESTAMP);";
		
		//System.out.println(sqlFormatRow);
		
		return sqlFormatRow;
	}
	
	public static void main(String[] args) {
		ConvertXlsToSqlFile convertXlsToSqlFile = new ConvertXlsToSqlFile();
		
		String filename = convertXlsToSqlFile.readAndCheckFileExists();
		convertXlsToSqlFile.convertXls(filename);
	}
}
