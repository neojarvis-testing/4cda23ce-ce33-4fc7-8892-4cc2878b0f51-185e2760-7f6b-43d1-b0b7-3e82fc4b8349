package utils;

import org.testng.annotations.DataProvider;

public class Dataproviderr {
    @DataProvider(name="exceldata")
    public static Object[][] excelDataProvider(){
        String path=System.getProperty("user.dir")+"/testData/Excel.xlsx";
        String sheet="ELC sheet";
        return null;
    }
}
