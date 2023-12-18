package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.MentorRegistrationPage;

public class MentorRegistrationSteps {

//    public WebDriver driver;
//    public pageObjects.MentorRegistrationPage mentorRegistrationPage;

 public WebDriver driver;
 public MentorRegistrationPage mrp;

 public MentorRegistrationSteps(){
     driver = new ChromeDriver();
     //driver = new FirefoxDriver();
     driver.manage().window().maximize();
     mrp = new MentorRegistrationPage(driver);
 }

    @Given("I navigate to the website")
    public void iNavigateToTheWebsite() {
       mrp.openUrl();
    }

    @When("I click join as a mentor")
    public void iClickJoinAsAMentor() {
     mrp.ClickJoinAsAMentor();
    }

    @Then("welcome page displayed")
    public void welcomeItIsNiceToSeeYouDisplayed() {
        Assert.assertTrue(mrp.VerifyWelcomePageDisplayed(),"Welcome!");
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String fnametxt) {
     mrp.EnterFirstName(fnametxt);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lnametxt) {
     mrp.EnterLastName(lnametxt);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String emailtxt) {
     mrp.EnterEmailAddress(emailtxt);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String passwordtxt) {
     mrp.EnterPassword(passwordtxt);
    }

    @And("I click mentor checkbox")
    public void iClickMentorCheckbox() {
     mrp.ClickMentorCheckbox();
    }

    @And("I click terms and condition")
    public void iClickTermsAndCondition() {
     mrp.ClickTermsAndConditions();
    }

    @And("I click join now")
    public void iClickJoinNow() {
     mrp.ClickJoinNow();
    }

    @Then("my profile page displayed")
    public void enrolledCoursesDisplayed() throws InterruptedException {
     Thread.sleep(5000);
     Assert.assertTrue(mrp.VerifyMyProfileTextDisplayed(),"My Profile");

    }

    @Then("the text {string}is displayed")
    public void theTextIsDisplayed(String ignoredIgnoretext) {
        Assert.assertTrue(mrp.ErrorMessage(), "Password must be 8 characters");
    }

    @Then("the text {string} is displayed")
    public void theTextDisplayed(String ignoredIgnoretext) {
     Assert.assertTrue(mrp.ErrorTextMessage(), "Please add a valid email address");

    }

//    @Then("the text Password must be 8 characters is displayed")
//    public void theTextDisplayed() {
//     Assert.assertTrue(mrp.ErrorMessage());
//
//    }


}
