package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RaportPage {
    private WebDriver driver;

    public RaportPage(WebDriver driver) {this.driver = driver;}
    public void raport() {
        WebElement raport = driver.findElement(By.xpath("//span[@class='fa fa-bar-chart fa-fw']"));
        raport.click();
        WebElement skip = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
        skip.click();
        WebElement raportType = driver.findElement(By.name("report_type"));
        raportType.click();
        WebElement raportType2 = driver.findElement(By.xpath("//*[@id=\"inputReportType\"]/option[1]"));
        raportType2.click();
        WebElement refresh = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/h1"));
        refresh.click();
        WebElement accounts = driver.findElement(By.xpath("//button[contains(@class, 'dropdown-toggle')]"));
        accounts.click();
        WebElement accounts2 = driver.findElement(By.xpath("//*[@id=\"inputAccountsSelect\"]/span/div/ul/li[2]"));
        accounts2.click();
        WebElement save = driver.findElement(By.xpath("//*[@id=\"report-form\"]/div/div[3]/div[2]/div/div/button"));
        save.click();
        WebElement done = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton introjs-donebutton']"));
        done.click();
    }
}
