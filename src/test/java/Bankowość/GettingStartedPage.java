package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GettingStartedPage {
    private WebDriver driver;

    public GettingStartedPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Account() {
        WebElement BankName = driver.findElement(By.name("bank_name"));
        BankName.sendKeys("Regina Bank");
        WebElement currency = driver.findElement(By.xpath("//span[@id='currency_select_symbol_bank_balance']"));
        currency.click();
        WebElement currency2 = driver.findElement(By.xpath("//a[@data-currency='PLN']"));
        currency2.click();
        WebElement Balance = driver.findElement(By.name("bank_balance"));
        Balance.clear();
        Balance.sendKeys("2000");
        WebElement SavingBalance = driver.findElement(By.name("savings_balance"));
        SavingBalance.clear();
        SavingBalance.sendKeys("1000");
        WebElement Language = driver.findElement(By.xpath("//*[@id=\"lang_holder\"]/option[15]"));
        Language.click();
        WebElement Submit = driver.findElement(By.name("submit"));
        Submit.click();
        WebElement Skip = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
        Skip.click();
    }
}
