package commonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		String filepath=".\\src\\test\\resources\\TestData.xlsx";
		FileInputStream fin = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(fin);
		Sheet sh = workbook.getSheet(sheet);
		Row rw = sh.getRow(row);
		Cell cl = rw.getCell(cell);
		String data = cl.getStringCellValue();
		workbook.close();
		return data;
	}
	
public void writeDataIntoExcel(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		
		String filepath=".\\src\\test\\resources\\TestData.xlsx";
		FileInputStream fin = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(fin);
		Sheet sh = workbook.getSheet(sheet);
		Row rw = sh.createRow(row);
		Cell cl = rw.createCell(cell);
		cl.setCellValue(data);
		FileOutputStream fos= new FileOutputStream(filepath);
		workbook.write(fos);
		workbook.close();
	}

}
