import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataDriven_Exel {

	public static void main(String[] args) throws IOException {

		String excelFilePath = "C:\\Users\\Public\\Documents\\Book1.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<rows;r++) {
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				String cell=row.getCell(c).toString();
				System.out.print(" " +cell);
			}
			System.out.println();
		}
	}

}
