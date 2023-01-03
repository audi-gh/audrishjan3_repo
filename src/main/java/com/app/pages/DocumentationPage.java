package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentationPage {
    WebDriver driver;
    public DocumentationPage(WebDriver driver){
        this.driver=driver;

    }

    public void launchDocumentation() {
        String expPageTitle = "The Selenium Browser Automation Project | Selenium";

        driver.findElement(By.linkText("Documentation")).click();
        String actualPageTitle=driver.getTitle();
        Assert.assertEquals(actualPageTitle,expPageTitle,"Documentation page not loaded");
    }

    public void verifyDocumentationHeader() {
        String header= driver.findElement(By.xpath("//div[@class=\"td-content\"]/h1")).getText();
        Assert.assertEquals(header,"The Selenium Browser Automation Project","Not same");

    }
}
