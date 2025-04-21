package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.testCase10Locators;
import utils.Base;
import utils.LoggerHandler;
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
            helper.clickOnElement(testCase10Locators.explore); 
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
            helper.clickOnElement(testCase10Locators.explore); 
        LoggerHandler.info("Hover on Explore");
        test.log(Status.PASS,"Hover on Explore");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Hover on Explore");
          test.log(Status.PASS,"Not able to Hover on Explore");
        }
    }

}
