package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ElcCarsFirstProductLocator;
import uistore.ElcCarsHomePageLocator;
import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ElcCars {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public ElcCars(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test =test;
    }
    public void clickOnSearchBar(){
        try {
            helper.wait(HomePageLocators.searchBar);
            helper.clickOnElement(HomePageLocators.searchBar);
            LoggerHandler.info("Clicked on searchBar");
            test.log(Status.PASS, "Clicked on searchBar");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on searchBar");
            test.log(Status.FAIL, "Not able to click on searchBar");
        }
    }
    public void enterDataOnSearchBar(String value){
        try {
            helper.wait(HomePageLocators.searchBar);
            helper.sendData(HomePageLocators.searchBar,value);
            helper.enterAction(HomePageLocators.searchBar);
            LoggerHandler.info("Data entered on searchBar");
            test.log(Status.PASS, "Data entered on searchBar");
        } catch (Exception e) {
            LoggerHandler.error("Not able to enter data on searchBar");
            test.log(Status.FAIL, "Not able to enter data on searchBar");
        }
    }
    public void verifyCarUrl(){
        try {
            String x = Base.driver.getCurrentUrl();
            System.out.println(x);
            Assert.assertTrue(x.contains("Cars"));
            LoggerHandler.info("Verified Cars");
            test.log(Status.PASS, "Cars verified");
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Cars");
            test.log(Status.FAIL, "Cars not verified");
        }
    }
    public void clickOnShowMore(){
        try {
            helper.wait(ElcCarsHomePageLocator.showMore);
            helper.clickOnElement(ElcCarsHomePageLocator.showMore);
            LoggerHandler.info("Clicked on show more");
            test.log(Status.PASS, "Clicked on show more");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on show more");
            test.log(Status.FAIL, "Not able to click on show more");
        } 
    }
    public void clickOnToyCars(){
        try {
            helper.wait(ElcCarsHomePageLocator.toyCars);
            helper.clickOnElement(ElcCarsHomePageLocator.toyCars);
            LoggerHandler.info("Clicked on Toy Cars");
            test.log(Status.PASS, "Clicked on Toy Cars");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Toy Cars");
            test.log(Status.FAIL, "Not able to click on Toy Cars");
        } 
    }
    public void clickOnImaginativePlay(){
        try {
            helper.wait(ElcCarsHomePageLocator.imaginativePlay);
            helper.clickOnElement(ElcCarsHomePageLocator.imaginativePlay);
            LoggerHandler.info("Clicked on Imaginative Play");
            test.log(Status.PASS, "Clicked on Imaginative Play");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Imaginative Play");
            test.log(Status.FAIL, "Not able to click on Imaginative Play");
        } 
    }
    public void clickOnFineMotorSkills(){
        try {
            helper.wait(ElcCarsHomePageLocator.fineMotorSkills);
            helper.clickOnElement(ElcCarsHomePageLocator.fineMotorSkills);
            LoggerHandler.info("Clicked on Fine Motor Skill");
            test.log(Status.PASS, "Clicked on Fine Motor Skill");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Fine Motor Skill");
            test.log(Status.FAIL, "Not able to click on Fine Motor Skill");
        } 
    }
    public void clickOnFirstProduct(){
        try {
            helper.wait(ElcCarsHomePageLocator.firstProduct);
            helper.clickOnElement(ElcCarsHomePageLocator.firstProduct);
            LoggerHandler.info("Clicked on First Product");
            test.log(Status.PASS, "Clicked on First Product");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on First Product");
            test.log(Status.FAIL, "Not able to click on First Product");
        } 
    }
    public void clickOnWishList(){
        try {
            helper.wait(ElcCarsFirstProductLocator.wishlist);
            helper.clickOnElement(ElcCarsFirstProductLocator.wishlist);
            LoggerHandler.info("Clicked on Wishlist");
            test.log(Status.PASS, "Clicked on Wishlist");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Wishlist");
            test.log(Status.FAIL, "Not able to click on Wishlist");
        } 
    }
    public void back(){
        Base.driver.navigate().back();
    }
    public void cars(String value){
        clickOnSearchBar();
        enterDataOnSearchBar(value);
        verifyCarUrl();
        clickOnShowMore();
        clickOnToyCars();
        clickOnImaginativePlay();
        clickOnFineMotorSkills();
        clickOnFirstProduct();
        clickOnWishList();
        back();
    }

}
