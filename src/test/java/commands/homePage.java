package commands;

import baseCommand.baseCommand;
import org.openqa.selenium.By;

public class homePage extends baseCommand {
    baseCommand baseCommand = new baseCommand();
    String commonHeadersXpath = "//li/a[contains(text(), \"itemContent\")]";

    public void verifyHeaders(String headerContent) {
        String headersXpath = commonHeadersXpath.replace("itemContent", headerContent);
        final By headers = By.xpath(headersXpath);
        System.out.println("Header is visible: " + headerContent);
        baseCommand.getElement(headers);
    }

}
