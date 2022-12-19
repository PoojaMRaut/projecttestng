package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppageobjects {

	
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	
	private By Lastname=By.xpath("//input[@name='UserLastName']");
	
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	
	private By companyemployee=By.xpath("//select[@name='CompanyEmployees']");
	
	
	

	public signuppageobjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}


	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterlastname()
	{
		return driver.findElement(Lastname);
	}
	
	public WebElement jobtitle()
	{
		return driver.findElement(jobtitle);
	}
	
	public WebElement Cemployee()
	{
		return driver.findElement(companyemployee);
	}
	
	public WebElement selectcountry()
	{
		return driver.findElement(country);
	}
	
}
