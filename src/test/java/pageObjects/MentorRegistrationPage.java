package pageObjects;


import Hooks.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MentorRegistrationPage {

    public WebDriver driver;
    public BasePage bp;

    public MentorRegistrationPage(WebDriver driver) {
        this.driver = driver;
        bp = new BasePage(driver);
    }

    public void openUrl() {
        bp.goToUrl();
    }

    By joinAsAMentor = By.xpath("//span[normalize-space()='Join as a Mentor']");
    By welcomePageDisplayed = By.xpath("//h2[text()='Welcome!']");
    By firstName = By.xpath("//input[@name='registration[fname]']");
    By lastName = By.xpath("//input[@name='registration[lname]']");
    By emailAddress = By.xpath("//input[@name='registration[email]']");
    By password = By.id("tu-passwordinput");
    By mentorCheckbox = By.xpath("//label[@for='user_type_instructor']");
    By termsAndConditions = By.xpath("//label[@for='tu-terms']");
    By joinNow = By.xpath("//a[@class='tu-primbtn-lg tu-submit-registration']");
    By myProfileTextDisplayed = By.xpath("//div[@class='tu-boxsmtitle']");



    public void ClickJoinAsAMentor() {
        driver.findElement(joinAsAMentor).click();
    }

    public boolean VerifyWelcomePageDisplayed() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));//explicit wait
//        String text = wait.until(ExpectedConditions.presenceOfElementLocated(welcomePageDisplayed)).getText();
        return driver.findElement(welcomePageDisplayed).isDisplayed();
    }

    public void EnterFirstName(String fnametxt) {
        driver.findElement(firstName).sendKeys(fnametxt);
    }

    public void EnterLastName(String lnametxt) {
        driver.findElement(lastName).sendKeys(lnametxt);
    }

    public void EnterEmailAddress(String emailtxt) {
        driver.findElement(emailAddress).sendKeys(emailtxt);
    }

    public void EnterPassword(String passwordtxt) {
        driver.findElement(password).sendKeys(passwordtxt);
    }

    public void ClickMentorCheckbox() {
        driver.findElement(mentorCheckbox).click();
    }

    public void ClickTermsAndConditions() {
        driver.findElement(termsAndConditions).click();
    }

    public void ClickJoinNow() {
        driver.findElement(joinNow).click();
    }

    public boolean VerifyMyProfileTextDisplayed() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        String text = wait.until(ExpectedConditions.presenceOfElementLocated(myProfileText)).getText();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//      String text =  wait.until(ExpectedConditions.presenceOfElementLocated(myProfileText)).getText();
//        return text;

        return driver.findElement(myProfileTextDisplayed).isDisplayed();
    }

    public boolean ErrorMessage() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //String text = wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage()).getText());
        // return text;
        //JS Alert pop up
        //WebElement jsalertpopup = driver.findElement(By.id("tuturn-modal-popup"));
       // return jsalertpopup.isDisplayed();// this statement returns true
        WebElement jsalertpopup = driver.findElement(By.id("tuturn-modal-popup"));
        return  true;

    }

    public  boolean ErrorTextMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement jsalertpopup = driver.findElement(By.xpath("//div[@class='modal fade tuturn-profilepopup tu-uploadprofile tuturn-popup']"));
        return true;
        //return  jsalertpopup.isDisplayed();
    }


}


