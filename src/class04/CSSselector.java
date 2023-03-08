package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(600);
//        max the window
        driver.manage().window().maximize();
        Thread.sleep(600);
//        goto facebook.com
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
//        accept cookies
//        driver.findElement(By.linkText("button[title='Разрешить основные и необязательные cookie']")).click();
//        Thread.sleep(2000);
//        click on the button create account using css selector
        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewBtn.click();
        Thread.sleep(2000);

//        fill in the first name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Arnold");
        Thread.sleep(2000);

    }
}
