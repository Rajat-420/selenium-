package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
      FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
      Workbook wb=WorkbookFactory.create(fis);
      return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}

	public String getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	   FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	   Workbook wb=WorkbookFactory.create(fis);
	   return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	      
	}  
		
	
	public String getNumberDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	   FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		      
	}     
			
	public String getDateFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
			      
	}     

}
