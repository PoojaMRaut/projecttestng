package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageObjectModel.loginpageobjects;
import resources.baseclass;
import resources.commonmethods;
import resources.constant;

public class loginPagetestcases extends baseclass {
	
	@Test
	public void browserlaunch() throws IOException, InterruptedException {
		
		 
		 loginpageobjects lpo=new  loginpageobjects(driver);
		 lpo.enterusername().sendKeys(constant.username);
		 lpo.enterpassword().sendKeys(constant.password);
		 lpo.clickonlogin().click();
		 
		 
		 Thread.sleep(5000);
		 
		 
		 commonmethods.handleassertion(lpo.errormsg().getText(),constant.errormsg);
	
	}

}
