package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.testCase1PageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class testCase1Page {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public testCase1Page(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickAcceptCookies(){
        try {
            helper.wait(testCase1PageLocator.acceptAllCookies);
            helper.clickOnElement(testCase1PageLocator.acceptAllCookies);
            test.log(Status.PASS, "Clicked on Accept Cookies");
            LoggerHandler.info("Clicked on Accept Cookies");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Accept Cookies");
            LoggerHandler.error("Not clicked on Accept Cookies");
        }
    }
    public void verifyLogo(){
        try {
            String data=helper.getText(testCase1PageLocator.logo);
            Assert.assertEquals(data, "early learning centre");
            test.log(Status.PASS, "Verified logo");
            LoggerHandler.info("Verified logo");
        } catch (Exception e) {
            test.log(Status.PASS, "Not verified logo");
            LoggerHandler.info("Not verified logo");
        }
    }
}
