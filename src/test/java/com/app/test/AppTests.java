package com.app.test;

import com.app.pages.DocumentationPage;
import com.app.pages.DownloadPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppTests {
    WebDriver driver;
    DownloadPage downloadPage;
    DocumentationPage documentationPage;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        downloadPage=new DownloadPage(driver);
        documentationPage=new DocumentationPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    @Test
    public void verifyDownloadsPage(){
        downloadPage.launchDownloads();
        downloadPage.verifyDownloadsHeader();




    }
    @Test
    public void verifyDocumentsPage(){
        documentationPage.launchDocumentation();
        documentationPage.verifyDocumentationHeader();

    }
    public void tearDown(){
        driver.quit();

    }
}
