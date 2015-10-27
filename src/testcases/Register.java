
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomClasses.CustomerRegister_Page;
import pomClasses.Home_Page;

public class Register {
		WebDriver driver = new FirefoxDriver();
		
		@BeforeTest
		public void BefMethod(){
			driver.manage().window().maximize();
			driver.get("http://www.harborfreight.com/");
			Home_Page hp = new Home_Page(driver);
			hp.popUpClose();
			}
		
		@Test
		public void underTest() throws InterruptedException{
			Home_Page hp = new Home_Page(driver);
			Thread.sleep(5000);
			hp.click_Register();
			CustomerRegister_Page crp = new CustomerRegister_Page(driver);
			crp.firstName();
			crp.middleName();
			crp.lastName();
			crp.enterEmail();
			crp.enterPwd();
			crp.confirmPwd();
			crp.zipCode();
			crp.clickButton();
			hp.checkAssertEqual();
		}
		
		@AfterTest
		public void QuitDriver(){
driver.quit();
			  }
			
	}
	


