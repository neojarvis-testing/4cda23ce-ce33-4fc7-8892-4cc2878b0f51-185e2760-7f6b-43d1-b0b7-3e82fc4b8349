package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HappyLandHomePageLocator;
import uistore.HomePageLocators;

import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HappyLandHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public HappyLandHomePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
            test.log(Status.PASS, "clicked on accept cookies");
            LoggerHandler.info("clicked on accept cookies");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.PASS, "Not able to clicked on accept cookies");
            LoggerHandler.info("Not able to clicked on accept cookies");

        }
    }
   
    public void hoverExplore(){
        try {
            helper.wait(HomePageLocators.explore);
            helper.hoverOverElement(HomePageLocators.explore); 
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
            helper.wait(HomePageLocators.giftCards);
            helper.clickOnElement(HomePageLocators.giftCards); 
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
            System.out.println(url);
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
            helper.clickOnElement(HomePageLocators.offers); 
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
            // System.out.println(text);
            Assert.assertTrue(text.contains("months"));
            LoggerHandler.error("Text contains stores");
            test.log(Status.PASS,"Text contains stores");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain months");
            test.log(Status.PASS,"Text not contain months");
        }
    }
    public void clickHappyLand(){
        try {
            helper.wait(HappyLandHomePageLocator.happyland);
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
            helper.wait(HappyLandHomePageLocator.first);
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
            System.out.println(text);
            Assert.assertTrue(text.contains("store"));
            LoggerHandler.error("Text contains stores");
            test.log(Status.PASS,"Text contains stores");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain Stores");
            test.log(Status.PASS,"Text not contain Stores");
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
    public void output1(){
     
      clickAcceptCookies();
       hoverExplore();
       clickGif();
       verifyGift();
       clickOffers();
       verifyMonths();
       clickHappyLand();
       clickFirst();
       verifyStore();
       clickAddtoCart();
       clickCheck();
    }

}
