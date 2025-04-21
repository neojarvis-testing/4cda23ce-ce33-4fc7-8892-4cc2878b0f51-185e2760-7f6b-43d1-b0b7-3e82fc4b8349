package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static FileInputStream file;
    public static int rowCount;
    public static int cellCount;
    /*
     * Method name : getExcelData
     * Author name : Akki Manith
     * Description : To send the data from ExcelReader to the DataProviderr
     * Return Type : String data
     * Parameter : path, sheetName
     */
    public static Object[][] getExcelData(String path, String sheetName){
        try {
            file = new FileInputStream(path);
            workbook=new XSSFWorkbook(file);
            sheet=workbook.getSheet(sheetName);
            rowCount=sheet.getPhysicalNumberOfRows();
            cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
            Object[][] data=new Object[rowCount][cellCount];
            for(int i=0;i<rowCount;i++){
                row=sheet.getRow(i);
                for(int j=0;j<cellCount;j++){
                    cell=row.getCell(j);
                    data[i][j]=cell.toString();
                }
            }
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}