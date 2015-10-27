package pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_Page {
	public static WebDriver driver;
	
	static By clickClose = By.cssSelector("#welcome_close");
	static By clickLogin = By.cssSelector("#myaccountlogin>a:nth-child(1)");
	static By clickRegister = By.cssSelector("#myaccountlogin>a:nth-child(2)");
	static By mouseOver = By.cssSelector("#topnav > li:nth-child(3) > a");
	static By ListOfElements = By.cssSelector("#topnav > li:nth-child(3) > ul > li");
	static By RegGetText = By.cssSelector(".success-msg>ul>li>span");
	static By CheckLogIn = By.cssSelector(".sub-title-text");
	static By mouseOver1 = By.cssSelector("#topnav > li:nth-child(3) > a");
	static By itemOnList = By.cssSelector(".auto-menue-bg>a");
	static By getTextOnClickItem = By.cssSelector(".category-title");
	
	public Home_Page(WebDriver driver){
		Home_Page.driver=driver;
	}

	
	public void Click_LogIn() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.presenceOfElementLocated(clickLogin));
		driver.findElement(clickLogin).click(); 	
	}
	
	public void click_Register(){
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.presenceOfElementLocated(clickRegister));
		driver.findElement(clickRegister).click();
	}
	public void checkAssertEqual(){
		String f;
		  f = driver.findElement(RegGetText).getText();
		  Assert.assertEquals(f, "Thank you for registering with Harbor Freight Tools.");
		  System.out.print("Registered Successfully");
	}
	
	public void checkLoginSuccess(){
		String s;
		  s = driver.findElement(CheckLogIn).getText();
		  Assert.assertEquals(s, "LOGGED IN AS:");
		  System.out.print("Logged in Successfully");
	}
	
	public void AssertTestForEnteredinListItem(){
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(mouseOver1)).perform();
		String s = new String();
		s = driver.findElement(itemOnList).getText();
		driver.findElement(itemOnList).click();
		String s1;
		s1=driver.findElement(getTextOnClickItem).getText();
		s1=s1.toUpperCase();
		Assert.assertEquals(s1, s);

		System.out.print("Successfully Entered");
	}
	public void DragElementsFromDropdown(){
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(mouseOver)).perform();
		List<WebElement> drop = driver.findElements(ListOfElements);
		System.out.println("Total items are"+drop.size());
		for(WebElement ele :drop){
		System.out.println(ele.getText());
	}
		}
	
	
	public void popUpClose() {
		try{
			WebDriverWait wait = new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.presenceOfElementLocated(clickClose));
			driver.findElement(clickClose).click();
			System.out.println("unexpected alert present");
			}
		catch(Exception e)
			{ 
			 System.out.println("unexpected alert not present");   
			}
	}
}
