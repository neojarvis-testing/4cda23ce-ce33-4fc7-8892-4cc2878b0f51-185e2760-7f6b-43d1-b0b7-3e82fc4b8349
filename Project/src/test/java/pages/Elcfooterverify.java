package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Elcfooterverify {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public Elcfooterverify(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test =test;
    }


    /*
     * a.Method Name: clickOnAccept
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the accept button to accept the cookies.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnAccept(){
        try {
            helper.wait(HomePageLocators.accept);
            helper.clickOnElement(HomePageLocators.accept);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: clickOnContactUs
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnContactUs(){
        try {
            helper.scrollToFooter();
            Thread.sleep(500);
            helper.wait(HomePageLocators.contactUs);
            helper.clickOnElement(HomePageLocators.contactUs);
            LoggerHandler.info("Clicked on Contact us");
            test.log(Status.PASS, "Clicked on Contact us");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Contact us");
            test.log(Status.FAIL, "Not able to click on Contact us");
        }
    }

    /*
     * a.Method Name: verifyCarUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyContactUsUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://theentertainer.zendesk.com/hc/en-gb/articles/6495305266833-Contact-Us");
            
            LoggerHandler.info("Verified ContactUs URL");
            test.log(Status.PASS, "Cars ContactUs URL");
            Base.driver.navigate().back();
            // Base.driver.navigate().to("https://www.elc.co.uk/");
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify ContactUs URL");
            test.log(Status.FAIL, "ContactUs URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnDeliveryOption
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnDeliveryOption(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.delivery);
            helper.clickOnElement(HomePageLocators.delivery);
            LoggerHandler.info("Clicked on Delivery option");
            test.log(Status.PASS, "Clicked on Delivery option");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Delivery option");
            test.log(Status.FAIL, "Not able to click on Delivery option");
        }
    }

    /*
     * a.Method Name: verifyDeliveryOptionUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyDeliveryOptionUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://theentertainer.zendesk.com/hc/en-gb/articles/6480509734289-Delivery-information");
            LoggerHandler.info("Verified Delivery Option URL");
            test.log(Status.PASS, "Verified Delivery Option URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Delivery Option URL");
            test.log(Status.FAIL, "Delivery Option URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnproductSafetyNotices
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnproductSafetyNotices(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.productSafety);
            helper.clickOnElement(HomePageLocators.productSafety);
            LoggerHandler.info("Clicked on Product Safety Notices");
            test.log(Status.PASS, "Clicked on Product Safety Notices");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Product Safety Notices");
            test.log(Status.FAIL, "Not able to click on Product Safety Notices");
        }
    }

    /*
     * a.Method Name: verifyProductSafetyUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyProductSafetyUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://www.elc.co.uk/product-safety-notices");
            LoggerHandler.info("Verified Product Safety notices URL");
            test.log(Status.PASS, "Verified Product Safety notices URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Product Safety notices URL");
            test.log(Status.FAIL, "Product Safety notices URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnReturn
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnReturn(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.returns);
            helper.clickOnElement(HomePageLocators.returns);
            LoggerHandler.info("Clicked on Returns");
            test.log(Status.PASS, "Clicked on Returns");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Returns");
            test.log(Status.FAIL, "Not able to click on Returns");
        }
    }

    /*
     * a.Method Name: verifyReturnsUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyReturnsUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://theentertainer.zendesk.com/hc/en-gb/articles/4402417396241-Our-Returns-Policy");
            LoggerHandler.info("Verified Returns URL");
            test.log(Status.PASS, "Verified Returns URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Returns URL");
            test.log(Status.FAIL, "Returns URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnTrackYourOrder
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnTrackYourOrder(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.trackYourOrder);
            helper.clickOnElement(HomePageLocators.trackYourOrder);
            LoggerHandler.info("Clicked on Track your Order");
            test.log(Status.PASS, "Clicked on Track your Order");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Track your Order");
            test.log(Status.FAIL, "Not able to click on Track your Order");
        }
    }

    /*
     * a.Method Name: verifyTrackYourOrderUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyTrackYourOrderUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://www.elc.co.uk/login");
            LoggerHandler.info("Verified Track your Order URL");
            test.log(Status.PASS, "Verified Track your Order URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Track your Order URL");
            test.log(Status.FAIL, "Track your Order URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnHelpCentre
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnHelpCentre(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.helpCenter);
            helper.clickOnElement(HomePageLocators.helpCenter);
            LoggerHandler.info("Clicked on Help Centre");
            test.log(Status.PASS, "Clicked on Help Centre");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Help Centre");
            test.log(Status.FAIL, "Not able to click on Help Centre");
        }
    }

    /*
     * a.Method Name: verifyHelpCentreUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyHelpCentreUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://theentertainer.zendesk.com/hc/en-gb");
            LoggerHandler.info("Verified Help Centre URL");
            test.log(Status.PASS, "Verified Help Centre URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Help Centre URL");
            test.log(Status.FAIL, "Help Centre URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnYourPrivacy
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnYourPrivacy(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.privacyPolicy);
            helper.clickOnElement(HomePageLocators.privacyPolicy);
            LoggerHandler.info("Clicked on Your Privacy");
            test.log(Status.PASS, "Clicked on Your Privacy");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Your Privacy");
            test.log(Status.FAIL, "Not able to click on Your Privacy");
        }
    }

    /*
     * a.Method Name: verifyYourPrivacyUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyYourPrivacyUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://www.elc.co.uk/privacy");
            LoggerHandler.info("Verified Your Privacy URL");
            test.log(Status.PASS, "Verified Your Privacy URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Your Privacy URL");
            test.log(Status.FAIL, "Your Privacy URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnHowToComplain
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnHowToComplain(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.howToComplain);
            helper.clickOnElement(HomePageLocators.howToComplain);
            LoggerHandler.info("Clicked on How to Complain");
            test.log(Status.PASS, "Clicked on How to Complain");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on How to Complain");
            test.log(Status.FAIL, "Not able to click on How to Complain");
        }
    }

    /*
     * a.Method Name: verifyHowToComplainUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyHowToComplainUrl(){
        try {
            String str = Base.driver.getTitle();
            System.out.println(str);
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertEquals(x,"https://theentertainer.zendesk.com/hc/en-gb/articles/32765165894801-How-to-complain");
            LoggerHandler.info("Verified How to complain URL");
            test.log(Status.PASS, "Verified How to complain URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify How to complain URL");
            test.log(Status.FAIL, "How to complain URL not verified");
        }
    }
    /*
     * a.Method Name: verifyHowToComplainUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyAboutUs(){
        try {
            String str = helper.getText(HomePageLocators.about);
            System.out.println(str);
            Assert.assertEquals(str,"About us");
            LoggerHandler.info("Verified Keyword 'About Us'");
            test.log(Status.PASS, "Verified Keyword 'About Us'");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Keyword 'About Us'");
            test.log(Status.FAIL, "Keyword 'About Us' not verified");
        }
    }

    public void clickAndVerifyUrl(){
        clickOnAccept();
        clickOnContactUs();
        verifyContactUsUrl();
        clickOnDeliveryOption();
        verifyDeliveryOptionUrl();
        clickOnproductSafetyNotices();
        verifyProductSafetyUrl();
        clickOnReturn();
        verifyReturnsUrl();
        clickOnTrackYourOrder();
        verifyTrackYourOrderUrl();
        clickOnHelpCentre();
        verifyHelpCentreUrl();
        clickOnYourPrivacy();
        verifyYourPrivacyUrl();
        clickOnHowToComplain();
        verifyHowToComplainUrl();
        verifyAboutUs();
    }
}
