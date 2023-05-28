package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.Locator;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    public static class Locators{
        private static final By nextButton = By.xpath("//button[@id='auth-next-button']");
        private static final By buyButton = By.xpath("//div[@data-id='8786']//i[@class='icon-shop']"); //кнопка купить ////div[@id='cartTooltip']//a[@class='button-link']
        private static final By sortingFromExpensive = By.xpath("//ul[@class='listing__body-sort']//li[@class='sort-item '][1]"); //сортировка от дорогих
        private static final By addToCart = By.xpath("//div[@id='cartTooltip']//a[@class='button-link']"); //перейти в корзину
        private static final By itemInCart = By.xpath("//div[@class='shop-cart__item-product ']"); //товар в корзине
        private static final By searchResultText = By.xpath("//h1[@class='with-counter']");
        public static final By tooltipMenu = By.xpath("//div[@class='tooltip tooltip_active']");
        public static final By popUpWindow = By.xpath("//div[@class='evinent-voice-text-container']/span");
        public static final By price = By.xpath("//div[@class='listing__sidebar-col price']"); //элемент с ползунком "цена"
        public static final By sourceElement = By.xpath("//div[@class='noUi-handle noUi-handle-lower']"); //элемент исходной точки
        public static final By targetElement = By.xpath("//span[@class='irs-handle to']"); //элемент конечной точки
        public static final By windowPriceFrom = By.xpath("//input[@id='range-field-from']"); //окошко цена от
        public static final By windowPriceUpTo = By.xpath("//input[@id='range-field-from']"); //окошко цена до
        public static final By okButton = By.xpath("//input[@class='listing__sidebar-range-submit button btn-submit']"); //кнопка ок при выборе цены
        public static final By allBrandsOfPhones = By.xpath("//div[@id='group-69973']//following-sibling::div"); //все марки телефонов
        public static final By extendedButton = By.xpath("//div[@id='group-69973']/..//a[@class='more__properties button-link closed']"); //кнопка "ще"
        public static final By registrationEpicentr = By.xpath("//a[@class='link link--big link--inverted']"); //Реєстрація Epicentr
        public static final By personalPhone = By.xpath("//input[@id='PERSONAL_PHONE']"); //поле ввода номера телефон
        public static final By textError = By.xpath("//label[@id='PERSONAL_PHONE-error']"); //текст под полем "телефон"
        public static final By submitInput = By.xpath("//input[@id='submit_input']"); //кнопка "Продовжити"
        public static final By searchEpicentr = By.xpath("//input[@class='_JcImSJ']"); //поле поска "Эпицентр"
        public static final By searchButtonEpicentr = By.xpath("//button[@class='_cvO7u1']"); //кнопка "поиск"
        public static final By searchResultFieldProduct = By.xpath("//span[@class='search-results__searched-query']"); //поле с выбранным по запросу товаром товаром
        public static final By searchResultPageEpicentr = By.xpath("//h1[@class='nc']"); //страница, которая открылась в результате поиска
        public static final By newsSubscriptionWindow = By.xpath("//div[@class='input-wrapper']//input[@class='input']"); //поле "Підписуйтесь, щоб дізнаватись першим про акції та пропозиції"
        public static final By newsSubscriptionButton = By.xpath("//button[@class='btn btn--yellow _r4Kphw']"); // кнопка Підписуйтесь
        public static final By textErrorFormatEmail  = By.xpath("//span[@class='_LaIW5l']"); //текст под полем "Email"
        public static final By passwordField  = By.xpath("//input[@id='PASSWORD']"); //поле ввода пароля
        public static final By textInstructionsPasswordField  = By.xpath("//span[@class='input-wrapper__password-validate-title']"); //текст под полем "пароль"
        public static final By compareProductButton  = By.xpath("//span[@class='header__compare-link-icon']"); //кнопка "сравнить товар"
        public static final By addToCompareButton  = By.xpath("//a[@class='btn js-tooltip-bottom']"); //кнопка "добавить к сравнению"
        public static final By chooseAProduct  = By.xpath("//p[@class='custom-product-card__product-name-link']//a[@class='link link--big link--inverted']"); //выбрать товар
        public static final By blockSize1  = By.xpath("//nav[@class='p-models__list']//a[1]"); //размер блока1
        public static final By blockSize2  = By.xpath("//nav[@class='p-models__list']//a[2]"); //размер блока2
        public static final By priceBlocks  = By.xpath("//div[@class='p-price__main']"); //стоимость блоков
        public static final By listOfCountries  = By.xpath("//select[@id='at_country']"); //Країна виробник
        public static final By France  = By.xpath("//select[@id='at_country']/option[4]");
        public static final By Germany  = By.xpath("//select[@id='at_country']/option[2]");
        public static final By Japan  = By.xpath("//select[@id='at_country']/option[3]");
        public static final By searchButtonAutoRia  = By.xpath("//button[@class='button small']"); //кнопка поиск
        public static final By numberOfCarsFound  = By.xpath("//div[@class='search-result fixed-shadow']//label[@class='label']"); //Знайдено 208 047 авто
        public static final By wagon  = By.xpath("//input[@id='body.id[2]']"); //Тип кузова универсал //div[@class='boxed checked-list three-col']//label[@for='body.id[2]']
        public static final By sedan  = By.xpath("//input[@id='body.id[3]']"); //Тип кузова седан
        public static final By hatchback  = By.xpath("//input[@id='body.id[4]']"); //Тип кузова Хетчбек
        public static final By usedAuto  = By.xpath("//div[@id='indexNameWrapper']/label[@class='radio-btn'][2]"); //авто б/у
        public static final By newCars  = By.xpath("//div[@id='indexNameWrapper']/label[@class='radio-btn'][3]"); //авто новые
        public static final By allCars  = By.xpath("//div[@id='indexNameWrapper']/label[@class='radio-btn'][1]"); //все автомобили
        public static final By numberOfCarsFoundNew  = By.xpath("//span[@id='floatingSearchResultsCount']"); //Знайдено 208 047 авто
        public static final By selectCategory  = By.xpath("//select[@id='category']");
        public static final By selectBox  = By.xpath("//div[@class='field-area']"); //поле выбора
        public static final By searchAutoRia  = By.xpath("//div[@id='brandTooltipBrandAutocomplete-brand']//label[@class='text']"); //поле поиска марки авто
        private static final By searchAutoRiaButton = By.xpath("//button[@class='button full']"); // пошук
        private static final By resultPageAutoRia = By.xpath("//div[@id='headerPage']");
        private static final By resultPageAutoRiaNew = By.xpath("//div[@class='header-page mb-20']");
        public static final By cookies  = By.xpath("//div[@class='c-notifier-btns']//label[@class='js-close c-notifier-btn']"); //Файли cookies AutoRia



    }

    private static class Label{
        private final static String partOfUrlText = "Смартфони";
        private final static String popUpWindowText = "Говоріть...";
        private final static String textEnterErrorPhone1 = "поле обов'язкове";
        private final static String textEnterErrorPhone2 = "невірний формат телефону";
        private final static String textErrorFormatEmail = "невірний формат email";
        private final static String textSearchResultPageEpicentr = "Газобетонний блок";
        private final static String textInstructionsPass = "Ваш пароль повинен містити:\n" +
                "Мінімум 8 символів\n" +
                "Великі (A-Z) і малі (a-z) латинські літери\n" +
                "Мінімум одне число\n" +
                "Знаки пунктуації (,. <> /?;: '\"[] {} \\ |` ~! @ # $% ^ & * () -_ + =)";
        private final static String textPriceBlock1 = "40";
        private final static String textPriceBlock2 = "160";
        private final static String textSelectCategory = "Усі типи транспорту\n" + "Легкові\n" + "Мото\n" + "Вантажівки\n" +
                "Причепи\n" + "Спецтехніка\n" + "Сільгосптехніка\n" + "Автобуси\n" + "Водний транспорт\n" +
                "Повітряний транспорт\n" + "Автобудинки";
        private final static String textAllAuto = "Всі\n" + "×";
        private final static String textNewAuto = "Нові авто";
        private final static String textResultPageEpicentr = "\"ЛОГИКА\"";
        private final static String textResultPageEpicentrNew = "\"ДИРЕКТОР\"";
        private final static String textResultPageAutoRiaNew = "Пошук нових автомобілів в Україні";
    }

    public void searchListOfAllPhoneBrands(){
        waiters.waitElementToBeClickable(Locators.allBrandsOfPhones);
        elements.clickOnElementBy(Locators.allBrandsOfPhones);
        elements.clickOnElementBy(Locators.extendedButton);
        char[] chars = elements.getTextFromElementBy(Locators.allBrandsOfPhones).toCharArray();
        String stroka = String.valueOf(chars);//превращаем массив в строку
        System.out.println(stroka.replaceAll("[0-9]", "").replace("\n", " "));//заменяем цыфры пробелами, получаем список без цыфр
        String strokaNew = stroka.replaceAll("[0-9]", "").replace("\n", " ");
        int countStr = 0;
        for (int i = 0; i < strokaNew.length(); i++) {
            if (strokaNew.charAt(i) == ' ') {
                countStr++;
            }
        }
        System.out.println("Количество моделей телефонов = " + (countStr+1)/2);
        int num = (countStr+1)/2;
        assertEquals(num, 21, "Кол-во торговых марок не совпадает с ожиданием");
    }
    public void listOfServices(){
        System.out.println(elements.getTextFromElementBy(Locators.tooltipMenu));
    }
    public void clickOnButtonSearchVoice(){
        waiters.waitForVisabilityOfElement(Locators.popUpWindow);
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.popUpWindow), Label.popUpWindowText);
    }
    public void clickOnButtonPersonalPhone(String text){
        elements.clickOnElementBy(Locators.registrationEpicentr);
        elements.clickOnElementBy(Locators.submitInput);
        waiters.waitForVisabilityOfElement(Locators.textError);
        System.out.println(elements.getTextFromElementBy(Locators.textError));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.textError), Label.textEnterErrorPhone1);
        elements.sendKeysToElementBy(Locators.personalPhone,text);
        elements.clickOnElementBy(Locators.personalPhone);
        elements.clickOnElementBy(Locators.submitInput);
        System.out.println(elements.getTextFromElementBy(Locators.textError));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.textError), Label.textEnterErrorPhone2);
    }
    public void clickOnButtonNewsSubscriptionWindow(){
        elements.clickOnElementBy(Locators.registrationEpicentr);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,300)");
        elements.clickOnElementBy(Locators.newsSubscriptionButton);
        waiters.waitForVisabilityOfElement(Locators.textErrorFormatEmail);
        System.out.println(elements.getTextFromElementBy(Locators.textErrorFormatEmail));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.textErrorFormatEmail), Label.textErrorFormatEmail);
    }
    public void clickOnPasswordField(String text){
        elements.clickOnElementBy(Locators.registrationEpicentr);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)");
        waiters.waitForVisabilityOfElement(Locators.passwordField);
        elements.sendKeysToElementBy(Locators.passwordField,text);
        waiters.waitForVisabilityOfElement(Locators.textInstructionsPasswordField);
        System.out.println(elements.getTextFromElementBy(Locators.textInstructionsPasswordField));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.textInstructionsPasswordField), Label.textInstructionsPass);
    }
    public void searchByTextPageEpicentr() {
        waiters.waitForVisabilityOfElement(Locators.searchResultPageEpicentr);
        System.out.println(elements.getTextFromElementBy(Locators.searchResultPageEpicentr));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.searchResultPageEpicentr), Label.textSearchResultPageEpicentr);
    }
    public void searchByTextFieldProductEpicentr(String text) {
        waiters.waitForVisabilityOfElement(Locators.searchEpicentr);
        elements.sendKeysToElementBy(Locators.searchEpicentr,text);
        waiters.waitForVisabilityOfElement(Locators.searchResultFieldProduct);
        System.out.println(elements.getTextFromElementBy(Locators.searchResultFieldProduct));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.searchResultFieldProduct), Label.textResultPageEpicentr);
    }
    public void searchByTextFieldProductEpicentrNew(String text) {
        waiters.waitForVisabilityOfElement(Locators.searchEpicentr);
        elements.sendKeysToElementBy(Locators.searchEpicentr,text);
        waiters.waitForVisabilityOfElement(Locators.searchResultFieldProduct);
        System.out.println(elements.getTextFromElementBy(Locators.searchResultFieldProduct));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.searchResultFieldProduct), Label.textResultPageEpicentrNew);
    }

    public void checkItemPrice() {
        waiters.waitForVisabilityOfElement(Locators.blockSize1);
        elements.clickOnElementBy(Locators.blockSize1);
        System.out.println(elements.getTextFromElementBy(Locators.priceBlocks));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.priceBlocks), Label.textPriceBlock1);
        elements.clickOnElementBy(Locators.blockSize2);
        waiters.waitForVisabilityOfElement(Locators.priceBlocks);
        System.out.println(elements.getTextFromElementBy(Locators.priceBlocks));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.priceBlocks), Label.textPriceBlock2);
    }
    public void elementsClickabilityAutoRia() {
        waiters.waitForVisabilityOfElementReturn(Locators.wagon);
        assertions.elementToBeClikable(Locators.wagon);
        waiters.waitForVisabilityOfElementReturn(Locators.sedan);
        assertions.elementToBeClikable(Locators.sedan);
        waiters.waitForVisabilityOfElementReturn(Locators.hatchback);
        assertions.elementToBeClikable(Locators.hatchback);
    }
    public void textMatchesSearchAutoRia() {
        waiters.waitForVisabilityOfElementReturn(Locators.searchButtonAutoRia);
        elements.clickOnElementBy(Locators.searchButtonAutoRia);
        waiters.waitForVisabilityOfElementReturn(Locators.selectCategory);
        List<WebElement> selectCategoryCar = driver.findElements(Locators.selectCategory);
        for (WebElement сountries : selectCategoryCar) {
            System.out.println(сountries.getText());
            assertions.equalsOfStrings(сountries.getText(), Label.textSelectCategory);
        }
    }
    public void selectionTextFieldAutoRia(){
        waiters.waitForVisabilityOfElementReturn(Locators.searchButtonAutoRia);
        elements.clickOnElementBy(Locators.searchButtonAutoRia);
        waiters.waitElementToBeClickableReturn(Locators.selectBox);
        elements.clickOnElementBy(Locators.selectBox);
        System.out.println(elements.getTextFromElementBy(Locators.selectBox));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.selectBox), Label.textAllAuto);
        waiters.waitElementToBeClickableReturn(Locators.newCars);
        elements.clickOnElementBy(Locators.newCars);
        waiters.waitElementToBeClickableReturn(Locators.selectBox);
        elements.clickOnElementBy(Locators.selectBox);
        System.out.println(elements.getTextFromElementBy(Locators.selectBox));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.selectBox), Label.textNewAuto);
    }
    public void textSearchResultPageAutoRia() {
        elements.clickOnElementBy(Locators.cookies);
        waiters.waitElementToBeClickableReturn(Locators.searchAutoRiaButton);
        elements.clickOnElementBy(Locators.searchAutoRiaButton);
        waiters.waitElementToBeClickableReturn(Locators.resultPageAutoRia);
        System.out.println(elements.getTextFromElementBy(Locators.resultPageAutoRia));
        elements.clickOnElementBy(Locators.newCars);
        waiters.waitElementToBeClickableReturn(Locators.resultPageAutoRiaNew);
        System.out.println(elements.getTextFromElementBy(Locators.resultPageAutoRiaNew));
        assertions.equalsOfStrings(elements.getTextFromElementBy(Locators.resultPageAutoRiaNew), Label.textResultPageAutoRiaNew);
    }




}
