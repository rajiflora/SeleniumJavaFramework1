package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String Path;
	static 	XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){
		try {
			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
	}
	public int getRowCount() {
		
		int rowCount=0;
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows:" + rowCount);
			}
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	public int getColCount() {
		
		int colCount=0;
		try {
			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Column:" + colCount);
			}
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	public String getCellDataString(int rowNum, int colNum) {
		String cellData=null;
		try {
			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.print(cellData);
		}
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	public double getCellDataNumber(int rowNum, int colNum) {
		double cellDataNumber=0;
		try {
			cellDataNumber=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellDataNumber);
		}
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			e.printStackTrace();
		}
		return cellDataNumber;
	}
}
