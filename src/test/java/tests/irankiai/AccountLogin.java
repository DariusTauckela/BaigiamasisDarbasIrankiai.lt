package tests.irankiai;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class AccountLogin extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.irankiai.AccountLogin.open();
        pages.Common.acceptCookies(Locators.Irankiai.IrankiaiMainPage.buttonAcceptCookies);
    }

    @Test
    public void testLoginAccountWithValidData() {

        String email = "darkatau@gmail.com";
        String password = "muse2kitas";
        String exceptedMessage = "Sveiki, Darius Tauckela!";
        String actualMessage;

        pages.irankiai.AccountLogin.enterEmail(email);
        pages.irankiai.AccountLogin.enterPassword(password);
        pages.irankiai.AccountLogin.clickLoginButton();
        actualMessage = pages.irankiai.AccountLogin.readMessage();

        Assert.assertEquals(actualMessage, exceptedMessage);
    }

    @Test
    public void testAccounLoginWithWrongPassword() {

        String email = "darkatau@gmail.com";
        String wrongPassword = "111222www";
        String exceptedMesage = "Neteisingas el.paštas arba slaptažodis," +
                " prašome pasinaudoti slaptažodžio priminimo funkcija.";
        String actualMessage;

        pages.irankiai.AccountLogin.enterEmail(email);
        pages.irankiai.AccountLogin.enterPassword(wrongPassword);
        pages.irankiai.AccountLogin.clickLoginButton();
        actualMessage = pages.irankiai.AccountLogin.readMessageWrongData();

        Assert.assertEquals(actualMessage, exceptedMesage);
    }

    @AfterMethod
    public void testsComplete() {
        System.out.println("All tests for AccountLogin are complete.");
    }
}
