package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonmethods {

	public static void selectdropdown(WebElement DropDown, int index) {
		
		
		 Select s =new Select(DropDown);
		 s.selectByIndex(index);
		
		
		
	}
	
	public static void handleassertion(String actualstr, String expectedstr) {
		
		 SoftAssert assertion=new SoftAssert();
		 String actual=actualstr;
		 String expected=expectedstr;
		 assertion.assertEquals(actual, expected);
		 assertion.assertAll();
		
		
	}
	
}
