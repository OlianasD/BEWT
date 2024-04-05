package base;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import po.BaseNavBar;
import po.EditProfilePage;

public class BaseTest {

	protected static final String adminUser = "administrator";
	protected static final String adminPsw = "root";
	protected WebDriver driver;

	@Before
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-gpu", "--window-size=1920x1080", "--lang=en");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080");
	}
	
	protected EditProfilePage loginAsAdmin() {
		return new BaseNavBar(driver)
			.authorLogin()
			.setUsername(adminUser)
			.setPassword(adminPsw)
			.login();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}