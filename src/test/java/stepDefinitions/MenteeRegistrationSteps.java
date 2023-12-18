package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.MenteeRegistrationPage;


public class MenteeRegistrationSteps {

 public WebDriver driver;
    public MenteeRegistrationPage rp;

    public MenteeRegistrationSteps(){
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        rp = new MenteeRegistrationPage(driver);
    }

    @Given("I navigate to the Url")
    public void iNavigateToTheUrl() {
        rp.openUrl();
    }

    @When("I click start as a mentee button")
    public void iClickJoinAsAMentee(){

        rp.ClickStartAsAMentee();
    }


    @And("I click mentee checkbox")
    public void iClickMenteeCheckbox() {
        rp.ClickMenteeCheckbox();
    }


}
