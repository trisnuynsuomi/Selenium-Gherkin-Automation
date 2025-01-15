package baseCommand;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class baseCommand {
    public static WebDriver driver;

    public void openDriver() {
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));
        ChromeOptions options = new ChromeOptions();
        if (headless) {
            options.addArguments("--headless");
        }
        driver = new ChromeDriver(options);
        String url = "https://automationexercise.com/";
        driver.get(url);
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebElement getElement(By by){
        WebElement element = driver.findElement(by);
        this.scrollToElement(element);
        return element;
    }

    public void inputField(By by, String content){
        WebElement element = this.getElement(by);
        element.sendKeys(content);
    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
