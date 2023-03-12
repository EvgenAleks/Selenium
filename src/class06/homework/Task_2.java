package class06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task_2 {
//  1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
//  2.Switch to the iframe on the page
//  3.Clear the existing text in the  editor inside the iframe
//  4.Enter the text "Hello World!" in the editor inside the iframe
//  5.Switch back to the main page

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

//      max the window
        driver.manage().window().maximize();

//      implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//      goto
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

       WebElement inputTxt = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
       inputTxt.clear();
       inputTxt.sendKeys("Hello World!");

       driver.switchTo().defaultContent();
    }
}
