package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class OutdoorToysPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public OutdoorToysPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver);
        this.test=test;


    }

    public void hoveronoutdoortoys()
    {
        try {
            helper.wait(HomePageLocators.Outdoortoys);
            helper.hoverOverElement(HomePageLocators.Outdoortoys);
            test.log(Status.PASS, "Hovered on toys");
            LoggerHandler.info("Hovered on toys");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Hovered on toys");
            LoggerHandler.info("Not Hovered on toys");
        }

    }
    public void ClickonBikes()
    {
        try {
            helper.wait(HomePageLocators.Bikes);
            helper.clickOnElement(HomePageLocators.Bikes);
            test.log(Status.PASS, "Clicked on bikes");
            LoggerHandler.info("Clicked on bikes");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on bikes");
            LoggerHandler.info("Not Clicked on bikes");
        }

    }

    public void bikesurlverify()
    {
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains("bikes"));
            test.log(Status.PASS, "Contains bikes");
            LoggerHandler.info("Contains bikes");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Contains bikes");
            LoggerHandler.info("Not Contains bikes");
        }
    }

    public void Clickonhuffy()
    {
        try {
            helper.wait(HomePageLocators.Huffy);
            helper.clickOnElement(HomePageLocators.Huffy);
            test.log(Status.PASS, "Clicked on Huffy");
            LoggerHandler.info("Clicked on Huffy");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on Huffy");
            LoggerHandler.info("Not Clicked on Huffy");
        }

    }

    public void ClickonToddlerBikes()
    {
        try {
            helper.wait(HomePageLocators.ToddlerBike);
            helper.clickOnElement(HomePageLocators.ToddlerBike);
            test.log(Status.PASS, "Clicked on ToddlerBike");
            LoggerHandler.info("Clicked on ToddlerBike");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on ToddlerBike");
            LoggerHandler.info("Not Clicked on ToddlerBike");
        }

    }

    public void searchverify()
    {
        try {
            String text=helper.getText(HomePageLocators.VerifySearch);
            Assert.assertTrue(text.contains("Search"));
            test.log(Status.PASS, "Verified Search");
            LoggerHandler.info("Verified Search");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified Search");
            LoggerHandler.info("Not Verified Search");
        }
    }

    public void Clickondisney()
    {
        try {
            helper.wait(HomePageLocators.Disney);
            helper.clickOnElement(HomePageLocators.Disney);
            test.log(Status.PASS, "Clicked on Disney");
            LoggerHandler.info("Clicked on Disney");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on Disney");
            LoggerHandler.info("Not Clicked on Disney");
        }

    }
    public void FirstProduct()
    {
        try {
            helper.wait(HomePageLocators.firstproduct);
            helper.clickOnElement(HomePageLocators.firstproduct);
            test.log(Status.PASS, "Clicked on firstproduct");
            LoggerHandler.info("Clicked on firstproduct");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on firstproduct");
            LoggerHandler.info("Not Clicked on firstproduct");
        }

    }

    


}
