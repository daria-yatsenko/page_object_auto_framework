package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SomePage;


public class SomeTest extends BaseTest {

  @BeforeClass
  public void initPages(){
    somePage = new SomePage(driver);
  }

  @Test
  public void someTestMethod(){
    System.out.println("invoke test method");
  }
}
