package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExerciseIphone {
	 
	WebDriver driver;
	
	@AfterTest
    public void closeApp() throws Exception {
		
			Thread.sleep(5000);
			driver.close();
	}
	
	@Test
	public void SearchIphone() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.it/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Iphone 14");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
				
		String titleAfterSearch = driver.getTitle();
		System.out.println("Title after search : " + titleAfterSearch);
	
	}

}
