package Website.SuturdayOffers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	public ArrayList getExcel(String testcasename) throws IOException {
		ArrayList a = new ArrayList();
		FileInputStream fis = new FileInputStream("C:\\Users\\asd\\Desktop\\Selenium_details.xlsx"); 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		System.out.println(sheets);
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int cellindex=0;
				while(ce.hasNext()) {
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("testcases")) {
						cellindex=k;
					}
					k++;				
				}
				
				System.out.println(cellindex);
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(cellindex).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext()) {
							Cell c =cv.next();
							if(c.getCellTypeEnum()==CellType.STRING){
								a.add(c.getStringCellValue());
							}else {
								
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							//System.out.println(Cellvalues);
							
						}
					
					}
				}
				
			}
		}
		return a;

}
	
	public static void main(String[] args) throws IOException {
		
}
}
