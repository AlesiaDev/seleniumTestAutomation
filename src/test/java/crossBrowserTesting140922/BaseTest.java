package crossBrowserTesting140922;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	ReadConfigData conf;

	@Parameters("SopraSteriaBrowser")
	@BeforeTest
	public void launchApp(String browser) throws Exception {

		System.out.println("Browser Value: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			// default - browser
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		conf = new ReadConfigData();
		System.out.println(conf.getApplicationURL_QA());

		driver.get(conf.getApplicationURL_QA());
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
	}

	@BeforeMethod
	public void delay() throws Exception {
		Thread.sleep(2000);
	}

}
