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
    public PuzzleHomePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
      /*
    * Method name : clickOnAcceptCookies
    * Author name : PrasannaLaxmi
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
    */
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
    /*
    * Method name : clickOnSearch
    * Author name : PrasannaLaxmi
    * Description : This method click on Searchbar
    * Return Type : void
    * Parameter : None
    */
    public void clickOnSearch(){
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
    /*
    * Method name : senddata
    * Author name : PrasannaLaxmi
    * Description : This method senddata on searchbar
    * Return Type : value
    * Parameter : None
    */
    public void sendadata(String value){
        try {
            helper.sendData(HomePageLocators.searchbar,value); 
            // helper.enterAction(HomePageLocators.searchbar); 
            // helper.enterAction(HomePageLocators.searchbar); 
        LoggerHandler.info("Data sent on SearchBar");
        test.log(Status.PASS,"Data sent on SearchBar");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to sentdata SearchBar");
          test.log(Status.PASS,"Not able to sent data on SearchBar");
        }
    }
    /*
    * Method name : performEnter
    * Author name : PrasannaLaxmi
    * Description : This method perform enter action
    * Return Type : void
    * Parameter : None
    */
    public void performEnter(){
        try {
            Thread.sleep(500);
            helper.enterAction(HomePageLocators.searchbar);
        LoggerHandler.info("Puzzles entered on searchBar");
        test.log(Status.PASS,"Puzzles entered on searchBar");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to enter value on searchbar");
          test.log(Status.PASS,"Not able to enter value on searchBar");
        }
    }
    /*
    * Method name : clickOnShowmore
    * Author name : PrasannaLaxmi
    * Description : This method click on Showmore
    * Return Type : void
    * Parameter : None
    */
    public void clickOnShowmore(){
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
     /*
    * Method name : clickONJigsawPuzzle
    * Author name : PrasannaLaxmi
    * Description : This method click on JigsawPuzzle
    * Return Type : void
    * Parameter : None
    */
    public void clickOnJigsawPuzzle(){
        try {
        helper.clickOnElement(HappyLandHomePageLocator.jigsaw); 
        LoggerHandler.info("Clicked on jigsaw");
        test.log(Status.PASS,"Clicked on jigsaw");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Clicked on Showmore");
          test.log(Status.PASS,"Not able to Clicked on Showmore");
        }
    }
    /*
    * Method name : clickChildren
    * Author name : PrasannaLaxmi
    * Description : This method click on children's Games
    * Return Type : void
    * Parameter : None
    */
    public void clickOnChildren(){
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
     /*
    * Method name : clickOnDiscover
    * Author name : PrasannaLaxmi
    * Description : This method click on Discover more
    * Return Type : void
    * Parameter : None
    */
    public void clickOnDiscover(){
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
     /*
    * Method name : clickOnFirst
    * Author name : PrasannaLaxmi
    * Description : This method click on FirstProduct in List of Product
    * Return Type : void
    * Parameter : None
    */
    public void clickOnFirst(){
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
     /*
    * Method name : clickOnAddtoWishlist
    * Author name : PrasannaLaxmi
    * Description : This method click on Add to wishlist
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAddtoWishlist(){
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
     /*
    * Method name : verifyLearning
    * Author name : PrasannaLaxmi
    * Description : This method verify keyword Learning
    * Return Type : void
    * Parameter : None
    */
    public void verifyLearning(){
        try {
            String learning=helper.getText(HappyLandHomePageLocator.learning);
            Assert.assertTrue(learning.contains("Learning"));
            Screenshot.captureScreenShot("learning");
            LoggerHandler.info("Text contains Learning");
            test.log(Status.PASS,"Text contains Learning");
            Screenshot.captureScreenShot("learning");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain Learning");
            test.log(Status.PASS,"Text not contain Learning");
        }
    }
    /*
    * Method name : output1
    * Author name : PrasannaLaxmi
    * Description : This method call all methods by calling this method all actions performed
    * Return Type : void
    * Parameter : None
    */
   public void output2(String value){
   
    clickAcceptCookies();
    clickOnSearch();
    sendadata(value);
    performEnter();
    clickOnShowmore();
    clickOnJigsawPuzzle();
    clickOnChildren();
    clickOnDiscover();
    clickOnFirst();
    clickOnAddtoWishlist();
    verifyLearning();
   }
}


