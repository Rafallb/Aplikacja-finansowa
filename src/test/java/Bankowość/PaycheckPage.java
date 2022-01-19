package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaycheckPage {
    private WebDriver driver;

    public PaycheckPage(WebDriver driver) {
        this.driver = driver;}
        public void Paycheck2() {
            WebElement plus2 = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
            plus2.click();
            WebElement wyplata = driver.findElement(By.xpath("//span[@class='menu-icon fa fa-money bg-maroon']"));
            wyplata.click();
            WebElement Skip3 = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
            Skip3.click();
            WebElement name = driver.findElement(By.name("name"));
            name.sendKeys("Oszczednosci Reginy");
            WebElement Iban = driver.findElement(By.name("iban"));
            Iban.sendKeys("PL53109002804725106538502766");
            WebElement Bic = driver.findElement(By.name("BIC"));
            Bic.sendKeys("BPKOCZPP");
            WebElement accounNumber = driver.findElement(By.name("account_number"));
            accounNumber.sendKeys("5433223598765");
            WebElement MoneyStart = driver.findElement(By.name("opening_balance"));
            MoneyStart.sendKeys("5000");
            WebElement dateStratMoney = driver.findElement(By.name("opening_balance_date"));
            dateStratMoney.sendKeys("16.01.2022");
            WebElement accountRole = driver.findElement(By.xpath("//*[@id=\"ffInput_account_role\"]/option[3]"));
            accountRole.click();
            WebElement notes = driver.findElement(By.name("notes"));
            notes.sendKeys("Coders lab");
            WebElement newAssetAccount = driver.findElement(By.xpath("//button[contains(@class, 'btn-success')]"));
            newAssetAccount.click();
    }
}
