package tests.irankiai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class IrankiaiMainPage extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.irankiai.IrankiaiMainPage.open();
        pages.irankiai.IrankiaiMainPage.acceptCookies();
    }

    @Test
    public void testInputSearchField() {

        String expectedSearchWord = "Atsuktuvas";
        String actualSearchWord;

        pages.irankiai.IrankiaiMainPage.enterSearchWord(expectedSearchWord);
        pages.irankiai.IrankiaiMainPage.clickSearchButton();
        actualSearchWord = pages.irankiai.IrankiaiMainPage.readMessage();

        Assert.assertTrue(
                actualSearchWord.contains(expectedSearchWord),
                String.format("Expected: %s, actual message: %s", expectedSearchWord, actualSearchWord));
    }
}
