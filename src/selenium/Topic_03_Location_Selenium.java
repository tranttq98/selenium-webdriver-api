package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_03_Location_Selenium {
  WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();

  }
  
  @Test
  public void TC_01_ID() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.id("email")).sendKeys("hoahong1@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("123456");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("send2")).click();
  }
  
  @Test
  public void TC_02_ClassName() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.className("validate-email")).sendKeys("trantranlt2016@gmail.com");
	  driver.findElement(By.className("validate-password")).sendKeys("123456789");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.className("send2")).click();
  }

  @Test
  public void TC_03_Name() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.name("login[username]")).sendKeys("hoahong2@gmail.com");
	  driver.findElement(By.name("login[password]")).sendKeys("123456789");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.name("send")).click();
  }
  
  @Test
  public void TC_04_LinkText() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  //click to Contact Us link
	  driver.findElement(By.linkText("CONTACT US")).click();
	  
	  //click to SITE MAP link
	  driver.findElement(By.linkText("SITE MAP")).click();
	  
	  Thread.sleep(1000);

  }
  
  @Test
  public void TC_05_PartialLinkText() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  //click to Contact Us link
	  driver.findElement(By.partialLinkText("CONTACT")).click();
	  
	  //click to SITE MAP link
	  driver.findElement(By.partialLinkText("MAP")).click();
	  

  }
  
  //Format Css: Tagname - Attribute - Value of attribute
  
  @Test
  public void TC_06_Css() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.cssSelector("#email")).sendKeys("tran1@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector(".validate-email")).sendKeys("tran2@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("input[type = 'email']")).sendKeys("tran3@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("input[title = 'Email Address'")).sendKeys("tran4@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("input[name = 'login[username]']")).sendKeys("tran5@gmail.com");
	  Thread.sleep(1000);
  }
  
  @Test
  public void TC_07_Xpath() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tran1@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@title='Email Address']")).sendKeys("tran4@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("tran5@gmail.com");
	  Thread.sleep(1000);
	  
//	  driver.findElement(By.xpath("//form[@id='login-form']//input[contains(@class,'validate-email']")).sendKeys("tran6@gmail.com");
//	  Thread.sleep(1000);
  }
  
  @Test
  public void TC_08_Tagname() throws Exception {
	  driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  
	  System.out.println("Links in My Account page = " + driver.findElement(By.tagName("a")).getSize());
	  
	  System.out.println("Buttons in My Account page = " + driver.findElement(By.tagName("button")).getSize());
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}