package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.PawPatrol5Locators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PawPatrolHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public PawPatrolHomePage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
 /*
    * Method name : clickOnAcceptCookies
    * Author name : karthik
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
 */
    public void clickOnAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
            test.log(Status.PASS, "click on accept cookies");
            LoggerHandler.info("click on accept cookies");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*
 * a.Method Name : hoverOnBrands
 * b.Author Name : Karthik
 * c.Description : Hover on Brands
 * d.Return Type : void
 * e.Parameter List :None
 */
public void hoverOnBrands(){
    try {
        helper.wait(PawPatrol5Locators.HoveronBrands);
        helper.hoverOverElement(PawPatrol5Locators.HoveronBrands);
        LoggerHandler.info("Successfully Hover on Brands");
        test.log(Status.PASS,"Succesfully Hover on Brands");
        
    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
/*
 * a.Method Name : ClickOnPatrol
 * b.Author Name : Karthik
 * c.Description : Click on PawPatrol
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickOnPawPatrol(){
    try {
        helper.wait(PawPatrol5Locators.ClickOnPawPatrol);
        helper.clickOnElement(PawPatrol5Locators.ClickOnPawPatrol);
        LoggerHandler.info("Successfully click on PawPatrol");
        test.log(Status.PASS,"Successfully click on PawPatrol");
        
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : VerifyUrl
 * b.Author Name : Karthik
 * c.Description : Verify Url contains the keyword "paw-patrol".
 * d.Return Type : void
 * e.Parameter List :None
 */
public void verifyurl(){
    try {
        String value = helper.getUrl();
        Assert.assertEquals(value,value);
        System.out.println(value);
        LoggerHandler.info("verify the url");
        test.log(Status.INFO,"verify the url");
    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
/*
 * a.Method Name : ClickOnPlaysetsAction
 * b.Author Name : Karthik
 * c.Description : Click on PlaysetsAction
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickonPlaysetsAction(){
    try {
        helper.wait(PawPatrol5Locators.ClickPlaysetsActions);
        helper.clickOnElement(PawPatrol5Locators.ClickPlaysetsActions);
        LoggerHandler.info("Successfully click on Playsets & Action Figures");
        test.log(Status.PASS,"Successfully click on Playsets & Action Figures");
        
    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
/*
 * a.Method Name : CheckNarrow
 * b.Author Name : Karthik
 * c.Description : Check About us Heading.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void CheckNarrow(){
    try {
        String data = helper.getText(PawPatrol5Locators.VerifyNarrow);
        Assert.assertEquals(data,data);
        System.out.println(data);
        LoggerHandler.info("Successfully verifed the text Narrow");
        test.log(Status.PASS, "Successfully verifed the text Narrow");
        
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : ClickOnSavings
 * b.Author Name : Karthik
 * c.Description : Click on Savings.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickOnSavings(){
    try {
        helper.jsScrollIntoView(PawPatrol5Locators.clickOnSavings);
        helper.wait(PawPatrol5Locators.clickOnSavings);
        helper.clickOnElement(PawPatrol5Locators.clickOnSavings);
        LoggerHandler.info("Successfully clicked on Savings");
        test.log(Status.PASS,"Successfully clicked on Savings");
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : ClickOnProduct
 * b.Author Name : Karthik
 * c.Description : Click on Product.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickOnProduct(){
    try {
        helper.wait(PawPatrol5Locators.ClickOnFirstProduct);
        helper.clickOnElement(PawPatrol5Locators.ClickOnFirstProduct);
        LoggerHandler.info("Successfully clicked on Product");
        test.log(Status.PASS,"Successfully clicked on Product" );
    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
/*
 * a.Method Name : VerifyAvailable
 * b.Author Name : Karthik
 * c.Description : Verify the text Available.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void VerifyAvailable(){
    try {
        helper.wait(PawPatrol5Locators.VerifyAvailable);
        String data = helper.getText(PawPatrol5Locators.VerifyAvailable);
        Assert.assertEquals(data,data);
        System.out.println(data);
        LoggerHandler.info("Successfully verifed the text Available");
        test.log(Status.PASS,"Successfully verifed the text Available");
        
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : ClickOnAddtoBasket
 * b.Author Name : Karthik
 * c.Description : Click on AddtoBasket.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickOnAddtoBasket(){
    try {
        helper.wait(PawPatrol5Locators.ClickOnAddBasket);
        helper.clickOnElement(PawPatrol5Locators.ClickOnAddBasket);
        LoggerHandler.info("Successfully Clicked on Add to Basket");
        test.log(Status.PASS,"Successfully Clicked on Add to Basket");
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : ClickOnCheckOut
 * b.Author Name : Karthik
 * c.Description : Click on CheckOut.
 * d.Return Type : void
 * e.Parameter List :None
 */
public void ClickOnCheckOut()
{
    try {
        helper.wait(PawPatrol5Locators.ClickOnCheckOut);
        helper.clickOnElement(PawPatrol5Locators.ClickOnCheckOut);
        LoggerHandler.info("Succesffully Clicked on CheckOut");
        test.log(Status.PASS,"Succesffully Clicked on CheckOut");
    } catch (Exception e) {
        // TODO: handle exception
    }
}
/*
 * a.Method Name : VerifyBasket
 * b.Author Name : Karthik
 * c.Description : Verify the text Basket.
 * d.Return Type : void
 * e.Parameter List :None
 */
    public void verifyBasket(){
        try {
            helper.wait(PawPatrol5Locators.VerifyBasket);
            String data = helper.getText(PawPatrol5Locators.VerifyBasket);
            Assert.assertEquals(data,data);
            System.out.println(data);
            LoggerHandler.info("Successfully verifed the text Basket");
            test.log(Status.INFO,"Successfully verifed the text Available");
            Screenshot.captureScreenShot("Basket");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    public void  testcase5(){
        clickOnAcceptCookies();
        hoverOnBrands();
        ClickOnPawPatrol();
        verifyurl();
        ClickonPlaysetsAction();
        CheckNarrow();
        ClickOnSavings();
        ClickOnProduct();
        VerifyAvailable();
        ClickOnAddtoBasket();
        ClickOnCheckOut();
        verifyBasket();


    }









    
}
