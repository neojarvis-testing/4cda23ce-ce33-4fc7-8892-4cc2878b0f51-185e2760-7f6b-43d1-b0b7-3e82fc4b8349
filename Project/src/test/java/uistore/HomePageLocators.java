package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    //Sai Kiran Locators
    public static By Cookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static By aboutUs=By.cssSelector("li[class='yCmsComponent footer__link'] a[title='About us']");
    public static By home=By.cssSelector("a[title='Home']");
    public static By storeFinder=By.cssSelector("a[title='Store finder']");
    public static By WEERegulations=By.cssSelector("a[title='WEEE Regulations']");
    public static By press=By.cssSelector("a[title='Press']");
    public static By affilates=By.cssSelector("a[title='Affiliates']");
    public static By careers=By.cssSelector("a[title='Careers']");
    public static By giftCards = By.cssSelector("li[class='yCmsComponent footer__link'] a[title='Gift cards']");
    public static By explore=By.cssSelector("a[title='Explore']");
    public static By offers=By.cssSelector("a[title='Offers']");
    public static By searchbar=By.cssSelector("input[class='aa-Input form-control']");
    public static By serachIcon=By.cssSelector("//button[@class='aa-SubmitButton btn btn-link js_search_button']");
    public static By klarna=By.cssSelector("a[title='Klarna']");
    public static By usefulLinks=By.cssSelector("div[href='#footerNavList2']");

    //Akki Manith Locators
    public static By acceptAllCookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static By logo=By.cssSelector("img[title='Early Learning Centre']");
    // public static By shopByAge=By.cssSelector("a[title='Shop by age']");
    public static By shopByAge=By.xpath("//a[@title='Shop by age']");
    public static By newBornGifts=By.cssSelector("a[title='Newborn Gifts']");

    // public static By typeOfToy=By.cssSelector("a[title='Type of toy']");
    public static By typeOfToy=By.xpath("//a[@title='Type of toy']");
    public static By softToys=By.cssSelector("a[title='Soft Toys']");
}
