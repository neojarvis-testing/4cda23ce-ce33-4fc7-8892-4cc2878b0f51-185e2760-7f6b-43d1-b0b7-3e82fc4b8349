package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ElcCars;
import pages.Elcfooterverify;
import pages.HappyLandHomePage;
import pages.PuzzleHomePage;
import pages.footerPage;
import utils.Base;

import utils.DataProviderclass;
import utils.Reporter;

public class TestSample extends Base
{
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

    //testcase8
    @Test(dataProvider = "exceldata",dataProviderClass = DataProviderclass.class,priority = 2)
    public void carFunc(String value){
        test = report.createTest("Cars");
        ElcCars car = new ElcCars(test);
        car.cars(value);
    }
    //testcase 10
     @Test
    public void footer(){
        test=report.createTest("testCase10");
        footerPage page=new footerPage(test);
        page.footerFunctionality();
    }
    //testcase6
    @Test
    public void happyland(){
        test=report.createTest("happy");
        HappyLandHomePage h=new HappyLandHomePage(test);
        h.output1();
    }
    // testcase7
    @Test(dataProvider = "exceldata",dataProviderClass = DataProviderclass.class ,priority = 1)
    public void puzzle(String value){
        test=report.createTest("puzzle");
        PuzzleHomePage p=new PuzzleHomePage(test);
        p.output2(value);
    }
    // testcase9
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
    public void closeReport()
    {
        report.flush();
    }

}

