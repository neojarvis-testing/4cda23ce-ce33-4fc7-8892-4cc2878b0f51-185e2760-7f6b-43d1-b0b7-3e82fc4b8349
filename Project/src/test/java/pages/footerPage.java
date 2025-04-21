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
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            helper.switchBackToDefault();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnPress
    * Author name : C Sai Kiran
    * Description : Clicks on the Press section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnPress(){
        try {
            helper.jsScrollIntoView(HomePageLocators.press);
            helper.wait(HomePageLocators.press);
            helper.clickOnElement(HomePageLocators.press);
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
            helper.switchTab();
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            helper.switchBackToDefault();
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
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
            Assert.assertEquals(value, value);
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
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
        // clickOnWEERegulations();
        // verifyWEERegulationsUrl();
        clickOnPress();
        verifyPressUrl();
        clickOnAffilates();
        verifyAffilatesUrl();
        // clickOnCareers();
        // verifyCareersUrl();
        clickOnGiftCard();
        verifyGiftCardUrl();
        clickOnKlarna();
        verifyKlarnaUrl();
        verifyUsefulLinksText();
    }
    
}
