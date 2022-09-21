package logExsamleLog4j;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPComm extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verifyLogin() {
		
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys(conf.getUserName());
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys(conf.getPass());
		driver.findElement(By.tagName("button")).click();
		
		
	}
	
	
	@Test(priority = 3)
	public void verifyLogout() {
		
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@Test(priority = 2)
	public void verifyAppTitle() {
		
		
		String actualAppTitle = driver.getTitle();
		System.out.println("Application title: " + actualAppTitle);
		
		
	}

}
