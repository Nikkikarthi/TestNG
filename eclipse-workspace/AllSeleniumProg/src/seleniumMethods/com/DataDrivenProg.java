package seleniumMethods.com;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class DataDrivenProg {
		public static void main(String[] args) throws IOException {
			
	//Step 1		
			File f = new File("C:\\Users\\Home Pc\\eclipse-workspace\\AllSeleniumProg\\lib\\selenium excel.xlsx");
	//Step 2
			FileInputStream fis = new FileInputStream(f);
	//Step 3: To choose a workbook --- excel format .xlsx(windows 2007-16) - class called XSSFWorkbook
		// excel format .xls(before windows 2007)---class called HSSFworkbook
			Workbook wb = new XSSFWorkbook(fis);
	//Step 4: To choose a sheet ---using sheet name or sheet Index---
			Sheet sheet = wb.getSheetAt(0);
	//Step 5: To choose a row ---from sheet
			int rowsize = sheet.getPhysicalNumberOfRows();
	//Step 6: To iterate row
			for (int i = 0; i < rowsize; i++) {
				Row row = sheet.getRow(i);
	// Step 7:select cell
				int cellsize = row.getPhysicalNumberOfCells();	
				for (int j = 0; j < cellsize; j++) {
					Cell cell = row.getCell(j);
	// Step 8: get cell type
					CellType cellType = cell.getCellType();
	                if(cellType.equals(CellType.STRING)) {
	                	String stringCellValue = cell.getStringCellValue();
	                System.out.println(stringCellValue);	
	                }
	                else if(cellType.equals(CellType.NUMERIC)) {
	                	double d = cell.getNumericCellValue();
	                	long l = (long) d;
	                	String cellvalue = String.valueOf(l);
	//step 9: get cell value
	                	System.out.println(cellvalue);
	                	
	                }
				}
				
				
			}
			
			
			
		}

	}



