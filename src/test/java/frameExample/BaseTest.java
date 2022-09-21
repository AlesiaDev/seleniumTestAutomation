package frameExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	WebDriver driver;
	WebElement txtEmail;
	ReadConfigData conf;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		conf = new ReadConfigData();
		System.out.println(conf.getApplicationURL_QA());
		
		driver.get("https://paytm.com/");
		//driver.get(conf.)
		driver.manage().window().maximize();
	}

	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
}
