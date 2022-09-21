package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage2;

public class BaseTest {

	WebDriver driver;
	WebElement txtEmail;
	ReadConfigData conf;
	LoginPage2 lp;	
	

	@BeforeTest
	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		conf = new ReadConfigData();
		System.out.println(conf.getApplicationURL_QA());

		// Create an Object
		LoginPage lp = new LoginPage(driver);

		driver.get(conf.getApplicationURL_QA());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
	}

}
