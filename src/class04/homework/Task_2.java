package class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task_2 {

//    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
//    1. u need to write down the code that can select  1 check box out of 4 mentioned,
//    e.g option1 , option2 , option 3, option 4

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(600);
//        max the window
        driver.manage().window().maximize();
        Thread.sleep(600);
//      goto syntaxprojects
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        Thread.sleep(1000);

        List<WebElement> fourBtns = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement btn : fourBtns) {
            String option = btn.getAttribute("value");

            if (option.equalsIgnoreCase("Option-2")) {
                btn.click();
            }
        }
    }
}
