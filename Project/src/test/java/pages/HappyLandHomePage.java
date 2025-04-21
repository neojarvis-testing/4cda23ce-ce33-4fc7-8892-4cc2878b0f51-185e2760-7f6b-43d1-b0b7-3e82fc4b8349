package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HappyLandHomePageLocator;
import uistore.testCase10Locators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HappyLandHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public HappyLandHomePage(){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void hoverExplore(){
        try {
            helper.hoverOverElement(testCase10Locators.explore); 
        LoggerHandler.info("Hover on Explore");
        test.log(Status.PASS,"Hover on Explore");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Hover on Explore");
          test.log(Status.PASS,"Not able to Hover on Explore");
        }
    }
    public void clickGif(){
        try {
            helper.clickOnElement(testCase10Locators.giftCards); 
        LoggerHandler.info("Hover on Explore");
        test.log(Status.PASS,"Hover on Explore");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Hover on Explore");
          test.log(Status.PASS,"Not able to Hover on Explore");
        }
    }
    public void verifyGift(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains("gift"));
            LoggerHandler.error("Url contain gift");
            test.log(Status.PASS,"Url contain gift");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Url not contain gift");
            test.log(Status.PASS,"Url not contain gift");
        }
    }
    public void clickOffers(){
        try {
            helper.clickOnElement(testCase10Locators.offers); 
        LoggerHandler.info("Clicked on Offers");
        test.log(Status.PASS,"Clicked on Offers");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on Offers");
          test.log(Status.PASS,"Not able to Click on Offers");
        }
    }
    public void verifyMonths(){
        try {
            String text=helper.getText(HappyLandHomePageLocator.months);
            Assert.assertTrue(text.contains("months"));
            LoggerHandler.error("Text contain months");
            test.log(Status.PASS,"Text contain months");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain months");
            test.log(Status.PASS,"Text not contain months");
        }
    }
    public void clickHappyLand(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.happyland); 
        LoggerHandler.info("Clicked on HappyLand");
        test.log(Status.PASS,"Clicked on First HappyLand");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on HappyLand");
          test.log(Status.PASS,"Not able to Clicked on HappyLand");
        }
    }
    public void clickFirst(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.first); 
        LoggerHandler.info("Clicked on First Product");
        test.log(Status.PASS,"Clicked on First Product");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on First Product");
          test.log(Status.PASS,"Not able to Clicked on First Product");
        }
    }
    public void verifyStore(){
        try {
            String text=helper.getText(HappyLandHomePageLocator.store);
            Assert.assertTrue(text.contains("store"));
            LoggerHandler.error("Text contain months");
            test.log(Status.PASS,"Text contain months");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain months");
            test.log(Status.PASS,"Text not contain months");
        }
    }
    
    public void clickAddtoCart(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.addcart); 
        LoggerHandler.info("Clicked on Add to Basket");
        test.log(Status.PASS,"Clicked on Add to Basket");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on Add to Basket");
          test.log(Status.PASS,"Not able to Clicked on Add to Basket");
        }
    }
    public void clickCheck(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.checkout); 
        LoggerHandler.info("Clicked on CheckOut");
        test.log(Status.PASS,"Clicked on CheckOut");
        Screenshot.captureScreenShot("Add to cart");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click CheckOut");
          test.log(Status.PASS,"Not able to Clicked Checkout");
        }
    }

}
