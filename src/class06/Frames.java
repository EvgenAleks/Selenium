package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {

//      tell your project where the webdriver is located.
//      for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//      max the window
        driver.manage().window().maximize();

//      goto uitestpatctice page
        driver.get("http://www.uitestpractice.com/Students/Switchto");

//      switch to the iframe which contains the input box
//      method :  by index
        driver.switchTo().frame(0);
//      this statement will shift the focus to the first  frame

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
//      send some text
        textBox.sendKeys("Johnny B. Goode");

//      get the text from parent window
        driver.switchTo().defaultContent();
//      find the text
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("The text is: " + text.getText());

        driver.switchTo().frame("iframe_a");

        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("The label is: " + getLabel.getText());

//      switch focus to the main page

        driver.switchTo().defaultContent();

//        3 Method switch to an iframe using WebElment
//        clear what ever is written in the text box

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();

    }
}
