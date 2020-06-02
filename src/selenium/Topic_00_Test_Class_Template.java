package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_00_Test_Class_Template {
  WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();

  }
  
  @Test
  public void TC_01_ClassName() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.className("validate-email")).sendKeys("trantranlt2016@gmail.com");
	  driver.findElement(By.className("validate-password")).sendKeys("123456789");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.className("send2")).click();
  }
  
  @Test
  public void TC_02_ID() {
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}