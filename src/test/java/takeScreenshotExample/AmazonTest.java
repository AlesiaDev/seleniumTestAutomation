package takeScreenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;
	ReadConfigData conf;

	@BeforeTest
	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		conf = new ReadConfigData();
		System.out.println(ReadConfigData.getDropDownApp());

		// driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void searchTest() throws Exception {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");

		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();

		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().contains("iphone 14"));

		// takescreenshot
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetLocation = new File("./screenshot/AmazonSearchItems.png");

		FileUtils.copyFile(screenshotFile, targetLocation);

	}

}
