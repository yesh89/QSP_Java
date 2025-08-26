package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
	public static void main(String[] args) {
		try {
			System.setProperty("chrome.webdriver.driver",
					"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://formy-project.herokuapp.com/keypress");
			driver.manage().window().maximize();
			WebElement name = driver.findElement(By.id("name"));
			name.click();
			name.sendKeys("Test User");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.id("button"));
			button.click();
			driver.quit();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
