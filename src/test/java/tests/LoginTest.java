package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	
	@Test
	public void verifyLogin() {
		
		//before login
		//Thread.sleep(0);
		lp.verifyApplicationTitle("Your store. Login");
		
		
		
		lp.enterEmail("admin@yourstore.com");
		lp.enterPassword("admin");
		lp.click_Rem_check();
		lp.click_LoginButton();
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//after login
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		
		
		
	}
	

	
	
}
