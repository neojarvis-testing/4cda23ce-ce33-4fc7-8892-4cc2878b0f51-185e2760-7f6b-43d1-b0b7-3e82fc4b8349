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
    public static By klarna=By.cssSelector("a[title='Klarna']");
    public static By usefulLinks=By.cssSelector("div[href='#footerNavList2']");



    //Pratham
    //testcase8
    public static By logo = By.cssSelector("img[title='Early Learning Centre']");
    public static By accept = By.id("onetrust-accept-btn-handler");
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
