package pages.nextGeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

  public SignUpPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }


  @FindBy(xpath = "//span[contains(text(),'SignUp')]/..")
  private WebElement signUpButton;

  @FindBy(css = "img[alt='logo.png']")
  private WebElement logoImg;

  @FindBy(name = "first-name")
  private WebElement firstNameInput;

  @FindBy(name = "last-name")
  private WebElement lastNameInput;

  @FindBy(name = "email")
  private WebElement emailInput;

  @FindBy(name = "password")
  private WebElement passwordInput;

  @FindBy(name = "enter-mobile number")
  private WebElement numberInput;

  @FindBy(name = "enter-work city")
  private WebElement workCityInput;

  @FindBy(css = "[data-testid='buttonElement']")
  private WebElement submitButton;


  public void clickOnSignUpButton(){
    clickOn(signUpButton);
    try {
      waitUntilDisplayed(logoImg);
    }
    catch(Exception e){
      clickOnSignUpButton();
    }
  }

  public void fillInFirstNameWith(String value){
    sendKeysToInputField(firstNameInput,value);
  }

  public void fillInLastNameWith(String value){
    sendKeysToInputField(lastNameInput,value);
  }

  public void fillInEmailWith(String value){
    sendKeysToInputField(emailInput,value);
  }

  public void fillInPasswordWith(String value){
    sendKeysToInputField(passwordInput,value);
  }

  public void fillInNumberWith(String value){
    sendKeysToInputField(numberInput,value);
  }

  public void fillInCityWith(String value){
    sendKeysToInputField(workCityInput,value);
  }

  public void clickOnSubmitButton(){
    clickOn(submitButton);
  }


}
