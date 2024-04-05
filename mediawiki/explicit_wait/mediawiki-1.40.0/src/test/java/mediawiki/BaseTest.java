package mediawiki;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import po.MainPage;

public class BaseTest {
	
	public static WebDriver driver;
	
	@Before
	public void login() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-gpu", "--window-size=1920x1080");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080");
	}
	
	protected MainPage loginAsAdmin() {
		return new MainPage(driver)
				.login()
				.setUsername("admin")
				.setPassword("Password001")
				.login();
	}
	
	protected MainPage loginAsUser() {
		return new MainPage(driver)
				.login()
				.setUsername("User001")
				.setPassword("Password001")
				.login();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
