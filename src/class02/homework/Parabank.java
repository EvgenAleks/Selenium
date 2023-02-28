package class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
//    navigate to
//    https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//    fill out the form
//    click on register
//    close the browser

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Evgenii");
        driver.findElement(By.id("customer.lastName")).sendKeys("Aleksandrov");
        driver.findElement(By.id("customer.address.street")).sendKeys("Autumn");
        driver.findElement(By.name("customer.address.city")).sendKeys("Koenig");
        driver.findElement(By.name("customer.address.state")).sendKeys("Koenig");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("236000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0028976592");
        driver.findElement(By.id("customer.ssn")).sendKeys("659200");
        driver.findElement(By.id("customer.username")).sendKeys("evgen");
        driver.findElement(By.name("customer.password")).sendKeys("12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.close();
    }
}
