package tests.irankiai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignupForm extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.irankiai.SignupForm.open();
        pages.irankiai.SignupForm.acceptCookies();
    }

    @Test
    public void testSubscribeToNewsLetter() {

        String email = "darkatau13@gmail.com";
        String exceptedMessage = "Dėkojame, kad užsiprenumeravote mūsų naujienas!";
        String actualMessage;

        pages.irankiai.SignupForm.enterEmail(email);
        pages.irankiai.SignupForm.selectRadiobuttonPasiulymaiStatybininkams();
        pages.irankiai.SignupForm.pushButtonPrenumeruoti();
        actualMessage = pages.irankiai.SignupForm.readMessageSubscribeNewsletter();

        Assert.assertEquals(actualMessage, exceptedMessage);
    }
}