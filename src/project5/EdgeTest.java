package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        //maximize window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page "+ driver.getTitle());
        //Resource of the page
        System.out.println("resource of the page " + driver.getPageSource());
        //Current URL of the page
        System.out.println("Current URL of the page "+ driver.getCurrentUrl());

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
        driver.close();
    }
}
