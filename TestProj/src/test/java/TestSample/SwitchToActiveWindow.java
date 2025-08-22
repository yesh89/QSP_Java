package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//There are three ways to switch Windows
//1. driver.switchTo().window("windowName")
//2. driver.switchTo().frame(""frameName")
//3. driver.switchTo.alert()

public class SwitchToActiveWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/switch-window	");
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		Thread.sleep(2000);
		String originalWindowHandle = driver.getWindowHandle();
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(originalWindowHandle);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
