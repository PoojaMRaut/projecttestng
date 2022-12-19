package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	
	
	public WebDriver driver;
	
	public void initialisation() throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\testng\\src\\main\\java\\resources\\data.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
		 driver=new ChromeDriver();
			
			//driver.get("https://www.makemytrip.com/");
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			
			
		}
		else {
			System.out.println("enter browser name");
		}
		
	}

	
	@BeforeMethod
	 public void lounch() throws IOException {
 initialisation();
		 
		 driver.get("https://login.salesforce.com/");
	 }
}
