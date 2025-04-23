package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.PawPatrolHomePage;
import pages.LearningPage;
import pages.OutdoorToysPage;
import pages.NewbornBabyGiftsPage;
import pages.SoftToysPage;
import pages.FooterPage;
import pages.ElcCars;
import pages.Elcfooterverify;
import pages.HappyLandHomePage;
import pages.PuzzleHomePage;
import utils.Base;
import utils.Reporter;

public class TestELC extends Base{
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

    /*
     * Method Name : NewbornBabyGifts
     * Author Name : Akki Manith
     * Description : To add the Newborn Baby Gifts under Shop by Age into the basket
     * Return Type : void
     * Parameter : none
     */
    @Test(priority = 1)
    public void NewbornBabyGifts(){
        test=report.createTest("Newborn Baby Gifts");
        NewbornBabyGiftsPage newbornBabyGifts=new NewbornBabyGiftsPage(test);
        newbornBabyGifts.NewbabyBornGiftsPageTest();
    }
    /*
     * Method Name : SoftToys
     * Author Name : Akki Manith
     * Description : To add the Soft toys under Type of toy into the basket
     * Return Type : void
     * Parameter : none
     */
    @Test(priority = 2)
    public void SoftToys(){
        test=report.createTest("Soft Toys");
        SoftToysPage softToy=new SoftToysPage(test);
        softToy.SoftToysTest();
    }
   /*Method Name:test3
     * Author Name:Vipul Saxena
     * Description: Executes 3rd test case.
     * Parameters:None
     * return type:void
     */

    @Test(priority = 3)
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

     @Test(priority = 4)
    public void test4()
    {
        test=report.createTest("Test4");
        LearningPage learn=new LearningPage(test);
        learn.testcase4();
    }
        
    /*
   * Method name : PawPatroll
   * Author name : karthik
   * Description : this test case no. 5 ensures that product is added to the basket
   * Return Type : void
   * Parameter : None
    */
   @Test(priority = 5)
   public void PawPatroll(){
       test = report.createTest("PawPatrol");
       PawPatrolHomePage pawPatrolHomePage = new PawPatrolHomePage(test);
       pawPatrolHomePage.TestPawPatrol();
    }
    @Test(priority = 6)
    public void happyland(){
        test=report.createTest("happy");
        HappyLandHomePage h=new HappyLandHomePage(test);
        h.output1();
    }
    @Test(priority = 7)
    public void puzzle(){
        test=report.createTest("puzzle");
        PuzzleHomePage p=new PuzzleHomePage(test);
        p.output2();
    }
   
    /*
     * a.Method Name: addFilteredProductToWishlist
     * b.Author Name: Pratham Maheshwari
     * c.Description: This test case ensures that a product is successfully added to the wishlist after specific filters have been applied.
     * d.Parameter: None
     * e.Return Type: void
     */
    @Test(priority = 8)
    public void addFilteredProductToWishlist(){
        test = report.createTest("Cars");
        ElcCars car = new ElcCars(test);
        car.cars();
    }

    /*
     * a.Method Name: verification
     * b.Author Name: Pratham Maheshwari
     * c.Description: This test case verifies the URL of the redirected pages after clicking specific button.
     * d.Parameter: None
     * e.Return Type: void
     */
    @Test(priority = 9)
    public void verification(){
        test= report.createTest("Verification");
        Elcfooterverify footer = new Elcfooterverify(test);
        footer.clickAndVerifyUrl();
    }
    
    
    /*
    * Method name : verifyAboutUsUrl
    * Author name : C Sai Kiran
    * Description : this tist case 10 ensures that whether its navigating back to home page
    * Return Type : void
    * Parameter : None
    */
    @Test(priority = 10)
    public void footer(){
        test=report.createTest("testCase10");
        FooterPage page=new FooterPage(test);
        page.footerFunctionality();
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
