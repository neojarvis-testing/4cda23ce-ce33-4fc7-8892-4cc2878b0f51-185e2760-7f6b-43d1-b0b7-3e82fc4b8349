package uistore;

import org.openqa.selenium.By;

public class SoftToysPageLocator {
    private SoftToysPageLocator(){}
    public static final By dolls=By.cssSelector("a[href='https://www.elc.co.uk/c/soft-toys?categories=Dolls']");
    public static final By softToysUnderToyType=By.cssSelector("a[href='https://www.elc.co.uk/c/soft-toys?categories=Soft%20Toys']");
    public static final By brands=By.xpath("//div[contains(text(),' Brands ')]");
    public static final By simulatingSenses=By.xpath("//span[text()='Stimulating senses']");
    public static final By firstProductSoftToys=By.cssSelector("div[class='details'] > a[href='/soft-toys/animal-plush/Early-Learning-Centre-Plush-Toy---Triceratops-Soft-Toy/p/560323']");
    public static final By homeDelivery=By.id("labelHomeDeliverySelected");
    public static final By addToBasket=By.cssSelector("button[id='addToCartButton']");
    public static final By continueShopping=By.cssSelector("a[href='javascript:window.location.reload(false)']");
    public static final By home=By.cssSelector("li > a[href='/']");
}
