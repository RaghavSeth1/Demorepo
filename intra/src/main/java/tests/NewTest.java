package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
	
  @Test
  public void openMyBlog() {
	  driver.get("http://a.testaddressbook.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Address Book"));
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Raghav\\Selenium\\executables\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}