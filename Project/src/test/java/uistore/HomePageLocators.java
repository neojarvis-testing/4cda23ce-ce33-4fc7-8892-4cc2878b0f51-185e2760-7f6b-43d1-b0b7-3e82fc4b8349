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


    //Vipul Locators
    //TestCase 3
    public static By accept = By.id("onetrust-accept-btn-handler");
    public static By ElcLogo=By.cssSelector("div[class='banner__component banner']");
    // public static By Outdoortoys=By.cssSelector("a[title='Outdoor Toys']");
    public static By Outdoortoys=By.xpath("//a[@title='Outdoor Toys']");
    public static By Bikes=By.cssSelector("a[title='Bikes']");

    //ProductPageLocator
    public static By Huffy=By.cssSelector("a[titsgshle='Huffy']");
    public static By ToddlerBike=By.cssSelector("span[class='facet__text']");
    public static By Disney=By.xpath("//span[@class='facet__list__text'and text()='Disney']");
    
    public static By VerifySearch=By.cssSelector("a[href='/brands']");
    //public static By firstproduct=By.cssSelector("div[class='details'] a[href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553'] ");
    public static By firstproduct=By.xpath("//img[@title='Huffy Disney Frozen 12']");

    //CartPageLocators
    public static By clickcollect=By.id("labelCCUnavailable");
    public static By addtocart=By.id("addToCartButton");
    public static By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static By addtobasket=By.cssSelector("#addToCartButton");
   
//testcase4

//HomePageLocator

// public static By Learningskills=By.cssSelector("span[class='yCmsComponent nav__link js_nav__link'] a[href='/c/learning-skills']");
public static By Learningskills=By.xpath("(//a[@href='/c/learning-skills'])[1]");
public static By creativity=By.cssSelector("a[href='/c/learning-skills/creativity']");
public static By artandcraft=By.xpath("//span[text()='Arts & Crafts']");
public static By creativityfilter=By.xpath("//span[text()='Creativity']");
public static By artfirstproduct=By.xpath("//a[text()='Early Learning Centre Ready Mix Paint Set 6 Pack']");
public static By verifyminutes=By.id("js-store-availability-text");








    
    
}
