package fileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class File_Exercise_MonsterIndia {

	@Test

	public void verifyCvUpload() {

		// WebDriver driver = WebDriverManager.chromedriver().create();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(Constants.URL_monsterIndia);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement file_upload = driver.findElement(By.id("file-upload"));

		file_upload.sendKeys("C:\\Users\\alhrashchanka\\Desktop\\PaesOrdinarioComunicazioneAvvioSezione.pdf");


	}

}
