package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class FooterPage {
    ExtentTest test;
    WebDriverHelper helper;
    public static final String sheetsName = "Sheet1";
    public static final String dirsPath = "/testData/ELCData.xlsx";
    public static final String userCommonPath ="user.dir" ;
    
    public FooterPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    /*
    * Method name : clickOnAcceptCookies
    * Author name : C Sai Kiran
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
            test.log(Status.INFO, "click on accept cookies");
            LoggerHandler.info("click on accept cookies");
        } catch (Exception e) {
            test.log(Status.FAIL, "not click on accept cookies");
            LoggerHandler.error("not click on accept cookies");
        }
    }
    /*
    * Method name : clickOnAboutUs
    * Author name : C Sai Kiran
    * Description : Clicks on the About Us section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAboutUs(){
        try {
            helper.jsScrollIntoView(HomePageLocators.aboutUs);
            helper.wait(HomePageLocators.aboutUs);
            helper.clickOnElement(HomePageLocators.aboutUs);
            test.log(Status.PASS, "scroll down to footer");
            LoggerHandler.info("scroll down to footer");
        } catch (Exception e) {
            test.log(Status.FAIL, "not scroll down to footer");
            LoggerHandler.error("not scroll down to footer");
        }
    }
    /*
    * Method name : verifyAboutUsUrl
    * Author name : C Sai Kiran
    * Description : Verifies the About Us page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyAboutUsUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 12, 0);
            Assert.assertEquals(value, data);
            Base.driver.navigate().back();
            test.log(Status.PASS, "navigate back to home page");
            LoggerHandler.info("navigate back to home page");
        } catch (Exception e) {
            test.log(Status.FAIL, "not navigate back to home page");
            LoggerHandler.error("not navigate back to home page");
        }
    }
    /*
    * Method name : clickOnStoreFinder
    * Author name : C Sai Kiran
    * Description : Clicks on the Store Finder section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnStoreFinder(){
        try {
            helper.jsScrollIntoView(HomePageLocators.storeFinder);
            helper.wait(HomePageLocators.storeFinder);
            helper.clickOnElement(HomePageLocators.storeFinder);
            test.log(Status.PASS, "click on store finder");
            LoggerHandler.info("click on store finder");
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on store finder" );
            LoggerHandler.error("not click on store finder");
        }
    }
    /*
    * Method name : verifyStoreFindUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Store Finder page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyStoreFindUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 12, 1);
            Assert.assertEquals(value, data);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the store finder url");
            LoggerHandler.info("verify the store finder url");
        } catch (Exception e) {
            test.log(Status.FAIL,"not verify the store finder url" );
            LoggerHandler.error("not verify the store finder url");
        }
    }
    /*
    * Method name : clickOnWEERegulations
    * Author name : C Sai Kiran
    * Description : Clicks on the WEE Regulations section and switches tabs
    * Return Type : void
    * Parameter : None
    */
    public void clickOnWEERegulations(){
        try {
            helper.jsScrollIntoView(HomePageLocators.WEERegulations);
            helper.wait(HomePageLocators.WEERegulations);
            helper.clickOnElement(HomePageLocators.WEERegulations);
            helper.switchTab();
            test.log(Status.PASS, "click on WEE Regulations");
            LoggerHandler.info("click on WEE Regulations");
        } catch (Exception e) {
            test.log(Status.FAIL, "not click on WEE Regulations");
            LoggerHandler.error("not click on WEE Regulations");
        }
    }
    /*
    * Method name : verifyWEERegulationsUrl
    * Author name : C Sai Kiran
    * Description : Verifies the WEE Regulations page URL and switches back to the default tab
    * Return Type : void
    * Parameter : None
    */
    public void verifyWEERegulationsUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName , 12, 2);
            Assert.assertEquals(value, data);
            helper.switchBackToParent();
            test.log(Status.INFO, "verify the weeRegulations url");
            LoggerHandler.info("verify the weeRegulations url");
        } catch (Exception e) {
            test.log(Status.FAIL,"not verify the weeRegulations url" );
            LoggerHandler.error("not verify the weeRegulations url");
        }
    }
    /*
    * Method name : clickOnPress
    * Author name : C Sai Kiranvoid
    * Description : Clicks on the Press section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnPress(){
        try {
            helper.jsScrollIntoView(HomePageLocators.press);
            helper.wait(HomePageLocators.press);
            helper.clickOnElement(HomePageLocators.press);
            test.log(Status.PASS, "click on Press");
            LoggerHandler.info("click on Press");
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on Press" );
            LoggerHandler.error("not click on Press");
        }
    }
    /*
    * Method name : verifyPressUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Press page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyPressUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 3);
            Assert.assertEquals(value, data);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the press url");
            LoggerHandler.info("verify the press url");
        } catch (Exception e) {
            test.log(Status.FAIL,"not verify the press url" );
            LoggerHandler.error("not verify the press url");
        }
    }
    /*
    * Method name : clickOnAffiliates
    * Author name : C Sai Kiran
    * Description : Clicks on the Affiliates section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAffilates(){
        try {
            helper.jsScrollIntoView(HomePageLocators.affilates);
            helper.wait(HomePageLocators.affilates);
            helper.clickOnElement(HomePageLocators.affilates);
            test.log(Status.PASS, "click on Affilates");
            LoggerHandler.info("click on Affilates");
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on Affilates" );
            LoggerHandler.error("not click on Affilates");
        }
    }
    /*
    * Method name : verifyAffiliatesUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Affiliates page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyAffilatesUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 4);
            Assert.assertEquals(value, data);
            Base.driver.navigate().back();
            test.log(Status.INFO, "verify the affilates url");
            LoggerHandler.info("verify the affilates url");
        } catch (Exception e) {
            test.log(Status.FAIL, "not verify the affilates url");
            LoggerHandler.error("not verify the affilates url");
        }
    }
    /*
    * Method name : clickOnCareers
    * Author name : C Sai Kiran
    * Description : Clicks on the Careers section and switches tabs
    * Return Type : void
    * Parameter : None
    */
    public void clickOnCareers(){
        try {
            helper.jsScrollIntoView(HomePageLocators.careers);
            helper.wait(HomePageLocators.careers);
            helper.clickOnElement(HomePageLocators.careers);
            test.log(Status.PASS, "click on Careers");
            LoggerHandler.info("click on Careers");
            helper.switchTab();
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on Careers" );
            LoggerHandler.error("not click on Careers");
        }
    }
    /*
    * Method name : verifyCareersUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Careers page URL and switches back to default tab
    * Return Type : void
    * Parameter : None
    */
    public void verifyCareersUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 5);
            Assert.assertEquals(value, data);
            helper.switchBackToParent();
            test.log(Status.PASS, "verifing the careers url");
            LoggerHandler.info("verifes the careers url");
        } catch (Exception e) {
            test.log(Status.FAIL,"verify the careers url" );
            LoggerHandler.error("not verify the careers url");
        }
    }
    /*
    * Method name : clickOnGiftCard
    * Author name : C Sai Kiran
    * Description : Clicks on the Gift Card section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnGiftCard(){
        try {
            helper.jsScrollIntoView(HomePageLocators.giftCards);
            helper.wait(HomePageLocators.giftCards);
            helper.clickOnElement(HomePageLocators.giftCards);
            test.log(Status.PASS, "click on gift card");
            LoggerHandler.info("click on gift card");
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on gift card" );
            LoggerHandler.error("not click on gift card");
        }
    }
    /*
    * Method name : verifyGiftCardUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Gift Card page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyGiftCardUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 6);
            Assert.assertEquals(value, data);
            test.log(Status.PASS, "verify the gift card url");
            LoggerHandler.info("verify the gift card url");
            Base.driver.navigate().back();
        } catch (Exception e) {
            test.log(Status.FAIL, "not verify the gift card url");
            LoggerHandler.error("not verify the gift card url");
        }
    }
    /*
    * Method name : clickOnKlarna
    * Author name : C Sai Kiran
    * Description : Clicks on the Klarna section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnKlarna(){
        try {
            helper.jsScrollIntoView(HomePageLocators.klarna);
            helper.wait(HomePageLocators.klarna);
            helper.clickOnElement(HomePageLocators.klarna);
            test.log(Status.PASS, "click on klarna");
            LoggerHandler.info("click on klarna");
        } catch (Exception e) {
            test.log(Status.FAIL,"not click on klarna" );
            LoggerHandler.error("not click on klarna");
        }
    }
    /*
    * Method name : verifyKlarnaUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Klarna page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyKlarnaUrl(){
        try {
            String value=helper.getUrl();
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 7);
            Assert.assertEquals(value, data);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the klarna url");
            LoggerHandler.info("verify the klarna url");
        } catch (Exception e) {
            test.log(Status.FAIL, "not verify the klarna url");
            LoggerHandler.error("not verify the klarna url");
        }
    }
    /*
    * Method name : verifyUsefulLinksText
    * Author name : C Sai Kiran
    * Description : Verifies the text for Useful Links section
    * Return Type : void
    * Parameter : None
    */
    public void verifyUsefulLinksText(){
        try {
            String value=helper.getText(HomePageLocators.usefulLinks);
            String data=ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath,sheetsName , 12, 8);
            Assert.assertEquals(value, data);;
            test.log(Status.PASS, "verify the useful links url");
            LoggerHandler.info("verify the useful links url");
        } catch (Exception e) {
            test.log(Status.FAIL, "not verify the useful links url");
            LoggerHandler.error("not verify the useful links url");
        }
    }
    /*
    * Method name : captureWebSite
    * Author name : C Sai Kiran
    * Description : Captures a screenshot of the website and saves it as "ELC"
    * Return Type : void
    * Parameter : None
    */
    public void captureWebSite(){
        try {
            Screenshot ss=new Screenshot();
            ss.captureScreenShot("ELC");
            Reporter.attachScreenshotToReport("ELC", test, "screenshot of elc home page");
            test.log(Status.PASS, "captured the elc screenshot");
            LoggerHandler.info("captured the elc screenshot");
        } catch (Exception e) {
            test.log(Status.FAIL, "not captured the elc screenshot");
            LoggerHandler.error("not captured the elc screenshot");
        }
    }
    /*
    * Method name : footerFunctionality
    * Author name : C Sai Kiran
    * Description : Executes footer functionality by calling relevant methods
    * Return Type : void
    * Parameter : None
    */
    public void footerFunctionality(){
        clickOnAcceptCookies();
        clickOnAboutUs();
        verifyAboutUsUrl();
        clickOnStoreFinder();
        verifyStoreFindUrl();
        clickOnWEERegulations();
        verifyWEERegulationsUrl();
        clickOnPress();
        verifyPressUrl();
        clickOnAffilates();
        verifyAffilatesUrl();
        clickOnCareers();
        verifyCareersUrl();
        clickOnGiftCard();
        verifyGiftCardUrl();
        clickOnKlarna();
        verifyKlarnaUrl();
        verifyUsefulLinksText();
        captureWebSite();
    }
    
}
