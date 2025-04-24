package uistore;

import org.openqa.selenium.By;

public class LearningPageLocators {
    private LearningPageLocators(){}
    public static final By artandcraft=By.xpath("//span[text()='Arts & Crafts']");
    public static final By creativityfilter=By.xpath("//span[text()='Creativity']");
    public static final By artfirstproduct=By.xpath("//a[text()='Early Learning Centre Ready Mix Paint Set 6 Pack']");
    public static final By verifyminutes=By.id("js-store-availability-text");
    public static final By addtobasket=By.cssSelector("#addToCartButton");
    public static final By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
}
