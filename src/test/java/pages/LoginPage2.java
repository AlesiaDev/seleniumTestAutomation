package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage2 {

	WebDriver driver;

	public LoginPage2(WebDriver rdriver) {

		// this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Identification

//	By txt_email = By.xpath("//input[@id='Email']");
//	By txt_pwd = By.xpath("//input[@type='password']");
//	By chk_rem = By.xpath("//input[@name='RememberMe']");
//	By btn_login = By.xpath("//button[text()='Log in']");

	
	
	//@C
	@FindBy(xpath= "//input[@id='Email']")
	WebElement input_email;
	
	
	@FindBy(how = How.XPATH , using ="//input[@id='Email']")
	WebElement input_Email;
	
	
	@FindBy(css= "input[type='password']")
	WebElement input_pass;
	
	
	@FindBy(name= "RememberMe")
	WebElement chk_Remember;
	
	
	@FindBy(xpath= "//button[text()='Log in']")
	WebElement Btn_Login;
	
	
	// Methods
	public void enterEmail(String email) {

		input_Email.clear();     //identify using how
		input_email.sendKeys(email);
	}

	// generic method
	public void enterValueIntoTextBox(By locator, String value) {

		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);

	}
	
	
	// generic method
		public void enterValueIntoTextBox(WebElement ele, String value) {

			ele.clear();
			ele.sendKeys(value);

		}

	public void enterPassword(String pwd) {

		enterValueIntoTextBox(input_pass, pwd);

	}

	public void click_Rem_check() {

		chk_Remember.click();

	}

	public void click_LoginButton() {

		// driver.findElement(btn_login).click();

		try {
			
			
			Btn_Login.click();

		} catch (Exception e) {

			System.out.println("Exception : " + e.getMessage());
			System.out.println("StackTrace : " + e.getStackTrace());
		}

	}

	public void verifyApplicationTitle(String expectedTitle) {

		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}

}
