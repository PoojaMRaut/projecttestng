package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobjects {

	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By error=By.xpath("//div[@id='error']");
	private By login=By.xpath("//input[@id='Login']");
	
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	
	public loginpageobjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement enterusername() {
		
		
		return driver.findElement(username);
	}
	
public WebElement enterpassword() {
		
		
		return driver.findElement(password);
	}
	
public WebElement clickonlogin() {
	
	
	return driver.findElement(login);
}

public WebElement clickontryforfree() {
	
	
	return driver.findElement(tryforfree);
}

public WebElement errormsg() {
	
	
	return driver.findElement(error);
}
}
