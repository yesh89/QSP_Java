package TestSample;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.ConfirmationPage;
import pages.FormPage;

public class TestForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.driver.webdriver",
				"C:\\Users\\Yeshwanth.B\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.35.0");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		FormPage form = new FormPage();
		form.submitForm(driver);
		Thread.sleep(2000);
		String expectedText = "The form was successfully submitted!";
		ConfirmationPage confirmationPage = new ConfirmationPage();
		assertEquals(confirmationPage.getAlertBannerText(driver), expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}
