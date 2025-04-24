package uistore;

import org.openqa.selenium.By;

public class OutdoorPageLocators {
    private OutdoorPageLocators(){}
     public static final By Huffy=By.cssSelector("a[titsgshle='Huffy']");
    public static final By ToddlerBike=By.cssSelector("span[class='facet__text']");
    public static final By Disney=By.xpath("//span[@class='facet__list__text'and text()='Disney']");
    
    public static final By VerifySearch=By.cssSelector("a[href='/brands']");
    //public static final By firstproduct=By.cssSelector("div[class='details'] a[href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553'] ");
    //public static final By firstproduct=By.xpath("//img[@title='Huffy Disney Frozen 12']");
    public static final By firstproduct=By.xpath("//a[@class='name clickedObjectIDsAfterSearch' and @href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553']");

    
    public static final By clickcollect=By.id("labelCCUnavailable");
    public static final By addtocart=By.id("addToCartButton");
    public static final By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static final By addtobasket=By.cssSelector("#addToCartButton");
}
