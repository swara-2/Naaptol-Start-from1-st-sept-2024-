package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class  Parametrization {
	public static String Xcel(int Row,int Cell) throws EncryptedDocumentException, IOException  {
	FileInputStream file=new FileInputStream("E:\\Parametrization.xlsx");
    String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(Row).getCell(Cell).getStringCellValue();
	return value;
	}
//	public static void main (String[]args) throws EncryptedDocumentException, IOException{
//		String v1=Xcel(0,0);
//		System.out.print(v1);
//		String v2=Xcel(1,0);
//		System.out.print(v2);
//	}

}
