package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}

	@Test
	public void javaSeacrchTest() {

		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
