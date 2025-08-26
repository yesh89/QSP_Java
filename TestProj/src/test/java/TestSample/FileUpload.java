package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.webdriver.driver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/fileupload");
		WebElement fileUploadElement = driver.findElement(By.id("file-upload-field"));
		fileUploadElement.sendKeys("test.txt");
		Thread.sleep(2000);
		driver.quit();
	}
}
