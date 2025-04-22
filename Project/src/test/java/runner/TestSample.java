package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.NewbornBabyGiftsPage;
import pages.SoftToysPage;
import pages.HappyLandHomePage;
import pages.PuzzleHomePage;
import pages.footerPage;
import utils.Base;

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
    // @Test
    public void footer(){
        test=report.createTest("testCase10");
        footerPage page=new footerPage(test);
        page.footerFunctionality();
    }
    // @Test
    public void happyland(){
        test=report.createTest("happy");
        HappyLandHomePage h=new HappyLandHomePage(test);
        h.output1();
    }
    @Test
    public void NewbornBabyGifts(){
        test=report.createTest("Newborn Baby Gifts");
        NewbornBabyGiftsPage newbornBabyGifts=new NewbornBabyGiftsPage(test);
        newbornBabyGifts.NewbabyBornGiftsPageTest();
    }
    @Test
    public void SoftToys(){
        test=report.createTest("Soft Toys");
        SoftToysPage softToy=new SoftToysPage(test);
        softToy.SoftToysTest();
    }
    // @Test
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

