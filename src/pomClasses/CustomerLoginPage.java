package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerLoginPage {

	static WebDriver driver;
	static By Username = By.cssSelector("#email");
	static By Password = By.cssSelector("#pass");
	static By ClickLogin = By.cssSelector("#sign-in-button");

	public CustomerLoginPage(WebDriver driver){
		CustomerLoginPage.driver = driver;
	}
	public void enterUsername(String username){
		WebDriverWait wait= new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.presenceOfElementLocated(Username));
		driver.findElement(Username).sendKeys(username);
	}
	public static void enterPassword(String password){
		driver.findElement(Password).sendKeys(password);
	}
	public static void clickLogin(){
		driver.findElement(ClickLogin).click(); 
	}

public void	logInUser(String User, String pwd){
	
	enterUsername(User);
	enterPassword(pwd);
	clickLogin();
}

}
