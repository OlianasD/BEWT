package test;

import java.util.concurrent.TimeUnit;

import com.github.paolobd.gamegui.GameGui;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-gpu", "--window-size=1920x1080");
		driver = new ChromeDriver(chromeOptions);
		driver = GameGui.gamifyWebDriver(driver);
		driver.get("http://localhost:8989");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void quit() {
		driver.quit();
	}

}
