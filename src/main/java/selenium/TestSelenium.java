package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	public static void main(String[] args){
		String exePath ="./driver/chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
