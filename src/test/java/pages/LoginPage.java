package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// this.driver = driver;
		driver = rdriver;

	}

	// Identification

	By txt_email = By.xpath("//input[@id='Email']");
	By txt_pwd = By.xpath("//input[@type='password']");
	By chk_rem = By.xpath("//input[@name='RememberMe']");
	By btn_login = By.xpath("//button[text()='Log in']");

	// Methods
	public void enterEmail(String email) {

		driver.findElement(txt_email).clear();
		driver.findElement(txt_email).sendKeys(email);
	}

	// generic method
	public void enterValueIntoTextBox(By locator, String value) {

		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);

	}

	public void enterPassword(String pwd) {

		enterValueIntoTextBox(txt_pwd, pwd);

	}

	public void click_Rem_check() {

		driver.findElement(chk_rem).click();

	}

	public void click_LoginButton() {

		// driver.findElement(btn_login).click();

		try {
			
			
			driver.findElement(btn_login).click();

		} catch (Exception e) {

			System.out.println("Exception : " + e.getMessage());
			System.out.println("StackTrace : " + e.getStackTrace());
		}

	}

	public void verifyApplicationTitle(String expectedTitle) {

		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}

}
