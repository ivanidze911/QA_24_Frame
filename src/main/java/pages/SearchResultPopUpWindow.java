package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPopUpWindow extends BasePage{
    public SearchResultPopUpWindow(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        private static final By nextButton = By.xpath("//button[@id='auth-next-button']");
        private static final By addToCart = By.xpath("//div[@data-id='8786']//i[@class='icon-shop']");
        private static final By goodsInTheBasket = By.xpath("//div[@class='shop-cart__item-product ']");
        private static final By searchResultText = By.xpath("//h1[@class='with-counter']");
        private static final By inputPhone = By.xpath("//input[@id='auth-phone-input']");
        public static final By checkbox = By.xpath("//div[@class='form-checkbox']");
    }

    public void searchByText(String text) {
        elements.sendKeysToElementBy(Locators.inputPhone,text);
    }
    public void elementClickability (){
        waiters.waitElementToBeClickableReturn(Locators.nextButton);
        assertions.elementToBeClikable(Locators.nextButton);
    }
    public void checkboxClickability (){
        waiters.waitElementToBeClickableReturn(Locators.checkbox);
        assertions.elementToBeClikable(Locators.checkbox);
    }
}
