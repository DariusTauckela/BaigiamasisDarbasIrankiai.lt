package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void clickElement(By locator) {
        WebElement buttonCloseNoticeCookie = Driver.getDriver().findElement(locator);
        buttonCloseNoticeCookie.click();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void acceptCookies(By locator) {
        clickElement(locator);
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
    }
}
