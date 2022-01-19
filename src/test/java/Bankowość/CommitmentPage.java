package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommitmentPage {
    private WebDriver driver;

    public CommitmentPage(WebDriver driver) {
        this.driver = driver;
    }
    public void commitment() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement commitmentInput = driver.findElement(By.xpath("//*[@id=\"control-sidebar-home-tab\"]/ul/li[7]/a/div/h4"));
        commitmentInput.click();
        WebElement Skip5 = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton introjs-donebutton']"));
        Skip5.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Zobowiązać się należy");
        WebElement name2 = driver.findElement(By.name("name"));
        name2.sendKeys("Zobowiązać się należy");
        WebElement currency = driver.findElement(By.xpath("//*[@id=\"ffInput_currency_id\"]/option[1]"));
        currency.click();
        WebElement type = driver.findElement(By.xpath("//*[@id=\"ffInput_liability_type_id\"]/option[3]"));
        type.click();
        WebElement sum = driver.findElement(By.name("opening_balance"));
        sum.sendKeys("1000");
        WebElement liability = driver.findElement(By.xpath("//*[@id=\"ffInput_liability_direction\"]/option[1]"));
        liability.click();
        WebElement date = driver.findElement(By.name("opening_balance_date"));
        date.sendKeys("16.01.2022");
        WebElement interest = driver.findElement(By.name("interest"));
        interest.sendKeys("100");
        WebElement period = driver.findElement(By.xpath("//*[@id=\"ffInput_interest_period\"]/option[2]"));
        period.click();
        WebElement Iban = driver.findElement(By.name("iban"));
        Iban.sendKeys("PL02102004364841716585161883");
        WebElement Bic = driver.findElement(By.name("BIC"));
        Bic.sendKeys("BPKOCZPP");
        WebElement accounNumber = driver.findElement(By.name("account_number"));
        accounNumber.sendKeys("02102004364841716585161883");
        WebElement notes = driver.findElement(By.name("notes"));
        notes.sendKeys("Uczę się automatyzować");
        WebElement save = driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div/div[3]/button"));
        save.click();
        WebElement Firefly3 = driver.findElement(By.xpath("//span[@class='logo-lg']"));
        Firefly3.click();
    }
}
