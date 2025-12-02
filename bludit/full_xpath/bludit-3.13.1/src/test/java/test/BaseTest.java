package test;

import com.github.paolobd.gamegui.GameGui;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	
	public WebDriver driver;
	protected static final String password = "password";
	protected static final String username = "admin";
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", /*"--headless",*/ "--disable-gpu", "--window-size=1920x1080");
        driver = new ChromeDriver(chromeOptions);
		driver = GameGui.gamifyWebDriver(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8989/admin");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
