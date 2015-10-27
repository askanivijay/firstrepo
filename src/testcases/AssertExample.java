package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.Home_Page;

public class AssertExample {
	public WebDriver driver = new FirefoxDriver();

	@BeforeMethod
	public void BefMethod(){
		driver.manage().window().maximize();
		driver.get("http://www.harborfreight.com/");
		Home_Page hp = new Home_Page(driver);
		hp.popUpClose();
		}
	@Test
	public void testAssert(){
		Home_Page hp = new Home_Page(driver);
		hp.AssertTestForEnteredinListItem();
	}

	@AfterMethod

	public void quitDriver(){
		driver.quit();
	}

}



