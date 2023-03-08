package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(600);
//        max the window
        driver.manage().window().maximize();
        Thread.sleep(600);
//      goto syntaxprojects
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        Thread.sleep(600);
//      click in the radio button Male
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
//      check if the radio button is enebled
        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("The radio button male is enabled: " + isEnabledMale);

//      check if the radio button is enebled
        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("The radio button male is displayed: " + isEnabledMale);

        boolean isSelectedMale = maleBtn.isSelected();
        System.out.println("The radio button male is selected: " + isSelectedMale);
        if (!isSelectedMale) {
            maleBtn.click();
        }
//        check if the radio button is selected after the click
        isSelectedMale = maleBtn.isSelected();
        System.out.println("The status of radio button male selection is: " + isSelectedMale);
    }
}

