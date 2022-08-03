package tests.irankiai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class SignupForm extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.irankiai.SignupForm.open();
        pages.Common.acceptCookies(Locators.Irankiai.IrankiaiMainPage.buttonAcceptCookies);
    }

    @Test
    public void testSubscribeToNewsLetter(){

        String email = "dariust@delfi.lt";
        String exceptedMessage = "Dėkojame, kad užsiprenumeravote mūsų naujienas!";
        String actualMessage;

        pages.irankiai.SignupForm.enterEmail(email);
        pages.irankiai.SignupForm.selectRadiobuttonPasiulymaiStatybininkams();
        pages.irankiai.SignupForm.pushButtonPrenumeruoti();
       actualMessage = pages.irankiai.SignupForm.readMessageSubscribeNewsletter();

        Assert.assertEquals(actualMessage, exceptedMessage);




    }
}