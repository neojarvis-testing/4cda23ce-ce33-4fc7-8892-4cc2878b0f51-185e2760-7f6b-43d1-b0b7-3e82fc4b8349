package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LearningPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public LearningPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver);
        this.test=test;


    }

    /*Method Name:clickOnAccept
     * Author Name:Vipul Saxena
     * Description: This methods clicks on accept cookies.
     * Parameters:None
     * return type:void
     */

    public void clickOnAccept(){
        try {
            helper.wait(HomePageLocators.accept);
            helper.clickOnElement(HomePageLocators.accept);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Method Name:hoveronlearningskills
     * Author Name:Vipul Saxena
     * Description: This method hovers on learning skills.
     * Parameters:None
     * return type:void
     */

    public void hoveronlearningskills()
    {
        try {
            helper.wait(HomePageLocators.Learningskills);
            helper.hoverOverElement(HomePageLocators.Learningskills);
            test.log(Status.PASS, "Hovered Learningskills");
            LoggerHandler.info("Hovered Learningskills");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Hovered Learningskills");
            LoggerHandler.info("Not Hovered Learningskills");
        }

    }

    /*Method Name:clickoncreativity
     * Author Name:Vipul Saxena
     * Description: This methods clicks on creativity.
     * Parameters:None
     * return type:void
     */

    public void clickoncreativity()
    {
        try {
            helper.wait(HomePageLocators.creativity);
            helper.clickOnElement(HomePageLocators.creativity);
            test.log(Status.PASS, "Clicked on creativity");
            LoggerHandler.info("Clicked on creativity");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on creativity");
            LoggerHandler.info("Not Clicked on creativity");
        }

    }

    /*Method Name:creativityurlverify
     * Author Name:Vipul Saxena
     * Description: This methods verifies the creativity page url.
     * Parameters:None
     * return type:void
     */

 public void creativityurlverify()
    {
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains("creativity"));
            test.log(Status.PASS, "Contains creativity");
            LoggerHandler.info("Contains creativity");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Contains creativity");
            LoggerHandler.info("Not Contains creativity");
        }
    }

    /*Method Name:clickonartcraft
     * Author Name:Vipul Saxena
     * Description: This method clicks on art and craft.
     * Parameters:None
     * return type:void
     */

    public void clickonartcraft()
    {
        try {
            helper.wait(HomePageLocators.artandcraft);
            helper.clickOnElement(HomePageLocators.artandcraft);
            test.log(Status.PASS, "Clicked on artandcraft");
            LoggerHandler.info("Clicked on artandcraft");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on artandcraft");
            LoggerHandler.info("Not Clicked on artandcraft");
        }

    }

    /*Method Name:clickoncreativityfilter
     * Author Name:Vipul Saxena
     * Description: This method clicks on creativity filter.
     * Parameters:None
     * return type:void
     */

    public void clickoncreativityfilter()
    {
        try {
            helper.wait(HomePageLocators.creativityfilter);
            helper.clickOnElement(HomePageLocators.creativityfilter);
            test.log(Status.PASS, "Clicked on creativityfilter");
            LoggerHandler.info("Clicked on creativityfilter");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on creativityfilter");
            LoggerHandler.info("Not Clicked on creativityfilter");
        }

    }

    /*Method Name:clickonartfirstproduct
     * Author Name:Vipul Saxena
     * Description: This methods clicks on first product.
     * Parameters:None
     * return type:void
     */

    public void clickonartfirstproduct()
    {
        try {
            helper.wait(HomePageLocators.artfirstproduct);
            helper.clickOnElement(HomePageLocators.artfirstproduct);
            test.log(Status.PASS, "Clicked on artfirstproduct");
            LoggerHandler.info("Clicked on artfirstproduct");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on artfirstproduct");
            LoggerHandler.info("Not Clicked on artfirstproduct");
        }

    }

    /*Method Name:minutesverify
     * Author Name:Vipul Saxena
     * Description: This methods verify "minutes" text
     * Parameters:None
     * return type:void
     */

    public void minutesverify()
    {
        try {
            String text=helper.getText(HomePageLocators.verifyminutes);
            Assert.assertTrue(text.contains("minutes"));
            test.log(Status.PASS, "Verified minutes");
            LoggerHandler.info("Verified minutes");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified minutes");
            LoggerHandler.info("Not Verified minutes");
        }
    }

    /*Method Name:clickartaddtocart
     * Author Name:Vipul Saxena
     * Description: This methods clicks on add to basket.
     * Parameters:None
     * return type:void
     */

    public void clickartaddtocart()
    {
        try {
            helper.wait(HomePageLocators.addtobasket);
            helper.clickOnElement(HomePageLocators.addtobasket);
            test.log(Status.PASS, "Clicked on addtobasket");
            LoggerHandler.info("Clicked on addtobasket");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on addtobasket");
            LoggerHandler.info("Not Clicked on addtobasket");
        }

    }

    /*Method Name:clickartcheckout
     * Author Name:Vipul Saxena
     * Description: This methods clicks on checkout.
     * Parameters:None
     * return type:void
     */

    public void clickartcheckout()
    {
        try {
            helper.wait(HomePageLocators.checkout);
            helper.clickOnElement(HomePageLocators.checkout);
            test.log(Status.PASS, "Clicked on checkout");
            LoggerHandler.info("Clicked on checkout");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on checkout");
            LoggerHandler.info("Not Clicked on checkout");
        }

    }

    /*Method Name:takescreenshot
     * Author Name:Vipul Saxena
     * Description: This method takes screenshot.
     * Parameters:None
     * return type:void
     */

    public void takescreenshot()
    {
        Screenshot.captureScreenShot("Learning product");
    }

    public void testcase4()
    {
        clickOnAccept();
        hoveronlearningskills();
        clickoncreativity();
        creativityurlverify();
        clickonartcraft();
        clickoncreativityfilter();
        clickonartfirstproduct();
        minutesverify();
        clickartaddtocart();
        takescreenshot();


    }

    
    





}
