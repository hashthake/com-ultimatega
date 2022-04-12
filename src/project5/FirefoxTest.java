package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //Page resource
        System.out.println("Resource of the page "+ driver.getPageSource());
        //Current URL of the page
        System.out.println("Current URL of the page "+ driver.getCurrentUrl());

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
        driver.close();
    }
}
