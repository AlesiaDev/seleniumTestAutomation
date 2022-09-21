package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PayTMIFrameExample extends BaseTest{
	
	
	
	@Test
	public void verifyFrameTest() throws Exception {
		
		
		//Click on Sign
		driver.findElement(By.xpath("//span[contains(text(),'ign')]")).click();
		
		
		//driver.switchTo()   ----- not required
		
		//Indexing - 0
		
		//driver.switchTo().frame(0);
		
		//Name or ID
		//driver.switchTo().frame("name/id");
		
		//WebElement
		
		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@src,'sIframe')]"));
		
		driver.switchTo().frame(myFrame);
		
		
		Thread.sleep(4000);
		
		String actualHeading = driver.findElement(By.cssSelector(".heading")).getText();
		driver.findElement(By.cssSelector("span[ng-click=\"toggleIntroVideo()\"]")).click();
		
		System.out.println("Heading: " + actualHeading);
		
		
		
	}

}
