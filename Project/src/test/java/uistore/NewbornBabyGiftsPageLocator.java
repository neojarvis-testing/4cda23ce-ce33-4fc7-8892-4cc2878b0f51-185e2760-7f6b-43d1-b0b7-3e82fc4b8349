package uistore;

import org.openqa.selenium.By;

public class NewbornBabyGiftsPageLocator {
    private NewbornBabyGiftsPageLocator(){}
    // public static final By acceptAllCookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    // public static final By logo=By.cssSelector("img[title='Early Learning Centre']");
    // public static final By shopByAge=By.cssSelector("a[title='Shop by age']");
    // public static final By newBornGifts=By.cssSelector("a[title='Newborn Gifts']");
    // public static final By showMore=By.cssSelector("a[title='Newborn Gifts']");
    public static final By showMore=By.xpath("//button[@class='ais-Menu-showMore facet__more']");
    // public static final By babyActivityToys=By.cssSelector("a[href='https://www.elc.co.uk/c/shop-by-age/new-born-baby-gift-ideas?categories=Baby%20Activity%20Toys']");
    public static final By babyActivityToys=By.xpath("//span[text()='Baby Activity Toys']");
    public static final By earlyLearningCenter=By.xpath("//span[text()='Early Learning Centre']");
    public static final By handEyeCoordination=By.xpath("//span[text()='Hand eye coordination']");
    public static final By firstProduct=By.cssSelector("div[class='details'] > a[href='/baby-pre-school/rattles-and-teethers/Early-Learning-Centre-Octopus-Highchair-Spinner/p/554516']");
    public static final By standardDelivery=By.xpath("//p[contains(text(),'Standard Delivery')]");
    public static final By addToBasket=By.cssSelector("button[id='addToCartButton']");
    public static final By continueShopping=By.cssSelector("a[href='javascript:window.location.reload(false)']");
    public static final By home=By.cssSelector("li > a[href='/']");

}
