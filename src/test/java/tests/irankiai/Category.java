package tests.irankiai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Category extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.irankiai.Category.open();
    }

    @Test
    public void testAllCategoriesPage() {

        pages.irankiai.Category.clickMenuAllCategories();
        pages.irankiai.Category.clickMenuPerforatoriai();

        String expectedMessage = "Perforatoriai";
        String actualMesage = pages.irankiai.Category.readPerforatoriaiHeader();

        Assert.assertEquals(actualMesage, expectedMessage);
    }
}