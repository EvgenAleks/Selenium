package class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
    //    navigate to fb.com
//    click on create new account
//    fill up all the textboxes
//    click on sign up button
//    close the pop up
//    close the browser
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Создать новый аккаунт")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Евгений");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Александров");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("123@mail.net");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("123@mail.net");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("777000000");
        Thread.sleep(1000);
        driver.findElement(By.id("day")).sendKeys("28");
        Thread.sleep(1000);
        driver.findElement(By.id("month")).sendKeys("апр");
        Thread.sleep(1000);
        driver.findElement(By.id("year")).sendKeys("1984");
        Thread.sleep(1000);
        driver.findElement(By.id("u_3_5_bj")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("_8ien")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
