package Framework.FrameworkDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTask {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fout;
//	public static String path="E:\\automation testing\\TestExcel\\Test.xlsx";
	@Test
	public void Printvalue() throws IOException{
    		
		String value=getCelldata(1,1);
		System.out.println(value);
		String value1=setCelldata("Hy",1,1);
		
		System.out.println(value1);
		return;
	}
	
	
	
@Test
public static String getCelldata(int i, int j) throws IOException{
	String path="E:\\automation testing\\TestExcel\\Test.xlsx";
	fis= new FileInputStream(path);
    wb= new XSSFWorkbook(fis);
	sheet= wb.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(1);
	//String name= sheet.getRow(1).getCell(1).getStringCellValue();
	//System.out.println(name);
	return cell.getStringCellValue();
}
@Test
public static String setCelldata(String text,int i, int j) throws IOException{
	String path="E:\\automation testing\\TestExcel\\Test.xlsx";
	fis= new FileInputStream(path);
    wb= new XSSFWorkbook(fis);
	sheet= wb.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(1);
	String celdat1=cell.getStringCellValue();
	 return celdat1;
	 
			
}
@Test
public static void WriteExcel() throws IOException{
	String path="E:\\automation testing\\TestExcel\\Test.xlsx";
	fout= new FileOutputStream(path);
	sheet.getRow(0).createCell(2).setCellValue("YES");
	wb.write(fout);
//	wb.close();
}


}
