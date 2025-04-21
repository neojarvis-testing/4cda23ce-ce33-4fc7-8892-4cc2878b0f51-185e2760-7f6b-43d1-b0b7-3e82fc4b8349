package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ElcCars;
import pages.Elcfooterverify;
import utils.Base;
import utils.Dataproviderr;
import utils.Reporter;

public class TestSample extends Base{
    public static ExtentTest test;
    public static ExtentReports report;
    @BeforeClass
    public void createReport(){
        report=Reporter.generateExtentReport("ELC_Report");
    }
    @BeforeMethod
    public void openELC(){
        openBrowser();
        driver.navigate().refresh();
    }
    // @Test(dataProvider = "exceldata",dataProviderClass = Dataproviderr.class)
    @Test
    public void carFunc(){
        test = report.createTest("Cars");
        ElcCars car = new ElcCars(test);
        car.cars();
    }
    @Test
    public void verification(){
        test= report.createTest("Verification");
        Elcfooterverify footer = new Elcfooterverify(test);
        footer.clickAndVerifyUrl();
    }
    @AfterMethod
    public void closeELC(){
        driver.quit();
    }
    @AfterClass
    public void closeReport(){
        report.flush();
    }

}
