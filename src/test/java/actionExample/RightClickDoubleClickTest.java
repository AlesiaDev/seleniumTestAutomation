package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest extends BaseTest {
	
	@Test
	public void RightClickTest() {
		
		Actions act = new Actions(driver);
		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(), 'right')]"));
		act.contextClick(rightButton).perform();
		
	}

}
