package org.manjunath.excel2003;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

public class ConvertXlsFileToText {
	private String fileName = "";
	
	public String readFile(){
		ReadInputsUsingBufferedReader readInputs = new ReadInputsUsingBufferedReader();
		System.out.println("Read file name");
		this.fileName = readInputs.readStr();
		return fileName;
	}
	
	public int checkFileExistsOrNot(File tempFile){
		int fileExists = 0;
		if (tempFile.exists()) {
			fileExists = 1;
		} else {
			fileExists = -1;
		}
		return fileExists;
	}
	
	public void convertXls(String fileName) {
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;
		HSSFRow row = null;
		DataFormatter dataFormatter = null;
		FormulaEvaluator formulaEvaluator = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(new File(fileName)));
			dataFormatter = new DataFormatter();   //dataFormatter and formulaEvaluator are used to convert the numeric values to String values
			formulaEvaluator = new HSSFFormulaEvaluator(workbook);
			
			sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getPhysicalNumberOfRows();
			
			FileWriter fileWriter = new FileWriter(new File("C:/Users/mahm0001/Desktop/DESKTOP_DOCS/RD/NCNCI.txt"));
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			 
			for (int i = 1; i < rowCount; i++) { //row value is considered from 1 because we are not adding header into text file
				row = sheet.getRow(i);
				if (row != null)  {
					String tempStr = getRowValue(row,dataFormatter,formulaEvaluator);
					//System.out.println(tempStr);
					bufferedWriter.append(tempStr);
					bufferedWriter.append("\n");
				}
			}
			
			bufferedWriter.close();
			fileWriter.close();
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getRowValue(HSSFRow row, DataFormatter dataFormatter, FormulaEvaluator formulaEvaluator) {
		String rowValue = "";
		String tempCellvalue = "";
		HSSFCell tempCell = null;
		int columnCount = row.getPhysicalNumberOfCells();

		for (int i = 0; i < columnCount; i++) {
			tempCell = row.getCell(i);
			formulaEvaluator.evaluate(tempCell);

			tempCellvalue = dataFormatter.formatCellValue(tempCell, formulaEvaluator);
			if (i == 0) {
				if (tempCellvalue.contains(",")) {
					rowValue = rowValue + "\"" +tempCellvalue +"\"";
				} else {
					rowValue = rowValue + tempCellvalue;
				}
				
			} else {
				if (tempCellvalue.contains(",")) {
					rowValue = rowValue + "\t" + "\"" + tempCellvalue + "\"";
				} else {
					rowValue = rowValue + "\t" + tempCellvalue;
				}
				
			}
		}
		return rowValue;
	}
	
	public static void main(String[] args) {
		ConvertXlsFileToText convert = new ConvertXlsFileToText();
		String file = convert.readFile();
		int fileExists = convert.checkFileExistsOrNot(new File(file));
		
		if (fileExists == 1){
			System.out.println("adadfad");
			convert.convertXls(file);
		}else if(fileExists == -1){
			System.out.println("sddvfjvsdijfv");
		}
	}
}
