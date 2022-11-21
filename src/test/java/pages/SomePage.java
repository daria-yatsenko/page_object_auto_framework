package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SomePage extends BasePage {

  public SomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }


  @FindBy(xpath = "//span[contains(text(),'SignUp')]/..")
  private WebElement signUpButton;

  @FindBy(css = "img[alt='logo.png']")
  private WebElement logoImg;




}
