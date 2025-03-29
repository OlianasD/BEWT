package mediawiki;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	@Before
	public void login() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-gpu", "--window-size=1920x1080", "--lang=en");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080");
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
