package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

    public static void main(String[] args) throws InterruptedException {
//        tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        navigate to the website
        driver.get("http://amazon.com");
//        maximize the website
        driver.manage().window().maximize();

//        print all the links in the amazon.com
        driver.findElements(By.tagName("a"));
    }
}
