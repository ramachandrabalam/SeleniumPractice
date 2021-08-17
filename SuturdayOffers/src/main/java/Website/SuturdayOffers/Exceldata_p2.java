package Website.SuturdayOffers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata_p2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\asd\\Desktop\\Selenium_details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row=sheet.iterator();
				Row firstrow=row.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k = 0;
				int cellindex = 0;
				while(ce.hasNext()) {
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("testcases")) {	
						cellindex=k;
					}				
					k++;
						
				}
				System.out.println(cellindex);
				while(row.hasNext()) {
					Row r = row.next();
					if(r.getCell(cellindex).getStringCellValue().equalsIgnoreCase("purchase")) {
					Iterator<Cell>	cv=r.cellIterator();
					while(cv.hasNext()) {
						Cell c=cv.next();
					System.out.println(c.getStringCellValue());
					}
					}
				}
				
				
				
			}
		}

	}

}
