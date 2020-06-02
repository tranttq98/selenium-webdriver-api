package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_WebElement_Commands {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		//Run on FireFox older (Firefox 47.0.2)
		//driver = new FirefoxDriver();
		
		//Run on FireFox older (Firefox 73.0.1)
		System.setProperty("webdriver.gecko.driver", 
				"I:\\[Course] Selenium WebDrive API in Java\\[2] - SeleniumWebdriverAPI\\Library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		// Login Page Url matching
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println(loginPageUrl);
		Assert.assertEquals(loginPageUrl, "http://demo.guru99.com/v4/");
	}

	@Test
	public void TC_02_ValidatePageTitle() {
		// Login Page title
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		Assert.assertEquals(loginPageTitle, "Guru99 Bank Home Page");
	}

	@Test
	public void TC_03_LoginFormDisplayed() {
		// Login form displayed
		boolean loginFormStatus = driver.findElement(By.xpath("//form[@name='frmLogin']")).isDisplayed();
		System.out.println("Login form status" + "-" + loginFormStatus);
		Assert.assertTrue(loginFormStatus);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}