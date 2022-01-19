package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncomePage {
    private WebDriver driver;

    public IncomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void Income() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement incomeInput = driver.findElement(By.xpath("//*[@id=\"control-sidebar-home-tab\"]/ul/li[6]/a/div/h4"));
        incomeInput.click();
        WebElement Skip4 = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton introjs-donebutton']"));
        Skip4.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Oplaty");
        WebElement Iban = driver.findElement(By.name("iban"));
        Iban.sendKeys("PL89109040280653496631859151");
        WebElement Bic = driver.findElement(By.name("BIC"));
        Bic.sendKeys("BPKOCZPP");
        WebElement accounNumber = driver.findElement(By.name("account_number"));
        accounNumber.sendKeys("89109040280653496631859151");
        WebElement notes = driver.findElement(By.name("notes"));
        notes.sendKeys("Fajna ta automatyzacja");
        WebElement save = driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div/div[3]/button"));
        save.click();
    }
}
