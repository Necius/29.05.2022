package Pages;

import org.openqa.selenium.WebElement;

// Sredi kod po logicnom redu

public class HomePage extends BasePage {

    private String ulazButton = "//a[@class = 'log_btn btn btn-success']";
    public WebElement getUlazButton() {
        return findElement(ulazButton);
    }

    private String uniCreditLink = "//li[@class = 'paycard_footer_item paycard_footer_unicredit pull-left']";
    public WebElement getUniCreditLink() {
        return findElement(uniCreditLink);
    }

    private String allSecureLink = "//li[@class = 'paycard_footer_item paycard_footer_allsecure pull-left']";
    public WebElement getAllSecurelink() {
        return findElement(allSecureLink);
    }

    private String masterCardLink = "//li[@class = 'paycard_footer_item paycard_footer_securemaster pull-right']";
    public WebElement getMasterCardLink() {
        return findElement(masterCardLink);
    }

    private String visaLink = "//li[@class = 'paycard_footer_item paycard_footer_vervisa pull-right']";

    public WebElement getVisaLink() {
        return findElement(visaLink);
    }

    private String ipayLink = "//li[@class = 'paycard_footer_item paycard_footer_ipay pull-right']";

    public WebElement getIpayLink() {
        return findElement(ipayLink);
    }

    private String izlazButton = "//*[text()='Izlaz']";
    public WebElement getIzlazButton() {
        return findElement(izlazButton);
    }




    private String traziField = "//input[@id = 'txtPretraga']";

    public WebElement getTraziField() {
        return findElement(traziField);
    }

    private String traziButton = "//button[@id = 'search_button']";

    public WebElement getTraziButton() {
        return findElement(traziButton);
    }

    private String traziButton2 = "//input[@id = 'search_button']";

    public WebElement getTraziButton2() {
        return findElement(traziButton2);
    }

    private String nemaPredmeta = "//*[contains(text(),'Trenutno nema predmeta')]";
    public WebElement getNemaPredmeta() {
        return findElement(nemaPredmeta);
    }

    private String kupiOdmahButton = "//*[text()='kupi odmah']";
    public WebElement getKupiOdmahButton() {
        return findElement(kupiOdmahButton);
    }

    private String popupDaljeButton = "//button[@class = 'hopscotch-bubble-close hopscotch-close']";
    public WebElement getPopupDaljeButton() {
        return findElement(popupDaljeButton);
    }

    private String firstItemMetallica = "//*[@id='container_right']/div[2]/a[1]";
    public WebElement getFirstItemMetallica(){
        return findElement(firstItemMetallica);
    }

    private String firstItem = "//*[@id='container_right']/div[3]";
    public WebElement getFirstItem(){
        return findElement(firstItem);
    }


    private String acceptCookies = "//button[@class = 'close close_info_cookies purple']";
    public WebElement getAcceptCookies (){
        return findElement(acceptCookies);
    }

    private String ulazTitle = "//button[@class = 'close close_info_cookies purple']";
    public WebElement getUlazTitle (){
        return findElement(ulazTitle);
    }

    private String breadCrumb = "//div[3]/div[2]/p/a[2][text()=' > metallica'";
    public WebElement getBreadCrumb (){
        return findElement(breadCrumb);
    }

    private String clanLink = "//*[@id='top_menu']/ul/li[2]/a";
    public WebElement getClanLink (){
        return findElement((clanLink));
    }

//    private String googlePlayLink = "a[@class = 'googleplay']";
//    public WebElement getGooglePlaylink(){
//        return findElement(googlePlayLink);
//    }
//
//    private String appStoreLink = "a[@class = 'googleplay']";
//    public WebElement getAppStorelink(){
//        return findElement(appStoreLink);
}
