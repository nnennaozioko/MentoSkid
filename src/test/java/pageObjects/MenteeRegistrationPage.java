package pageObjects;

import Hooks.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MenteeRegistrationPage {


    public WebDriver driver;
    public BasePage bp;

    public MenteeRegistrationPage(WebDriver driver) {
        this.driver = driver;
        bp = new BasePage(driver);
    }

    public void openUrl() {
        bp.goToUrl();
    }

    By startAsAMentee = By.xpath("//a[@class='tu-primbtn tu-primbtn-gradient']");
    By welcomePageDisplayed = By.xpath("//h2[text()='Welcome!']");
    By menteeCheckbox = By.xpath("//label[@for='user_type_student']");



    public void ClickStartAsAMentee(){

       driver.findElement(startAsAMentee).click();
       //Actions actions = new Actions(driver);
       //actions.moveToElement(driver.findElement(startAsAMentee)).click().perform();

    }

    public boolean VerifyWelcomePageDisplayed() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));//explicit wait
//        String text = wait.until(ExpectedConditions.presenceOfElementLocated(welcomePageDisplayed)).getText();
        return driver.findElement(welcomePageDisplayed).isDisplayed();
    }




    public void ClickMenteeCheckbox()
    {
        driver.findElement(menteeCheckbox).click();
    }


}