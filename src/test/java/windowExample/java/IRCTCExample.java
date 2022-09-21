package windowExample.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IRCTCExample extends BaseTest {

	@Test
	public void verifyFrameTest() throws Exception {
		
		
		String parenteWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parenteWindow);

		// lick on OK button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		// click on hotel tab
		driver.findElement(By.linkText("HOTELS")).click();

		//===================================================
		
		
		Set<String> allWindow = driver.getWindowHandles();
		
		String mainWindow = (String) allWindow.toArray()[0]; 
	    String hotelWindow = (String) allWindow.toArray()[1]; 
	 
	    System.out.println("Parent Window: " + mainWindow);
	    System.out.println("Parent Window: " + hotelWindow);
	 
	 
	    Thread.sleep(5000);
	    //Switch to Hotel Window
	    driver.switchTo().window(hotelWindow);
	    
	  //Switch to Main Window
	    driver.switchTo().window(mainWindow);
	    
	  //Switch on ContactUs
	    driver.findElement(By.linkText("CONTACT US")).click();
	    
	    Thread.sleep(5000);
	    //Switch to Hotel Window
	    driver.switchTo().window(hotelWindow);
	    
        //Click on login
	    driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
