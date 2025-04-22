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
    //public static By explore=By.cssSelector("a[title='Explore']");
    public static By explore=By.xpath("//a[text()='Explore']");
    public static By offers=By.cssSelector("a[title='Offers']");
    public static By searchbar=By.cssSelector("input[class='aa-Input form-control']");
    public static By serachIcon=By.cssSelector("//button[@class='aa-SubmitButton btn btn-link js_search_button']");
    public static By klarna=By.cssSelector("a[title='Klarna']");
    public static By usefulLinks=By.cssSelector("div[href='#footerNavList2']");


    //Vipul Locators
    
    //TestCase 3
    public static By accept = By.id("onetrust-accept-btn-handler");
    public static By ElcLogo=By.cssSelector("div[class='banner__component banner']");
    // public static By Outdoortoys=By.cssSelector("a[title='Outdoor Toys']");
    public static By Outdoortoys=By.xpath("//a[@title='Outdoor Toys']");
    public static By Bikes=By.cssSelector("a[title='Bikes']");

    //testcase4

    // public static By Learningskills=By.cssSelector("span[class='yCmsComponent nav__link js_nav__link'] a[href='/c/learning-skills']");
    public static By Learningskills=By.xpath("(//a[@href='/c/learning-skills'])[1]");
    public static By creativity=By.cssSelector("a[href='/c/learning-skills/creativity']");
    







    
    
    //Akki Manith Locators
    public static By acceptAllCookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static By logo=By.cssSelector("img[title='Early Learning Centre']");
    // public static By shopByAge=By.cssSelector("a[title='Shop by age']");
    public static By shopByAge=By.xpath("//a[@title='Shop by age']");
    public static By newBornGifts=By.cssSelector("a[title='Newborn Gifts']");

    // public static By typeOfToy=By.cssSelector("a[title='Type of toy']");
    public static By typeOfToy=By.xpath("//a[@title='Type of toy']");
    public static By softToys=By.cssSelector("a[title='Soft Toys']");


    //Pratham
    //testcase8
    public static By popup = By.cssSelector(".dy-lb-close");
    public static By searchBar = By.id("autocomplete-0-input");
    //testcase9 
    public static By contactUs = By.cssSelector(" div[class='container-fluid'] a[href='https://theentertainer.zendesk.com/hc/en-gb/articles/6495305266833-Contact-Us']");
    public static By delivery = By.cssSelector(" div[class='container-fluid'] a[title='Delivery Options']");
    public static By productSafety = By.cssSelector(" div[class='container-fluid'] a[title='Product Safety Notices']");
    public static By returns = By.cssSelector(" div[class='container-fluid'] a[title='Returns']");
    public static By trackYourOrder = By.cssSelector("li[class='yCmsComponent footer__link']  a[href='/my-account/orders']");
    public static By helpCenter = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='Help Centre']");
    public static By privacyPolicy = By.cssSelector("li[class='yCmsComponent footer__link']  a[title=' Your Privacy']");
    public static By howToComplain = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='How To Complain']");
    public static By about = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='About us']");
}
