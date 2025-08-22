package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/dragdrop");
		Thread.sleep(2000);

		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(image, box).build().perform();
		Thread.sleep(2000);

		driver.quit();
	}
}
