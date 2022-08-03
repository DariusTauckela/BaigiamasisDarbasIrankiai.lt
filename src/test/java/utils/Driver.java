package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--force-device-scale-factor=1.0");

        driver.set(new ChromeDriver(options));
        driver.get().manage().window().setSize(new Dimension(1336, 738));
        driver.get().manage().timeouts().implicitlyWait(Constants.DURATION_TIMEOUT);
    }

    public static void closeDriver() {
        driver.get().quit();
        driver.remove();
    }
}