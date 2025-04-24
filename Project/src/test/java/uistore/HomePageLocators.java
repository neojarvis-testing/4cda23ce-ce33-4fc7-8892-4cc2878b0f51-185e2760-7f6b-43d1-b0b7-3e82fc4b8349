package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    private HomePageLocators(){}
    //Sai Kiran Locators
    public static final By Cookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static final By aboutUs=By.cssSelector("li[class='yCmsComponent footer__link'] a[title='About us']");
    public static final By home=By.cssSelector("a[title='Home']");
    public static final By storeFinder=By.cssSelector("a[title='Store finder']");
    public static final By WEERegulations=By.cssSelector("a[title='WEEE Regulations']");
    public static final By press=By.cssSelector("a[title='Press']");
    public static final By affilates=By.cssSelector("a[title='Affiliates']");
    public static final By careers=By.cssSelector("a[title='Careers']");
    public static final By giftCards = By.cssSelector("li[class='yCmsComponent footer__link'] a[title='Gift cards']");
   // public static final By explore=By.cssSelector("a[title='Explore']");
    
    public static final By explore=By.xpath("//a[text()='Explore']");
    public static final By offers=By.cssSelector("a[title='Offers']");
    public static final By searchbar=By.cssSelector("input[class='aa-Input form-control']");
    public static final By serachIcon=By.cssSelector("//button[@class='aa-SubmitButton btn btn-link js_search_button']");
    public static final By klarna=By.cssSelector("a[title='Klarna']");
    public static final By usefulLinks=By.cssSelector("div[href='#footerNavList2']");



    //Vipul Locators
    
    //TestCase 3
    public static final By accept = By.id("onetrust-accept-btn-handler");
    public static final By ElcLogo=By.cssSelector("div[class='banner__component banner']");
    // public static final By Outdoortoys=By.cssSelector("a[title='Outdoor Toys']");
    public static final By Outdoortoys=By.xpath("//a[@title='Outdoor Toys']");
    public static final By Bikes=By.cssSelector("a[title='Bikes']");

    //ProductPageLocator
    public static final By Huffy=By.cssSelector("a[titsgshle='Huffy']");
    public static final By ToddlerBike=By.cssSelector("span[class='facet__text']");
    public static final By Disney=By.xpath("//span[@class='facet__list__text'and text()='Disney']");
    public static final By VerifySearch=By.cssSelector("a[href='/brands']");
    //public static final By firstproduct=By.cssSelector("div[class='details'] a[href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553'] ");
    public static final By firstproduct=By.xpath("//img[@title='Huffy Disney Frozen 12']");

    //CartPageLocators
    public static final By clickcollect=By.id("labelCCUnavailable");
    public static final By addtocart=By.id("addToCartButton");
    public static final By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static final By addtobasket=By.cssSelector("#addToCartButton");
   
//testcase4

//HomePageLocator

// public static final By Learningskills=By.cssSelector("span[class='yCmsComponent nav__link js_nav__link'] a[href='/c/learning-skills']");
public static final By Learningskills=By.xpath("(//a[@href='/c/learning-skills'])[1]");
public static final By creativity=By.cssSelector("a[href='/c/learning-skills/creativity']");
public static final By artandcraft=By.xpath("//span[text()='Arts & Crafts']");
public static final By creativityfilter=By.xpath("//span[text()='Creativity']");
public static final By artfirstproduct=By.xpath("//a[text()='Early Learning Centre Ready Mix Paint Set 6 Pack']");
public static final By verifyminutes=By.id("js-store-availability-text");
    
    //Akki Manith Locators
    public static final By acceptAllCookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static final By logo=By.cssSelector("img[title='Early Learning Centre']");
    // public static final By shopByAge=By.cssSelector("a[title='Shop by age']");
    public static final By shopByAge=By.xpath("//a[@title='Shop by age']");
    public static final By newBornGifts=By.cssSelector("a[title='Newborn Gifts']");

    // public static final By typeOfToy=By.cssSelector("a[title='Type of toy']");
    public static final By typeOfToy=By.xpath("//a[@title='Type of toy']");
    public static final By softToys=By.cssSelector("a[title='Soft Toys']");


    //Pratham
    //testcase8
    public static final By popup = By.cssSelector(".dy-lb-close");
    public static final By searchBarHomePage = By.id("autocomplete-0-input");
    //testcase9 
    public static final By contactUs = By.cssSelector(" div[class='container-fluid'] a[href='https://theentertainer.zendesk.com/hc/en-gb/articles/6495305266833-Contact-Us']");
    public static final By delivery = By.cssSelector(" div[class='container-fluid'] a[title='Delivery Options']");
    public static final By productSafety = By.cssSelector(" div[class='container-fluid'] a[title='Product Safety Notices']");
    public static final By returns = By.cssSelector(" div[class='container-fluid'] a[title='Returns']");
    public static final By trackYourOrder = By.cssSelector("li[class='yCmsComponent footer__link']  a[href='/my-account/orders']");
    public static final By helpCenter = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='Help Centre']");
    public static final By privacyPolicy = By.cssSelector("li[class='yCmsComponent footer__link']  a[title=' Your Privacy']");
    public static final By howToComplain = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='How To Complain']");
    public static final By about = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='About us']");
}
