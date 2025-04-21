package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.NewbornBabyGiftsPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NewbabyBornGiftsPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public NewbabyBornGiftsPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickAcceptCookies(){
        try {
            helper.wait(HomePageLocators.acceptAllCookies);
            helper.clickOnElement(HomePageLocators.acceptAllCookies);
            test.log(Status.PASS, "Clicked on Accept Cookies");
            LoggerHandler.info("Clicked on Accept Cookies");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Accept Cookies");
            LoggerHandler.error("Not clicked on Accept Cookies");
        }
    }
    public void verifyLogo(){
        try {
            String data=helper.getText(HomePageLocators.logo);
            Assert.assertEquals(data, "early learning centre");
            test.log(Status.PASS, "Verified logo");
            LoggerHandler.info("Verified logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified logo");
            LoggerHandler.error("Not verified logo");
        }
    }
    public void hoverShopByAge(){
        try {
            helper.wait(HomePageLocators.shopByAge);
            helper.hoverOverElement(HomePageLocators.shopByAge);
            test.log(Status.PASS, "Hovered Shop by age");
            LoggerHandler.info("Hovered Shop by age");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not hovered Shop by age");
            LoggerHandler.error("Not hovered Shop by age");
        }
    }
    public void clickNewbornGifts(){
        try {
            helper.wait(HomePageLocators.newBornGifts);
            helper.clickOnElement(HomePageLocators.newBornGifts);
            test.log(Status.PASS, "Clicked on Newborn Gifts");
            LoggerHandler.info("Clicked Newborn Gifts");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Newborn Gifts");
            LoggerHandler.error("Not clicked Newborn Gifts");
        }
    }
    public void verifyURL(){
        try {
            String data=Base.driver.getCurrentUrl();
            Assert.assertEquals(data, "new-born-baby-gift-ideas");
            test.log(Status.PASS, "Verified URL");
            LoggerHandler.info("Verified URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified URL");
            LoggerHandler.error("Not verified URL");
        }
    }
    public void clickShowMore(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.showMore);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.showMore);
            test.log(Status.PASS, "Clicked on Show More");
            LoggerHandler.info("Clicked on Show More");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Show More");
            LoggerHandler.error("Not clicked on Show More");
        }
    }
    public void clickBabyActivityToys(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.babyActivityToys);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.babyActivityToys);
            test.log(Status.PASS, "Clicked on Baby Activity Toys");
            LoggerHandler.info("Clicked on Baby Activity Toys");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Baby Activity Toys");
            LoggerHandler.error("Not clicked on Baby Activity Toys");
        }
    }
    public void clickEarlyLearningCentre(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.earlyLearningCenter);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.earlyLearningCenter);
            test.log(Status.PASS, "Clicked on Early Learning Centre");
            LoggerHandler.info("Clicked on Early Learning Centre");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Early Learning Centre");
            LoggerHandler.error("Not clicked on Early Learning Centre");
        }
    }
    public void clickHandEyeCoordination(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.handEyeCoordination);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.handEyeCoordination);
            test.log(Status.PASS, "Clicked on Hand eye coordination");
            LoggerHandler.info("Clicked on Hand eye coordination");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Hand eye coordination");
            LoggerHandler.error("Not clicked on Hand eye coordination");
        }
    }
    public void clickFirstProduct(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.firstProduct);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.firstProduct);
            test.log(Status.PASS, "Clicked on First product");
            LoggerHandler.info("Clicked on First product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on First product");
            LoggerHandler.error("Not clicked on First product");
        }
    }
    public void verifyStandardDelivery(){
        try {
            String data=helper.getText(NewbornBabyGiftsPageLocator.standardDelivery);
            Assert.assertEquals(data, "Standard Delivery");
            test.log(Status.PASS, "Verified text Standard Deliver");
            LoggerHandler.info("Verified text Standard Delivery");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Standard Deliver");
            LoggerHandler.error("Not verified text Standard Delivery");
        }
    }
    public void clickAddToBasket(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.addToBasket);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.addToBasket);
            test.log(Status.PASS, "Clicked on Add to Basket");
            LoggerHandler.info("Clicked on Add to Basket");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Add to Basket");
            LoggerHandler.error("Not clicked on Add to Basket");
        }
    }
    public void clickContinueShopping(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.continueShopping);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.continueShopping);
            test.log(Status.PASS, "Clicked on Continue Shopping");
            LoggerHandler.info("Clicked on Continue Shopping");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Continue Shopping");
            LoggerHandler.error("Not clicked on Continue Shopping");
        }
    }
    public void verifyHome(){
        try {
            String data=helper.getText(NewbornBabyGiftsPageLocator.home);
            Assert.assertEquals(data, "Home");
            test.log(Status.PASS, "Verified text Home");
            LoggerHandler.info("Verified text Standard Home");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Home");
            LoggerHandler.error("Not verified text Home");
        }
    }
    public void NewbabyBornGiftsPageTest(){
        clickAcceptCookies();
        verifyLogo();
        hoverShopByAge();
        clickNewbornGifts();
        verifyURL();
        clickShowMore();
        clickBabyActivityToys();
        clickEarlyLearningCentre();
        clickHandEyeCoordination();
        clickFirstProduct();
        verifyStandardDelivery();
        clickAddToBasket();
        clickContinueShopping();
        verifyHome();
    }
}
