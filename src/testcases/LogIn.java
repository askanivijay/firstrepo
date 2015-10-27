
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.CustomerLoginPage;
import pomClasses.Home_Page;

public class LogIn {
		WebDriver driver = new FirefoxDriver();
		
		@BeforeMethod
		public void BefMethod(){
		driver.manage().window().maximize();
		driver.get("http://www.harborfreight.com/");
		Home_Page hp = new Home_Page(driver);
		hp.popUpClose();
		}
		
		@Test
		public void atTest() throws InterruptedException{ 
		Home_Page hp = new Home_Page(driver);
		Thread.sleep(5000);
		hp.Click_LogIn();
		CustomerLoginPage clp = new CustomerLoginPage(driver); 
		clp.logInUser("divya.dimple1209@gmail.com", "vijay@123");
		}
		
		@AfterMethod
		public void QuitDriver(){
			  driver.quit();
		}
			  }
			
		
	
	


