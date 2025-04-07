package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {

FileInputStream fis1=new FileInputStream("D:\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		//modifying cell
		//ws.getRow(2).getCell(0).setCellValue("new");
		
		//create cell
		
		//ws.getRow(2).createCell(1).setCellValue("456");
		
		//creating row and cell
		ws.createRow(2).createCell(0).setCellValue("rest assured");
		FileOutputStream fos=new FileOutputStream("D:\\Book1.xlsx");
		wb.write(fos);
		
		wb.close();

		
	}

}
