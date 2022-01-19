package Bankowość;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Payment2() {
        WebElement plus = driver.findElement(By.xpath("//span[@class='fa fa-plus-circle']"));
        plus.click();
        WebElement wplata = driver.findElement(By.xpath("//span[@class='menu-icon fa fa-long-arrow-right bg-green']"));
        wplata.click();
        WebElement Skip2 = driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']"));
        Skip2.click();
        WebElement opis = driver.findElement(By.name("description[]"));
        opis.sendKeys("przelew z wyplaty");
        WebElement kontoZrodlowe = driver.findElement(By.name("source[]"));
        kontoZrodlowe.sendKeys("Regina Bank");
        WebElement kontoDocelowe = driver.findElement(By.xpath("//*[@title=\"Konto docelowe\"]"));
        kontoDocelowe.click();
        WebElement kontoDocelowe2 = driver.findElement(By.xpath("//*[@id=\"transaction-info\"]/div[3]/div[2]/section/ul/li[3]"));
        kontoDocelowe2.click();
        WebElement kwota = driver.findElement(By.name("amount[]"));
        kwota.clear();
        kwota.sendKeys("500");
        WebElement waluta = driver.findElement(By.xpath("//*[@id=\"amount-info\"]/div[2]/div[2]/select/option[2]"));
        waluta.click();
        WebElement kwotaZagraniczna = driver.findElement(By.name("foreign_amount[]"));
        kwotaZagraniczna.clear();
        kwotaZagraniczna.sendKeys("1000");
        WebElement kategoria = driver.findElement(By.name("category[]"));
        kategoria.sendKeys("przyklad");
        WebElement tagi = driver.findElement(By.xpath("//input[@title='Tagi']"));
        tagi.sendKeys("przyklad2");
        WebElement data = driver.findElement(By.name("interest_date[]"));
        data.clear();
        data.sendKeys("11.01.2022");
        WebElement notatki = driver.findElement(By.name("notes[]"));
        notatki.sendKeys("Coders Lab");
        WebElement przeslij = driver.findElement(By.id("submitButton"));
        przeslij.click();
        WebElement Firefly3 = driver.findElement(By.xpath("//span[@class='logo-lg']"));
        Firefly3.click();
    }
}
