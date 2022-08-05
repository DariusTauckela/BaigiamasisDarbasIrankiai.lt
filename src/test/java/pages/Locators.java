package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Irankiai {

        public static class IrankiaiMainPage {

            public static By formAd = By.xpath(
                    "//*[@class='notice-text']");
            public static By buttonAcceptCookies = By.xpath(
                    "//*[@class='actions']");
            public static By messageInput = By.xpath(
                    "//*[@id='search']");
            public static By messageField = By.xpath(
                    "//*[@id='yt_main']/div/div[2]/h1");
            public static By buttonSearch = By.xpath(
                    "//*[@id='search_mini_form']/div/button");
        }

        public static class AccountLogin {

            public static By emailInput = By.xpath(
                    "//*[@id='email']");
            public static By passwordInput = By.xpath(
                    "//*[@id='pass']");
            public static By buttonPrisijungtiPush = By.xpath(
                    "//*[@id='send2']");
            public static By loginMessage = By.xpath(
                    "//*[@class='hello']");
            public static By messageWrongData = By.xpath(
                    "//*[@class='error-msg']");
        }

        public static class SignupForm {

            public static By emailEnter = By.xpath(
                    "//*[@id='mce-EMAIL']");
            public static By radiobuttonSelect = By.xpath(
                    "//*[@id='mce-MMERGE1-1']");
            public static By buttonPrenumeruotiPush = By.xpath(
                    "//*[@id='mc-embedded-subscribe']");
            public static By messageSubscribeNewsletter = By.xpath(
                    "//*[@class='page-title']");
        }

        public static class Category {
            public static By droplistAllCategories = By.xpath(
                    "//*[@id='btn_categories']/span");
            public static By buttonPerforatoriai = By.xpath(
                    "//*[@id='sm_megamenu_242']/span");
            public static By perforatoriaiHeader = By.xpath(
                    "//*[@id='page-title-wrap']/div[1]/h1");
        }
    }
}