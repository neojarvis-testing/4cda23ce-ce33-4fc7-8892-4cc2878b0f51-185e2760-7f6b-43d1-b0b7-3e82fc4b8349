package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HappyLandHomePageLocator;
import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PuzzleHomePage {
    WebDriverHelper helper;
    ExtentTest test;
    public static final String sheetsName = "Sheet1";
    public static final String dirsPath = "/testData/ELCData.xlsx";
    public static final String userCommonPath ="user.dir" ;
    
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
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 2)));
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
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 1)));
        LoggerHandler.info("Clicked on SearchBar");
        test.log(Status.PASS,"Clicked on SearchBar");
        } catch (Exception e) {
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
    public void sendadata(){
        try {
            helper.sendData(HomePageLocators.searchbar,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 1, 0)); 
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 2)));
        LoggerHandler.info("Data sent on SearchBar");
        test.log(Status.PASS,"Data sent on SearchBar");
        } catch (Exception e) {
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
            String title=Base.driver.getTitle();
            Assert.assertTrue(title.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 3)));
        LoggerHandler.info("Puzzles entered on searchBar");
        test.log(Status.PASS,"Puzzles entered on searchBar");
        } catch (InterruptedException e) {
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
            String show=helper.getText(HappyLandHomePageLocator.showmore);
            Assert.assertTrue(show.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 4))); 
        LoggerHandler.info("Clicked on Showmore");
        test.log(Status.PASS,"Clicked on Showmore");
        } catch (Exception e) {
          LoggerHandler.error("Not able to Clicks on Showmore");
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
        String jigsaw=helper.getText(HappyLandHomePageLocator.jigsaw);
            Assert.assertTrue(jigsaw.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 5)));
        LoggerHandler.info("Clicked on jigsaw");
        test.log(Status.PASS,"Clicked on jigsaw");
        } catch (Exception e) {
          LoggerHandler.error("Not able to Clicked on the Showmore");
          test.log(Status.PASS,"Not able to Clicked on Showmore option");
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
        String children=helper.getText(HappyLandHomePageLocator.children);
            Assert.assertTrue(children.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 6)));
        LoggerHandler.info("Clicked on Children Games");
        test.log(Status.PASS,"Clicked on Children Games");
        } catch (Exception e) {
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
         String discover=helper.getText(HappyLandHomePageLocator.discover);
            Assert.assertTrue(discover.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 7)));
        LoggerHandler.info("Clicked on Discover");
        test.log(Status.PASS,"Clicked on Discover");
        } catch (Exception e) {
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
        String learning=helper.getText(HappyLandHomePageLocator.second);
            Assert.assertTrue(learning.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 8)));
        LoggerHandler.info("Clicked on PuzzleFirst Element");
        test.log(Status.PASS,"Clicked on First Element");
        } catch (Exception e) {
          LoggerHandler.error("Not able to Clicked on PuzzleFirstElement");
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
         String wish=helper.getText(HappyLandHomePageLocator.wishlist);
         Assert.assertTrue(wish.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 6, 0)));
        LoggerHandler.info("Clicked on Wishlist");
        test.log(Status.PASS,"Clicked on Wishlist");
        } catch (Exception e) {
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
            Assert.assertTrue(learning.contains(ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 5, 0)));

            Screenshot.captureScreenShot("learning");
            LoggerHandler.info("Text contains Learning");
            test.log(Status.INFO,"Text contains Learning");
            Screenshot.captureScreenShot("learning");
        } catch (Exception e) {
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
   public void output2(){
   
    clickAcceptCookies();
    clickOnSearch();
    sendadata();
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


