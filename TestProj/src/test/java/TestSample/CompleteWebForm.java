package TestSample;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteWebForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.driver.webdriver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		submitForm(driver);
		Thread.sleep(2000);
		String expectedText = "The form was successfully submitted!";
		assertEquals(getAlertBannerText(driver), expectedText);
		Thread.sleep(2000);
		driver.quit();
	}

	public static void submitForm(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Test");
		driver.findElement(By.id("last-name")).sendKeys("User");
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("08/25/2025");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

	public static String getAlertBannerText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}
}
