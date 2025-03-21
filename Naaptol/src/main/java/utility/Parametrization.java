package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getTestData(int Row,int Cell,String SheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Automation Programs(1-sept)\\Naaptol(1st sept 2024)\\Naaptol\\src\\test\\resources\\TestData.xlsx");
		return WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
	  }
	}


