package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObjectModel.loginpageobjects;
import PageObjectModel.signuppageobjects;
import resources.baseclass;
import resources.commonmethods;
import resources.constant;

public class signuptestcases extends baseclass {

	
	

	@Test
	public void verifysignup() throws IOException, InterruptedException
	{

		 loginpageobjects lpo=new  loginpageobjects(driver);
		 
		 Thread.sleep(5000);
		 lpo.clickontryforfree().click();
		 Thread.sleep(5000);
		 signuppageobjects spo=new signuppageobjects(driver);
		 
		 
		 spo.enterfirstname().sendKeys(constant.firstname);
		 spo.enterlastname().sendKeys(constant.lastname);
		 
		commonmethods.selectdropdown(spo.Cemployee(), 1);
		commonmethods.selectdropdown(spo.selectcountry(), 3);
		 
		 
		
		
		 
	}
	
}
