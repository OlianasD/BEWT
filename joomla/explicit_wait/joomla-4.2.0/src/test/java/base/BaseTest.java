package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import po.BaseNavBar;
import po.ProfilePageInfo;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
	
	protected static final String rootPassword = "dodicicaratteri";
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		setupRemoteWebdriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.141:3000/");
	}

	public void setupNativeBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-search-engine-choice-screen", "--headless=new", "--disable-gpu", "--screen-info={1920x1080}");
		options.setBrowserVersion("127");
		driver = new ChromeDriver(options);
	}

	public void setupRemoteWebdriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless=new", "--disable-gpu", "--screen-info={1920x1080}");
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	protected ProfilePageInfo loginAsAdmin() {
		return new BaseNavBar(driver)
			.authorLogin()
			.setUsername("administrator")
			.setPassword(rootPassword)
			.login();
	}
}
