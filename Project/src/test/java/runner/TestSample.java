package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.LearningPage;
import pages.OutdoorToysPage;
import utils.Base;
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

   
    @Test
    public void test3()
    {
        test=report.createTest("Test3");
        OutdoorToysPage out=new OutdoorToysPage(test);
        out.testcase3();
        
    }
    @Test
    public void test4()
    {
        test=report.createTest("Test4");
        LearningPage learn=new LearningPage(test);
        learn.testcase4();
        
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
