package phucho.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import phucho.locators.LocatorsCMS;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod // Chạy trước mỗi @Test
    public  void createBrowser(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

}
    @AfterMethod
    public void closeBrowser(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void sleep(double second){

        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void loginCMS(){
        driver.findElement(By.xpath(LocatorsCMS.inputEmailLogin)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCMS.inputPasswordLogin)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCMS.buttonLogin)).click();
        sleep(1);

    }
}
