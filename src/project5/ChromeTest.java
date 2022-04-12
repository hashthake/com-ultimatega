package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //resource of the page
        System.out.println("Resource of the page " + driver.getPageSource());
        //Current URL of the page
        System.out.println("Current URL of the page " + driver.getCurrentUrl());

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("123@gmail.com");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
        driver.close();
    }
}
