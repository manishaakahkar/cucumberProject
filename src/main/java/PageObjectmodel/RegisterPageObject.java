package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {
	
	
	public WebDriver driver;
	private By MyAccount=By.xpath("(//a[@class='dropdown-toggle'])[1]");
	
		
	

public RegisterPageObject(WebDriver driver2) {
		this.driver=driver2;
	}


public WebElement clickaccount() {
	
	return driver.findElement(MyAccount);

}


}
