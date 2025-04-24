package uistore;

import org.openqa.selenium.By;

public class PawPatrol5Locators {
    private PawPatrol5Locators(){}
    public static final By HoveronBrands = By.xpath("//a[@title='Brands']");
    public static final By ClickOnPawPatrol = By.cssSelector("a[title='Paw Patrol']");
    public static final By ClickPlaysetsActions = By.xpath("(//span[@class='facet__text'])[2]");
    public static final By VerifyNarrow = By.cssSelector("h4[class='hidden-sm hidden-xs']");
    public static final By clickOnSavings = By.xpath("//span[text()='Savings']");
    public static final By ClickOnFirstProduct = By.cssSelector("div[class='details'] a[data-wasprice='49.99']");
    public static final By VerifyAvailable = By.cssSelector("p[class='store-availability-text']");
    public static final By ClickOnAddBasket = By.xpath("//button[@id='addToCartButton']");
    public static final By ClickOnCheckOut = By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static final By VerifyBasket = By.cssSelector("div[class='dy-overlay__item-content-button']");




    
}











