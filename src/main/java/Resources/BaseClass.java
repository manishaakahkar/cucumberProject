package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void browserlaunch() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\20thJuneTestNgframework\\src\\main\\java\\Resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\chrome\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
		}
		
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			
		}
		
		else 
		{
			System.out.println("enter proper browser");
		}
	}

}
