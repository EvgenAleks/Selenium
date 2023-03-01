package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // find the username
        WebElement usrename = driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
        usrename.sendKeys("Tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");
        Thread.sleep(1000);
        // clear the usrename textbox
        usrename.clear();
        Thread.sleep(1000);
        // get and print the text "Username"
        WebElement usernameText = driver.findElement(By.xpath("//label[text()= 'Username:']"));
        System.out.println(usernameText.getText());
        Thread.sleep(1000);
        // get and print the text "Password"
       WebElement passText = driver.findElement(By.xpath("//label[text()= 'Password:']"));
       String passwordText = passText.getText();
        System.out.println(passwordText);
    }
}
