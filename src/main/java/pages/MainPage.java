package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private static class Locators{

        private static final By ok = By.xpath("//div[@id='user-location-popup']/div//a[@class='button user-confirm-location-button']");
        private final static By search = By.xpath("//div[@class='header-search evinent-search-container']//input[@type='search']"); //пошук
        private static final By searchClear = By.xpath("//i[@id='searchClear']/../following-sibling::input"); // кнопка "знайти"
        private static final By enterAccount = By.xpath("//div[@class='header__sub-user unselectable js-open-auth-popup']/div/p");
        private static final By clientButton = By.xpath("//div[@class='header__sub-buyers unselectable']/div/p");
        private static final By searchVoice = By.xpath("//i[@id='evinentSearchVoice']");
        private static final By yourСity = By.xpath("//div[@class='_VMOLI3']");//Це ваш населений пункт?
        private static final By yesButton = By.xpath("//button[@class='btn btn--xsmall btn--white _lyk2tB _DE7oBo']");//Так
        private static final By enterAccountEpicentr = By.xpath("//span[@class='header__login-opener-text']");//Увійти
        private static final By searchEpicentr = By.xpath("//form[@class='_a5MACe _zpwZpb header__search']/input");
        private static final By searchButtonEpicentr = By.xpath("//button[@class='_cvO7u1']");
        public static final By cookies  = By.xpath("//div[@class='c-notifier-btns']//label[@class='js-close c-notifier-btn']"); //Файли cookies AutoRia
        private static final By searchExtensionsAutoRia = By.xpath("//a[@class='ext-end']"); //Розширений пошук

    }

    private static class Label{
        private final static String url = "https://www.foxtrot.com.ua/";
        private static final String epicentr = "https://epicentrk.ua";
        private static final String gazobetonBlokEpicentr = "https://epicentrk.ua/ua/shop/gazobetonnyy-blok-baugut-600x200x300-mm-d-500.html";
        private static final String autoRia = "https://auto.ria.com/uk/";

    }

    public void searchByText(String text){
        elements.clickOnElementBy(Locators.ok);
        elements.sendKeysToElementBy(Locators.search,text);
        elements.clickOnElementBy(Locators.searchClear);

    }
    public void clickOnElement(){
        elements.clickOnElementBy(Locators.ok);
        elements.clickOnElementBy(Locators.enterAccount);
    }
    public void clickOnElementClientButton(){
        elements.clickOnElementBy(Locators.ok);
        elements.clickOnElementBy(Locators.clientButton);
    }
    public void clickOnCheckbox(){
        elements.clickOnElementBy(Locators.ok);
        elements.clickOnElementBy(Locators.enterAccount);
    }
    public void clickOnButtonSearchVoice(){
        elements.clickOnElementBy(Locators.ok);
        elements.clickOnElementBy(Locators.searchVoice);
    }
    public void clickOnButtonYourСity(){
        elements.clickOnElementBy(Locators.yesButton);
        elements.clickOnElementBy(Locators.enterAccountEpicentr);
    }
    public void searchByTextSearchEpicentr(String text){
        elements.clickOnElementBy(Locators.yesButton);
        elements.sendKeysToElementBy(Locators.searchEpicentr,text);
        elements.clickOnElementBy(Locators.searchButtonEpicentr);
    }
    public void clickOnButtonSearchExtensionsAutoRia(){
        elements.clickOnElementBy(Locators.cookies);
        elements.clickOnElementBy(Locators.searchExtensionsAutoRia);
    }




    public void openPage(){
        driver.get(Label.url);
    }
    public void openPageUrlEpicentr(){
        driver.get(Label.epicentr);
    }
    public void openPageUrlblockEpicentr(){ driver.get(Label.gazobetonBlokEpicentr); }
    public void openPageUrlAutoRia(){ driver.get(Label.autoRia); }

//
}
