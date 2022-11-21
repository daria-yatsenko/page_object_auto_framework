package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.SomePage;
import utils.ConfProperties;

import java.time.Duration;

public class BaseTest {
  protected WebDriver driver;
  protected WebDriverWait wait;
  protected SomePage somePage;

  @BeforeClass
      (alwaysRun = true)
  public void launch(){
    System.setProperty(ConfProperties.getProperty("chromeKey"),ConfProperties.getProperty("chromedriver"));
    ChromeOptions options = new ChromeOptions();
    if(ConfProperties.getProperty("headless_mode").equals("true"))
      options.addArguments("--headless");
    driver = new ChromeDriver(options);
    driver.manage().window().setSize(new Dimension(1280,800));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  }



  @AfterClass
      (alwaysRun = true)
  public void turnDown(){
    driver.quit();
  }
}
