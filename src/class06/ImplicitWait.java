package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

//      max the window
        driver.manage().window().maximize();

//      implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      goto
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Создать новый аккаунт")).click();

        driver.findElement(By.name("firstname")).sendKeys("Joe");
    }
}
