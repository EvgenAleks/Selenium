package class06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task_1 {
//    1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
//    2.Click on the "Start" button to initiate the loading of a hidden element
//    3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
//    4.Click the "Finish" button to reveal the hidden element
//    5.Verify that the text "Hello World!" is now displayed on the page

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

//      max the window
        driver.manage().window().maximize();

//      implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//      goto
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startBut = driver.findElement(By.xpath("//button"));
        startBut.click();


        WebElement finishBut = driver.findElement(By.xpath("//div[@id='finish']"));
        finishBut.click();

        WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        if (helloWorld.getText().equalsIgnoreCase("Hello World!")) {
            System.out.println("Verified!");
        } else
            System.out.println("Not verified!");
    }
}
