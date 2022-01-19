package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PiggyBankPage {
    private WebDriver driver;

    public PiggyBankPage(WebDriver driver) {
        this.driver = driver;}
    public void PiggyBank() {
        WebElement plus2 = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus2.click();
        WebElement piggyBank = driver.findElement(By.xpath("//*[@id=\"control-sidebar-home-tab\"]/ul/li[10]/a/div/h4"));
        piggyBank.click();
        WebElement skip = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
        skip.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Grosik do grosika");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"ffInput_account_id\"]/optgroup[2]/option[1]"));
        account.click();
        WebElement sum = driver.findElement(By.name("targetamount"));
        sum.sendKeys("200");
        WebElement date = driver.findElement(By.name("targetdate"));
        date.sendKeys("16.01.2022");
        WebElement notes = driver.findElement(By.name("notes"));
        notes.sendKeys("Oszczędzać trzeba");
        WebElement group = driver.findElement(By.name("object_group"));
        group.sendKeys("grupa oszczędnościowa");
        WebElement save = driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div/div[3]/button"));
        save.click();
    }
}
