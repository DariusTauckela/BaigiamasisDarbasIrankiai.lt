package pages.irankiai;

import org.testng.annotations.AfterMethod;
import pages.Common;
import pages.Locators;

public class AccountLogin {
    public static void open() {
        pages.Common.openUrl("https://www.irankiai.lt/customer/account/login/");
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locators.Irankiai.AccountLogin.emailInput, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Irankiai.AccountLogin.passwordInput, password);
    }

    public static void enterLoginButton() {
        Common.clickElement(Locators.Irankiai.AccountLogin.buttonPrisijungtiPush);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Irankiai.AccountLogin.loginMessage);
    }

    public static String readMessageWrongData() {
        return Common.getElementText(Locators.Irankiai.AccountLogin.messageWrongData);
    }
}
