package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/scroll");
		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		name.sendKeys("Test User");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("01/01/2020");
		Thread.sleep(2000);
		driver.quit();
	}
}
