package uistore;

import org.openqa.selenium.By;

public class HappyLandHomePageLocator {
    private HappyLandHomePageLocator(){}

    public static final By months=By.xpath("//span[text()='0 - 3 months']");
    public static final By happyland=By.xpath("(//a[text()='Happyland'])[2]");
    public static final By first=By.xpath("//a[text()='Happyland Sunny Farm Red Playset']");
    public static final By store=By.cssSelector("p[class='store-availability-text']");
    public static final By addcart=By.id("addToCartButton");
    public static final By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");

    public static final By showmore=By.cssSelector("button[class='ais-Menu-showMore facet__more']");
    public static final By jigsaw=By.xpath("//span[text()='Jigsaw Puzzles']");
    public static final By children=By.xpath("//span[contains(text(),'Children')]");
    //public static final By discover=By.cssSelector("input[value='Discover the world']");
    public static final By discover=By.xpath("//span[text()='Discover the world']");

    public static final By second=By.xpath("//a[text()='Early Learning Centre Snap The Animals']");
    public static final By wishlist=By.cssSelector("span[class='notInWishlist js-dy']");
    public static final By learning=By.xpath("//h3[text()='Get more from Early Learning Centre']");
}
