package pages.irankiai;

import pages.Common;
import pages.Locators;

public class IrankiaiMainPage {
    public static void open() {
        pages.Common.openUrl("https://www.irankiai.lt");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.Irankiai.IrankiaiMainPage.formAd);
        Common.clickElement(Locators.Irankiai.IrankiaiMainPage.buttonAcceptCookies);
    }

    public static void enterSearchWord(String expectedSearchWord) {
        Common.sendKeysToElement(Locators.Irankiai.IrankiaiMainPage.messageInput, expectedSearchWord);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Irankiai.IrankiaiMainPage.buttonSearch);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Irankiai.IrankiaiMainPage.messageField);
    }
}