package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedriver", "/Users/olegnarushevich/QA_32_automation/webinars/QA32_StartWebinar/chromedriver");
        wd.manage().window();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");
    }

    @AfterMethod
    public void teadDown(){
        wd.quit();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text){
        if(text != null){
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }
}
