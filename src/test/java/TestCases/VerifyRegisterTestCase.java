package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import PageObjectmodel.RegisterPageObject;
import Resources.BaseClass;


public class VerifyRegisterTestCase extends BaseClass {
	

	
	@Test
	public void Register() throws IOException {
		
		browserlaunch();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		RegisterPageObject rpo=new RegisterPageObject(driver);
		rpo.clickaccount().click();
		
	}

}
