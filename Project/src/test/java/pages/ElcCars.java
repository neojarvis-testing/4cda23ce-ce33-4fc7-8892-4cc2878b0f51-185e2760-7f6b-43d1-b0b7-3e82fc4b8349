package pages;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.WebDriverHelper;

public class ElcCars {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public ElcCars(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test =test;
    }
    // public void 
}
