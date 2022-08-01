package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Type;
import java.util.List;

import static javax.swing.UIManager.get;

public class DecemberBoysSteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\BDDCucumberTest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("I open DecemberBoys homepage")
    public void i_open_december_boys_homepage() {

        driver.get("https://decemberboys.com.ua/");

    }

    @Then("I verify that the logo is present on a homepage")
    public void i_verify_that_the_logo_is_present_on_a_homepage() {

//        boolean status = driver.findElement(By.xpath("//img[@title=\"December Boys\"]")).isDisplayed();
//        Assert.assertEquals(true, status);
//        if (status == true) {
//            System.out.println("you can locate the logo by sane xpath");
//        } else {
//            System.out.println("the logo is absent");
//        }

            Assert.assertTrue("The logo is absent", driver.findElement(By.xpath("//img[@title=\"December Boys\"]")).isDisplayed());
        }


    @Then("close browser")
    public void close_browser() {

        driver.quit();


    }

    @When("I open DecemberBoys login page")
    public void i_open_december_boys_login_page() {
        driver.get("https://decemberboys.com.ua/en/accounts/login/");
    }

    @And("pass valid credentials")
    public void pass_valid_credentials() {
        driver.findElement(By.xpath("//input[@name='login-username']")).sendKeys("erg@rsgef.com");
        driver.findElement(By.xpath("//input[@name='login-password']")).sendKeys("123456789");
    }

    @And("pass username {string} and password {string}")
    public void pass_username_and_password(String email, String password) {
        driver.findElement(By.xpath("//input[@name='login-username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='login-password']")).sendKeys(password);
    }


    @And("click login")
    public void click_login() {
        driver.findElement(By.xpath("//button[@name='login_submit']")).click();

    }

    @And("pass username and password from Data Table")
    public void pass_username_and_password_from_data_table(DataTable credentials) {
       List<List<String>> data =  credentials.asLists((Type) String.class);

        driver.findElement(By.xpath("//input[@name='login-username']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@name='login-password']")).sendKeys(data.get(0).get(1));
    }

    @Then("I verify that I'm logged in")
    public void i_verify_that_i_m_logged_in() {

        boolean logout = driver.findElement(By.xpath("//a[@href='/en/accounts/logout/']")).isDisplayed();
        if (logout == true ){
            System.out.println("You have been successfully logged in");
        }
        else{
            System.out.println("Login Failed");
        }


    }
}
