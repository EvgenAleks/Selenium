package class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
//    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
//    check if the check box    "click on this check box" is Selected
//    if no  Select the check box
//    check gain if the checkbox is Selected or not

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
        Thread.sleep(600);
        WebElement checkBox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean selectied1 = checkBox.isSelected();
        System.out.println("The check box selection status: " + selectied1);
        if (!selectied1) {
            checkBox.click();
            Thread.sleep(1600);
            selectied1 = checkBox.isSelected();
            System.out.println("The check box selection status: " + selectied1);
        }
    }
}
