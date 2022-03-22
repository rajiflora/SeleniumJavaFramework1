package Utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String Path=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(Path +"/Excel/Testdata.xlsx","Sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}
