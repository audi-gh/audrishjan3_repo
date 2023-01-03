package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadPage {
    WebDriver driver;
    public DownloadPage(WebDriver driver){
        this.driver=driver;

    }


    public void launchDownloads() {
        String expPageTitle = "Downloads | Selenium";
        driver.findElement(By.linkText("Downloads")).click();
        String actualPageTitle=driver.getTitle();
        Assert.assertEquals(actualPageTitle,expPageTitle,"Downloads page not loaded");
    }


    public void verifyDownloadsHeader() {
        //div[@class="text-center"]/h1
       String header= driver.findElement(By.xpath("//div[@class=\"text-center\"]/h1")).getText();
       Assert.assertEquals("Downloads",header,"Not same");

    }
}
