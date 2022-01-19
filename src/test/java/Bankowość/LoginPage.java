package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Login() {
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("fake133@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456789123456789");
        WebElement SignInput = driver.findElement(By.xpath("//button[1]"));
        SignInput.click();
    }
}
