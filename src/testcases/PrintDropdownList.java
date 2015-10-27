package testcases;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomClasses.Home_Page;

public class PrintDropdownList {
	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void BefMethod(){
		driver.manage().window().maximize();
		driver.get("http://www.harborfreight.com/");
		Home_Page hp = new Home_Page(driver);
		hp.popUpClose();
	}

	@Test
	public void UnderTest(){
		Home_Page hp = new Home_Page(driver);
		hp.DragElementsFromDropdown();
		}    
	
	@AfterTest
	public void QuitDriver(){
		driver.quit();    
	}

}



