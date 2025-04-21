package uistore;

import org.openqa.selenium.By;

public class PawPatrol5Locators {
    public static By HoveronBrands = By.cssSelector("a[title='Brands']");
    public static By ClickOnPawPatrol = By.cssSelector("a[title='Paw Patrol']");
    public static By ClickPlaysetsActions = By.xpath("(//span[@class='facet__text'])[2]");
    public static By VerifyNarrow = By.cssSelector("h4[class='hidden-sm hidden-xs']");
    public static By clickOnSavings = By.xpath("//span[text()='Savings']");
    public static By ClickOnFirstProduct = By.cssSelector("div[class='details'] a[data-wasprice='49.99']");
    public static By VerifyAvailable = By.cssSelector("p[class='store-availability-text']");
    public static By ClickOnAddBasket = By.xpath("//button[@id='addToCartButton']");
    public static By ClickOnCheckOut = By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static By VerifyBasket = By.cssSelector("span[class='headline-text']");




    
}












// hover on brands $$("a[title='Brands']")
// click on $$("a[title='Paw Patrol']")
// verify the title Pawpatrol $$("h1[class='category-title']")
// click on playsets &Actions $x("(//span[@class='facet__text'])[2]")
// verify the narrow  $$("h4[class='hidden-sm hidden-xs']")
// click on savings   $x("//span[text()='Savings']")
// click on first product $$("div[class='details'] a[data-wasprice='49.99']")
// verify available $$("p[class='store-availability-text']")
// click on AddBasket $x("//button[@id='addToCartButton']")
// click on checkout $$("a[class='btn btn-primary btn-block add-to-cart-button']")
// verify basket $$("span[class='headline-text']")
