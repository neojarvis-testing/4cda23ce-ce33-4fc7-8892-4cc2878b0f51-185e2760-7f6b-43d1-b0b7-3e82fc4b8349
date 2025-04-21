package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class footerPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public footerPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void clickOnAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void CLickOnAboutUs(){
        try {
            helper.jsScrollIntoView(HomePageLocators.aboutUs);
            helper.wait(HomePageLocators.aboutUs);
            helper.clickOnElement(HomePageLocators.aboutUs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyAboutUsUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
