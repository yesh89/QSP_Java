package TestSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("01/01/2025");
		dateField.sendKeys(Keys.RETURN);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(2000);
		driver.quit();
	}
}
