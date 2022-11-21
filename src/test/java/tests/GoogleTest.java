package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;


public class GoogleTest extends BaseTest {

  @Test
  public void verifyGoogleIsOpenedTest(){
    driver.get("https://www.google.com/");
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Google']")));
    assertThat(driver.getTitle(),equalTo("Google"));
    assertThat(driver.getCurrentUrl(),not(containsString("google.co.in")));
  }
}
