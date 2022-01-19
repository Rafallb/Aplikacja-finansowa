package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPeycheckPage {
    private WebDriver driver;

    public NewPeycheckPage(WebDriver driver) {
        this.driver = driver;}
    public void NewPeycheck() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement paycheck = driver.findElement(By.xpath("//*[@id=\"control-sidebar-home-tab\"]/ul/li[1]/a/div/h4"));
        paycheck.click();
        WebElement skip = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
        skip.click();
        WebElement description = driver.findElement(By.name("description[]"));
        description.click();
        WebElement description2 = driver.findElement(By.xpath("//*[@id=\"transaction-info\"]/div[1]/div[2]/section/ul/li[5]"));
        description2.click();
        WebElement source = driver.findElement(By.name("source[]"));
        source.click();
        WebElement source2 = driver.findElement(By.xpath("//*[@id=\"transaction-info\"]/div[2]/div[2]/section/ul/li[6]"));
        source2.click();
        WebElement destination = driver.findElement(By.name("destination[]"));
        destination.click();
        WebElement destination2 = driver.findElement(By.xpath("//*[@id=\"transaction-info\"]/div[3]/div[2]/section/ul/li[4]"));
        destination2.click();
        WebElement amount = driver.findElement(By.name("amount[]"));
        amount.sendKeys("600");
        WebElement currency = driver.findElement(By.name("foreign_currency[]"));
        currency.click();
        WebElement currency2 = driver.findElement(By.xpath("//*[@id=\"amount-info\"]/div[2]/div[2]/select/option[4]"));
        currency2.click();
        WebElement interestDate = driver.findElement(By.name("interest_date[]"));
        interestDate.sendKeys("17.01.2022");
        WebElement notes = driver.findElement(By.name("notes[]"));
        notes.sendKeys("Amigo jest bardzo sprytny");
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();
    }
}
