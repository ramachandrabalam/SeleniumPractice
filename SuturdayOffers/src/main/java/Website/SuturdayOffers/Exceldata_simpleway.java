package Website.SuturdayOffers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata_simpleway {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\asd\\Desktop\\Test data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(2).getCell(0));
		System.out.println(sheet.getRow(3).getCell(0));
		
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().fromString("rama"));
		
		
		
		

	}

}
