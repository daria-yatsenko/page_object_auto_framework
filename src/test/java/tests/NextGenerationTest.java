package tests;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utils.ConfProperties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;


public class NextGenerationTest extends BaseTest {

  RandomString randomString=new RandomString(5);

  @Test
  public void  loginNextGenerationAutomationTest(){
    driver.get("https://www.nextgenerationautomation.com/");
    assertThat(driver.getTitle(),containsString("Next Generation Automation"));
    signUpPage.clickOnSignUpButton();
    signUpPage.fillInFirstNameWith(ConfProperties.getProperty("firstName"));
    signUpPage.fillInLastNameWith(ConfProperties.getProperty("lastName"));
    signUpPage.fillInEmailWith(randomString.nextString()+ConfProperties.getProperty("emailDomain"));
    signUpPage.fillInCityWith(ConfProperties.getProperty("workCity"));
    signUpPage.fillInNumberWith(ConfProperties.getProperty("mobileNumber"));
    signUpPage.fillInPasswordWith(ConfProperties.getProperty("password"));
    signUpPage.clickOnSubmitButton();


  }
}
