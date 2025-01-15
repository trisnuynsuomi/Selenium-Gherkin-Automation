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
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
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

    public void waitForElementToVisible(By by) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement getElement(By by){
        this.waitForElementToVisible(by);
        WebElement element = driver.findElement(by);
        this.scrollToElement(element);
        return element;
    }

    public void inputField(By by, String content){
        this.waitForElementToVisible(by);
        WebElement element = this.getElement(by);
        element.sendKeys(content);
    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectDropdownOption(By by, String content) {
        this.waitForElementToVisible(by);
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(content);
    }
}
