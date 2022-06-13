package docker._2_startTestInTwoBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OneTestInTwoBrowsers {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public Capabilities capabilities;

    public WebDriver getDriver() {
        return driver.get();
    }

    @Parameters({"browser"})
    @Test
    public void doSearch(String browser) throws MalformedURLException {

        if (browser.equals("firefox")) {
            capabilities = new FirefoxOptions();
        } else if (browser.equals("chrome")) {
            capabilities = new ChromeOptions();
        }

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities));

        getDriver().get("http://google.com");
        getDriver().findElement(By.name("q")).sendKeys("Hello World");
        System.out.println("The title of the browser " + browser + " = " + getDriver().getTitle());
        getDriver().quit();
    }
}
