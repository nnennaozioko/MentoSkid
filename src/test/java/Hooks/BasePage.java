package Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;

    }
  public void goToUrl()
  {
      String url = "https://mentorskid.com";
      driver.get(url);
  }

  public void CloseBrowser()
  {
      driver.close();
  }










}
