package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
		radioButton1.click();
		Thread.sleep(2000);
		WebElement radioButton2 = driver.findElement(By.cssSelector("input[value=option2]"));
		radioButton2.click();
		Thread.sleep(2000);
		WebElement radioButton3 = driver.findElement(By.xpath("//html/body/div/div[3]/input"));
		radioButton3.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
