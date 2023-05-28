import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.SearchResultPage;
import pages.SearchResultPopUpWindow;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ManePageTests  extends BaseTest{

    @Test
    public void testSearchListOfAllPhoneBrands() {
        String input = "Смартфони";
        mainPage.openPage();
        mainPage.searchByText(input);
        searchResultPage.searchListOfAllPhoneBrands();
    }
    @Test
    public void testElementClickability(){
        String text = "0975550022";
        mainPage.openPage();
        mainPage.clickOnElement();
        searchResultPopUpWindow.searchByText(text);
        searchResultPopUpWindow.elementClickability();
    }
    @Test
    public void testListOfServices(){
        String[] textOfTooltip = {"Магазини працюють", "Обмін і повернення", "Інформація про оплату", "Подарункові картки", "Розпродаж\n" +
                "  до -80%", "Про нас", "Замовити відеоконсультацію", "Контакти", "ФоксFan", "Сервісна мережа", "Допомога ЗСУ"};
        List<WebElement> textsTooltipMenu = driver.findElements(SearchResultPage.Locators.tooltipMenu);
        mainPage.openPage();
        mainPage.clickOnElementClientButton();
        searchResultPage.listOfServices();
        for (int i = 0; i < textsTooltipMenu.size(); i++) {
            assertEquals(textsTooltipMenu.get(i).getText(), textOfTooltip[i]);
        }
    }
    @Test
    public void testCheckboxClickability(){
        mainPage.openPage();
        mainPage.clickOnCheckbox();
        searchResultPopUpWindow.checkboxClickability();
    }
    @Test
    public void testSearchVoiceButton(){
        mainPage.openPage();
        mainPage.clickOnButtonSearchVoice();
        searchResultPage.clickOnButtonSearchVoice();
    }
    @Test
    public void testCheckingTextForInvalidInput(){
        String text = "0000000000";
        mainPage.openPageUrlEpicentr();
        mainPage.clickOnButtonYourСity();
        searchResultPage.clickOnButtonPersonalPhone(text);
    }
    @Test
    public void fieldTestForInvalidTextInput(){
        mainPage.openPageUrlEpicentr();
        mainPage.clickOnButtonYourСity();
        searchResultPage.clickOnButtonNewsSubscriptionWindow();
    }
    @Test
    public void TestInputTextInputPasswordField(){
        String text = "qwerty";
        mainPage.openPageUrlEpicentr();
        mainPage.clickOnButtonYourСity();
        searchResultPage.clickOnPasswordField(text);
    }

    @Test
    public void testPriceProductChange(){
        String text = "Газобетонний блок";
        mainPage.openPageUrlEpicentr();
        mainPage.searchByTextSearchEpicentr(text);
        searchResultPage.searchByTextPageEpicentr();
    }
    @Test
    public void testTextFieldProductEpicentr(){
        String text = "логика";
        mainPage.openPageUrlEpicentr();
        mainPage.searchByTextSearchEpicentr(text);
        searchResultPage.searchByTextFieldProductEpicentr(text);
    }
    @Test
    public void testTextFieldProductEpicentrNew(){
        String text = "директор";
        mainPage.openPageUrlEpicentr();
        mainPage.searchByTextSearchEpicentr(text);
        searchResultPage.searchByTextFieldProductEpicentrNew(text);
    }
    @Test
    public void productPriceChangeTest(){
        mainPage.openPageUrlblockEpicentr();
        searchResultPage.checkItemPrice();
    }
    @Test
    public void testElementClickabilityAutoRia(){
        mainPage.openPageUrlAutoRia();
        mainPage.clickOnButtonSearchExtensionsAutoRia();
        searchResultPage.elementsClickabilityAutoRia();
    }
    @Test
    public void testTextOfRegistrationErrorWarningAutoRia(){
        mainPage.openPageUrlAutoRia();
        mainPage.clickOnButtonSearchExtensionsAutoRia();
        searchResultPage.textMatchesSearchAutoRia();
    }
    @Test
    public void testSelectionTextFieldAutoRia(){
        mainPage.openPageUrlAutoRia();
        mainPage.clickOnButtonSearchExtensionsAutoRia();
        searchResultPage.selectionTextFieldAutoRia();
    }
    @Test
    public void testAutoRia(){
        mainPage.openPageUrlAutoRia();
        searchResultPage.textSearchResultPageAutoRia();
    }
}
