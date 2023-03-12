package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//          * 1. launch the browser
//          * 2. navigate to amazon website
//          * 3. print out the title and the url in the console
//          * 4. close the browser
public class Task_1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.quit();
    }
}
