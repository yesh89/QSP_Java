package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Uses of JavaScriptExecutor - 
//1. When WebDriver fails to click on any Element
//2. To Trigger actions on a page
//3. To perform movement of a page

public class ExecuteJavaScript {
	public static void main(String[] args) {
		try {
			System.setProperty("chrome.webdriver.driver",
					"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/modal");
			Thread.sleep(1000);
			WebElement modalButton = driver.findElement(By.id("modal-button"));
			modalButton.click();
			WebElement closeButton = driver.findElement(By.id("close-button"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeAsyncScript("arguments[0].click;", closeButton.click());
//			js.executeAsyncScript("arguments[0].click;", closeButton.click());

			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
