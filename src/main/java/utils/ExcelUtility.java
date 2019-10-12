package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Base.BasePage;



public class ExcelUtility extends BasePage {

	public LinkedHashMap<String,String> getRowDataHM(String filePath, String workBookName, String sheetName, int rowIndex) throws Exception{
		
		FileInputStream file = new FileInputStream(new File(filePath+"\\"+workBookName+".xlsx"));
		XSSFWorkbook  book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowIndex);
		XSSFRow headerRow = sheet.getRow(0);
		LinkedHashMap<String,String> data = new LinkedHashMap<String,String>();
		int firstCell = headerRow.getFirstCellNum();
		int lastCell = headerRow.getLastCellNum();
		XSSFCell cell1 = headerRow.getCell(firstCell);
		XSSFCell cell2 = row.getCell(firstCell);
		
		for(int i = firstCell; i< lastCell; i++) {
			cell1 = headerRow.getCell(i);
			cell2 = row.getCell(i);
			String headerValue = cell1.getStringCellValue();
			String filedValue;
			if(cell2 == null) {
				filedValue="";
			}
			else
			{
				filedValue= cell2.getStringCellValue();
			}
			
			data.put(headerValue,filedValue);
		}
		book.close();
		return data;
	}
	
	public List<LinkedHashMap<String, String>> getTestDataListBySecnario(String filePath, String workBookName, String sheetName, String ScenarioName) throws Exception{
		FileInputStream file = new FileInputStream(new File(filePath+"\\"+workBookName+".xlsx"));
		XSSFWorkbook  book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetName);
		List<LinkedHashMap<String, String>> data = new ArrayList<LinkedHashMap<String, String>>();
		
		int totlaRows = sheet.getPhysicalNumberOfRows();
		for(int i = 0; i<totlaRows; i++) {
			XSSFRow row =sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			
			if(cell.getStringCellValue().equalsIgnoreCase(ScenarioName)) {
				data.add(getRowDataHM(filePath,workBookName,sheetName,i));
				break;
			}
		}
			book.close();
			return data;
		}
	
	
	
		public ExcelUtility(String ScenariosName, String SheetName){
			System.out.println(System.getProperty("user.dir"));
			try {
				testdataMap= getTestDataListBySecnario(System.getProperty("user.dir")+"/src/test/resources/supporting_files","TestData_V2", SheetName,scenarioName).get(rownum-1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(testdataMap);
			System.out.println((testdataMap).get("Username"));
			//System.out.println(testdataMap).get("Scenario");
			scenarioName= testdataMap.get("Scenario");
			description = testdataMap.get("Description");
			
		}
		
	

}
