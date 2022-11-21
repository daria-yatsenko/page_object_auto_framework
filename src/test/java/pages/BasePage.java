package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import utils.ConfProperties;

import java.time.Duration;

import static org.hamcrest.Matchers.*;


import static org.hamcrest.MatcherAssert.assertThat;


public class BasePage {

 private WebDriverWait wait;

  public BasePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  public void waitUntilDisplayed(WebElement element){
    wait
        .until(ExpectedConditions.visibilityOf(element));
  }
  public void clickOn(WebElement element){
    wait
        .until(ExpectedConditions.elementToBeClickable(element));
    element.click();
  }

  public void sendKeysToInputField(WebElement input, String value){
    waitUntilDisplayed(input);
    input.sendKeys(value);
  }

}
