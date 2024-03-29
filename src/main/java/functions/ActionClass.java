package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    private final Elements elements;
    private final Actions actions;
    private final WebDriver driver;

    public ActionClass(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        elements = new Elements(driver);
    }

    public void dragNdrop(WebElement source, WebElement target){
        actions.dragAndDrop(source,target).perform();
    }
    public void dragNdrop(String xpathSource, String xpathTarget){
        actions.dragAndDrop(elements.findElementByXpath(xpathSource), elements.findElementByXpath(xpathTarget)).perform();
    }

    public void moveToElementLocation(String xpath){
        actions.moveToElement(elements.findElementByXpath(xpath)).perform();
    }

    public void moveToElementLocationClickBuildPerform(String xpath){
        actions.moveToElement(elements.findElementByXpath(xpath)).click().build().perform();
    }
    public void moveToElementLocationEnter(String xpath){
        actions.moveToElement(elements.findElementByXpath(xpath)).keyUp(Keys.ENTER).build().perform();
    }
}
