package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) {
		try {
			System.setProperty("chrome.webdriver.driver",
					"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
			driver.manage().window().maximize();
			WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
			checkBox1.click();
			Thread.sleep(2000);
			WebElement checkBox2 = driver.findElement(By.cssSelector("input[value=checkbox-2]"));
			checkBox2.click();
			Thread.sleep(2000);
			WebElement checkBox3 = driver
					.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
			checkBox3.click();
			Thread.sleep(2000);
			driver.quit();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
