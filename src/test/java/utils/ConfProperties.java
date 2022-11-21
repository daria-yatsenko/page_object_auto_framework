package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
  protected static FileInputStream fileInputStream;
  protected static FileInputStream fileInputStream1;

  protected static Properties PROPERTIES;
  static {
    try {
      fileInputStream = new FileInputStream("src/test/resources/config.properties");
      fileInputStream1 = new FileInputStream("src/test/resources/nextGenerationTestData.properties");
      PROPERTIES = new Properties();
      PROPERTIES.load(fileInputStream);
      PROPERTIES.load(fileInputStream1);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (IOException e) {
          e.printStackTrace(); } } }

  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key); }
}
