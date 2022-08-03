package pages.irankiai;

import pages.Common;
import pages.Locators;

public class Category {
    public static void open() {
        Common.openUrl("https://www.irankiai.lt/akcijos-ir-ispardavimai.html");
    }

    public static void clickMenuAllCategories() {
        Common.clickElementByAction(Locators.Irankiai.Category.droplistAllCategories);
    }

    public static void clickMenuPerforatoriai() {
        Common.clickElementByAction(Locators.Irankiai.Category.buttonPerforatoriai);
    }

    public static String readPerforatoriaiHeader() {
        return Common.getElementText(Locators.Irankiai.Category.perforatoriaiHeader);
    }
}
