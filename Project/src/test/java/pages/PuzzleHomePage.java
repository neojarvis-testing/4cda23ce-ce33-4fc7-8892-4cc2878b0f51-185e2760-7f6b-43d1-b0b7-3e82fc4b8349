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

public class PuzzleHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public PuzzleHomePage(){
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
    public void clickSearch(){
        try {
            helper.clickOnElement(HomePageLocators.searchbar); 
        LoggerHandler.info("Clicked on SearchBar");
        test.log(Status.PASS,"Clicked on SearchBar");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on SearchBar");
          test.log(Status.PASS,"Not able to Clicked on SearchBar");
        }
    }
    public void sendadata(){
        try {
            helper.sendData(HomePageLocators.searchbar,"Puzzles"); 
        LoggerHandler.info("Data sent on SearchBar");
        test.log(Status.PASS,"Data sent on SearchBar");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to sentdata SearchBar");
          test.log(Status.PASS,"Not able to sent data on SearchBar");
        }
    }
    public void performEnter(){
        try {
            helper.enterAction(HomePageLocators.searchbar); 
        LoggerHandler.info("Puzzles entered on searchBar");
        test.log(Status.PASS,"Puzzles entered on searchBar");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to enter value on searchbar");
          test.log(Status.PASS,"Not able to enter value on searchBar");
        }
    }

    public void clickShowmore(){
        try {
            helper.wait(HappyLandHomePageLocator.showmore);
            helper.clickOnElement(HappyLandHomePageLocator.showmore); 
        LoggerHandler.info("Clicked on Showmore");
        test.log(Status.PASS,"Clicked on Showmore");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on Showmore");
          test.log(Status.PASS,"Not able to Clicked on Showmore");
        }
    }
    public void clickJigsawPuzzle(){
        try {
        helper.clickOnElement(HappyLandHomePageLocator.jigsaw); 
        LoggerHandler.info("Clicked on Showmore");
        test.log(Status.PASS,"Clicked on Showmore");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on Showmore");
          test.log(Status.PASS,"Not able to Clicked on Showmore");
        }
    }

    public void clickChildren(){
        try {
        helper.wait(HappyLandHomePageLocator.children);
        helper.clickOnElement(HappyLandHomePageLocator.children); 
        LoggerHandler.info("Clicked on Children Games");
        test.log(Status.PASS,"Clicked on Children Games");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on Children Games");
          test.log(Status.PASS,"Not able to Clicked on Children Games");
        }
    } 
    public void clickDiscover(){
        try {
            helper.wait(HappyLandHomePageLocator.discover);
         helper.clickOnElement(HappyLandHomePageLocator.discover); 
        LoggerHandler.info("Clicked on Discover");
        test.log(Status.PASS,"Clicked on Discover");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on Discover");
          test.log(Status.PASS,"Not able to Clicked on Discover");
        }
    }
    public void clickFirst(){
        try {
        helper.wait(HappyLandHomePageLocator.second);
        helper.clickOnElement(HappyLandHomePageLocator.second); 
        LoggerHandler.info("Clicked on First Element");
        test.log(Status.PASS,"Clicked on First Element");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on FirstElement");
          test.log(Status.PASS,"Not able to Clicked on FirstElement");
        }
    }
    public void clickAddtoWishlist(){
        try {
        helper.wait(HappyLandHomePageLocator.wishlist);
         helper.clickOnElement(HappyLandHomePageLocator.wishlist); 
        LoggerHandler.info("Clicked on Wishlist");
        test.log(Status.PASS,"Clicked on Wishlist");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on WishList");
          test.log(Status.PASS,"Not able to Clicked on Wishlist");
        }
    }
    public void verifyLearning(){
        try {
            String learning=helper.getText(HappyLandHomePageLocator.learning);
            Assert.assertTrue(learning.contains("Learning"));
            Screenshot.captureScreenShot("learning");
            LoggerHandler.error("Text contains Learning");
            test.log(Status.PASS,"Text contains Learning");
            Screenshot.captureScreenShot("learning");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain Learning");
            test.log(Status.PASS,"Text not contain Learning");
        }
    }
   public void output2(){
    Base.driver.navigate().back();
    clickAcceptCookies();
    clickSearch();
    sendadata();
    performEnter();
    clickShowmore();
    clickJigsawPuzzle();
    clickChildren();
    clickDiscover();
    clickFirst();
    clickAddtoWishlist();
    verifyLearning();
   }
}


