package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DecemberBoysSteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Roman Yarmolenko\\IdeaProjects\\BDDCucumberTest\\drivers\\chromedriver.exe" );
        driver = new ChromeDriver();

    }
    @When("I open DecemberBoys homepage")
    public void i_open_december_boys_homepage() {

        driver.get("https://decemberboys.com.ua/");

    }
    @Then("I verify that the logo is present on a homepage")
    public void i_verify_that_the_logo_is_present_on_a_homepage() {

        boolean status = driver.findElement(By.xpath("//img[@title=\"December Boys\"]")).isDisplayed();
        Assert.assertEquals(true, status);
        if(status == true) {
            System.out.println("you can locate the logo by sane xpath");
        }
        else{
            System.out.println("the logo is absent");
        }
    }
    @Then("close browser")
    public void close_browser() {

        driver.quit();


    }

}
