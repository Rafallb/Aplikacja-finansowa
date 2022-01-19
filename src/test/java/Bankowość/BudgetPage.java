package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BudgetPage {
    private WebDriver driver;

    public BudgetPage(WebDriver driver) {
        this.driver = driver;
    }
    public void budget() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement newBudget = driver.findElement(By.xpath("//*[@id=\"control-sidebar-home-tab\"]/ul/li[8]/a/div/h4"));
        newBudget.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Mój nowy budżet");
        WebElement autoBudget = driver.findElement(By.xpath("//*[@id=\"ffInput_auto_budget_type\"]/option[2]"));
        autoBudget.click();
        WebElement currency = driver.findElement(By.xpath("//*[@id=\"ffInput_auto_budget_currency_id\"]/option[2]"));
        currency.click();
        WebElement kontyngent = driver.findElement(By.name("auto_budget_amount"));
        kontyngent.sendKeys("500");
        WebElement period = driver.findElement(By.xpath("//*[@id=\"ffInput_auto_budget_period\"]/option[1]"));
        period.click();
        WebElement save = driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div/div[3]/button"));
        save.click();
    }
}
