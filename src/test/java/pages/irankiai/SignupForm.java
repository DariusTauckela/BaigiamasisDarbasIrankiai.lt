package pages.irankiai;

import pages.Common;
import pages.Locators;

public class SignupForm {
    public static void open() {
        pages.Common.openUrl("https://www.irankiai.lt/signup_form.html");
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locators.Irankiai.SignupForm.emailEnter, email);
    }

    public static void selectRadiobuttonPasiulymaiStatybininkams() {
        Common.clickElement(Locators.Irankiai.SignupForm.radiobuttonSelect);
    }

    public static void pushButtonPrenumeruoti() {
        Common.clickElement(Locators.Irankiai.SignupForm.buttonPrenumeruotiPush);
    }

    public static String readMessageSubscribeNewsletter() {
        pages.Common.openUrl("https://www.irankiai.lt/confirmation_thank_you_page.html");
        return Common.getElementText(Locators.Irankiai.SignupForm.messageSubscribeNewsletter);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.Irankiai.IrankiaiMainPage.formAd);
        Common.clickElement(Locators.Irankiai.IrankiaiMainPage.buttonAcceptCookies);
    }
}
