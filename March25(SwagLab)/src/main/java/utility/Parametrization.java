package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String Data(int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream obj=new FileInputStream("E:\\Automation Programs(1-sept)\\Naaptol(1st sept 2024)\\March25(SwagLab)\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
		String value=WorkbookFactory.create(obj).getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
		return value;
	}

}
