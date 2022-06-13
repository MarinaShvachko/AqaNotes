package docker._1_startTestInFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OneTestInFirefox {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
        driver.get("https://google.com");
        driver.findElement(By.id("input")).sendKeys("Hello World!");
        Thread.sleep(5000); //this is added to watch test execution on UI
        driver.quit();
    }
}