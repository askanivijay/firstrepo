package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegister_Page {
	static WebDriver driver;

	static By Firstname = By.cssSelector("#firstname");
	static By Middlename = By.cssSelector("#middlename");
	static By LName = By.cssSelector("#lasttname");
	static By Email = By.cssSelector("#email_address");
	static By Pswd = By.cssSelector("#passwo");
	static By ConfPswd = By.cssSelector("#confirmation");
	static By ZipCode = By.cssSelector("#zip");
	static By CreateAcc = By.cssSelector("#btn_create_account");



	public CustomerRegister_Page(WebDriver driver){
		CustomerLoginPage.driver = driver;
	}
	public void firstName(){
		driver.findElement(Firstname).sendKeys("vijay");

	}

	public void middleName(){
		driver.findElement(Middlename).sendKeys("A");

	}

	public void lastName(){
		driver.findElement(LName).sendKeys("kumar");

	}

	public void enterEmail(){
		driver.findElement(Email).sendKeys("vijayaskani007@gmail.com");

	}

	public void enterPwd(){
		driver.findElement(Pswd).sendKeys("vijay@123");

	}

	public void confirmPwd(){
		driver.findElement(ConfPswd).sendKeys("vijay@123");

	}
	public void zipCode(){
		driver.findElement(ZipCode).sendKeys("90001");

	}

	public void clickButton(){
		driver.findElement(CreateAcc).click(); 

	}
}
