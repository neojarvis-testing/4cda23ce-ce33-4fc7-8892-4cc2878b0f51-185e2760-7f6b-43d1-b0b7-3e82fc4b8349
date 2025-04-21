package utils;

import org.testng.annotations.DataProvider;

public class Dataproviderr {
    /*
     * Method name : excelDataProvider
     * Author name : Akki Manith
     * Description : To get the data from ExcelReader
     * Return Type : Object[][]
     * Parameter : None
     */
    @DataProvider(name="exceldata")
    public static Object[][] excelDataProvider(){
        String path=System.getProperty("user.dir")+"/testData/Excel.xlsx";
        String sheet="ELC sheet";
        return ExcelReader.getExcelData(path, sheet);
    }
}
