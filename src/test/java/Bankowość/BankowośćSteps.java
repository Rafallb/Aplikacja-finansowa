package Bankowość;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BankowośćSteps {
    private WebDriver driver;
    private Bankowość.LoginPage loginPage;
    private Bankowość.GettingStartedPage gettingStartedPage;
    private Bankowość.PaymentPage paymentPage;
    private Bankowość.PaycheckPage paycheckPage;
    private Bankowość.ExpencePage expencePage;
    private Bankowość.IncomePage incomePage;
    private Bankowość.CommitmentPage commitmentPage;
    private Bankowość.BudgetPage budgetPage;
    private Bankowość.PiggyBankPage piggyBankPage;
    private Bankowość.NewPeycheckPage newPeycheckPage;
    private Bankowość.RaportPage raportPage;

    @Given("^Landing page (.*) opened in browser$")
    public void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }

    @When("^Login to account$")
    public void LoginPage() {
        this.loginPage = new Bankowość.LoginPage(driver);
        loginPage.Login();
    }

    @And("^Create an account$")
    public void Create() {
        this.gettingStartedPage = new GettingStartedPage(driver);
        gettingStartedPage.Account();
    }

    @And("^Add payment$")
    public void Payment() {
        this.paymentPage = new PaymentPage(driver);
        paymentPage.Payment2();
    }
    @And("^Add paycheck Nowe konto aktywowów$")
    public void Paycheck() {
        this.paycheckPage = new PaycheckPage(driver);
        paycheckPage.Paycheck2();
    }
    @And("^Add expence$")
    public void Expence2() {
        this.expencePage = new ExpencePage(driver);
        expencePage.Expence();
    }
    @And("^Add income$")
    public void Income2() {
        this.incomePage = new IncomePage(driver);
        incomePage.Income();
    }
    @And("^Add commitment$")
    public void commitment2() {
        this.commitmentPage = new CommitmentPage(driver);
        commitmentPage.commitment();
    }
    @And("^Add budget$")
    public void budget2() {
        this.budgetPage = new BudgetPage(driver);
        budgetPage.budget();
    }
    @And("^Add Piggy Bank$")
    public void piggyBank2() {
        this.piggyBankPage = new PiggyBankPage(driver);
        piggyBankPage.PiggyBank();
    }
    @And("^Add new paycheck$")
    public void NewPaycheck2() {
        this.newPeycheckPage = new NewPeycheckPage(driver);
        newPeycheckPage.NewPeycheck();
    }
    @Then("^check report$")
    public void raport2() {
        this.raportPage = new RaportPage(driver);
        raportPage.raport();
    }
}
