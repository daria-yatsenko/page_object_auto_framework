package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

  public void onTestStart(ITestResult result) {
    System.out.println("onTestStart "+result.getName());
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println("onTestSuccess "+result.getName());

  }

  public void onTestFailure(ITestResult result) {
    System.out.println("onTestFailure "+result.getName());

  }

}
