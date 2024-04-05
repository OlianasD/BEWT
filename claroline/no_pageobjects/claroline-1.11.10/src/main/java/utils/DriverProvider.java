package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverProvider {
	
	private static DriverProvider ourInstance = new DriverProvider();
	
	private DriverProvider() {
		WebDriverManager.chromedriver().setup();
		
	}
	
	public WebDriver getDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-gpu", "--window-size=1920x1080");
		return new ChromeDriver(chromeOptions);
	}
	
	public static DriverProvider getInstance() {
		return ourInstance;
	}

}
