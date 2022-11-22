package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SomePage extends BasePage {

  public SomePage(WebDriver driver) {
    //use driver from parent class
    super(driver);
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
  }

//  @FindBy(id = "the fastest locator")
//  private WebElement id;
//
//  @FindBy(className = "the second fastest locator")
//  private WebElement className;
//
//  @FindBy(tagName = "the third fastest locator")
//  private WebElement tagName;
//
//  @FindBy(name = "the fourth fastest locator")
//  private WebElement name;
//
//  @FindBy(linkText = "the fifth fastest locator")
//  private WebElement linkText;
//
//  @FindBy(css = "the sixth fastest locator")
//  private WebElement css;
//
//  @FindBy(xpath = "the seventh fastest locator")
//  private WebElement xpath;



}
