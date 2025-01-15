package commands;

import baseCommand.baseCommand;
import org.openqa.selenium.By;

public class homePage {
    baseCommand baseCommand = new baseCommand();
    String commonHeadersXpath = "//li/a[contains(text(), \"itemContent\")]";

    public void verifyHeaders(String headerContent) {
        String headersXpath = commonHeadersXpath.replace("itemContent", headerContent);
        final By headers = By.xpath(headersXpath);
        System.out.println("Header is visible: " + headerContent);
        baseCommand.getElement(headers);
    }

    public void navigateToPage(String page) {
        String headersXpath = commonHeadersXpath.replace("itemContent", page);
        final By headers = By.xpath(headersXpath);
        System.out.println("Header is visible: " + page);
        baseCommand.getElement(headers).click();
    }

    public void logout() {
        String headersXpath = commonHeadersXpath.replace("itemContent",  "Logout");
        final By headers = By.xpath(headersXpath);
        baseCommand.getElement(headers).click();
    }

    public void verifyLoginSuccessfully() {

    }
}
