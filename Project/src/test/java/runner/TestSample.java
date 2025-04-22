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
import pages.HappyLandHomePage;
import pages.PuzzleHomePage;
import utils.Base;
import utils.DataProviderclass;
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

   /*Method Name:test3
     * Author Name:Vipul Saxena
     * Description: Executes 3rd test case.
     * Parameters:None
     * return type:void
     */

    @Test
    public void test3()
    {
        test=report.createTest("Test3");
        OutdoorToysPage out=new OutdoorToysPage(test);
        out.testcase3();
        
    }
    /*Method Name:test4
     * Author Name:Vipul Saxena
     * Description: Executes 4th test case.
     * Parameters:None
     * return type:void
     */

    @Test
    public void test4()
    {
        test=report.createTest("Test4");
        LearningPage learn=new LearningPage(test);
        learn.testcase4();
    }
        
    // @Test
    // public void footer(){
    //     test=report.createTest("testCase10");
    //     footerPage page=new footerPage(test);
    //     page.footerFunctionality();
    // }
    @Test
    public void happyland(){
        test=report.createTest("happy");
        HappyLandHomePage h=new HappyLandHomePage(test);
        h.output1();
    }
    // @Test(dataProvider = "exceldata",dataProviderClass = DataProviderclass.class)
    @Test(dataProvider = "exceldata",dataProviderClass = DataProviderclass.class)
    public void puzzle(String value){
        test=report.createTest("puzzle");
        PuzzleHomePage p=new PuzzleHomePage(test);
        p.output2(value);
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

