package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpencePage {
    private WebDriver driver;

    public ExpencePage(WebDriver driver) {
        this.driver = driver;
    }
    public void Expence() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement expenceInput = driver.findElement(By.xpath("//span[@class='menu-icon fa fa-shopping-cart bg-maroon']"));
        expenceInput.click();
        WebElement Skip3 = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton introjs-donebutton']"));
        Skip3.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Oplaty");
        WebElement Iban = driver.findElement(By.name("iban"));
        Iban.sendKeys("PL85184044257143472336115522");
        WebElement Bic = driver.findElement(By.name("BIC"));
        Bic.sendKeys("BPKOCZPP");
        WebElement accounNumber = driver.findElement(By.name("account_number"));
        accounNumber.sendKeys("85184044257143472336115522");
        WebElement notes = driver.findElement(By.name("notes"));
        notes.sendKeys("Fajna ta automatyzacja");
        WebElement save = driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div/div[3]/button"));
        save.click();
    }
}
