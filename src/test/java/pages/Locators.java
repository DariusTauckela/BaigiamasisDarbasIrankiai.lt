package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Irankiai {

        public static class IrankiaiMainPage {

            public static By formAd = By.xpath(
                    "//*[@id='notice-cookie-block']/div/table/tbody/tr/td[2]/div/p");
            public static By buttonAcceptCookies = By.xpath(
                    "//*[@id='notice-cookie-block']/div/table/tbody/tr/td[1]/div/button");
            public static By messageInput = By.xpath(
                    "//*[@id='search']");
            public static By messageField = By.xpath(
                    "//*[@id='yt_main']/div/div[2]/h1");
            public static By buttonSearch = By.xpath("//*[@id='search_mini_form']/div/button");
        }
    }
}