package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {

	protected WebDriver driver;
	public static final String app_url = "http://192.168.1.141:3000/claroline11110/claroline/index.php";

	@Before
	public void setUp(){
		setupRemoteWebdriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(app_url);
	}

	/*public void setupNativeBrowser() {
		System.out.println("Setting up native browser...");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-search-engine-choice-screen", "--disable-gpu", "--headless=new", "--screen-info={1920x1080}");
		options.setBrowserVersion("127");
		driver = new ChromeDriver(options);
	}*/

	public void setupRemoteWebdriver() {
		System.out.println("Setting up remote web driver...");
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
	public void tearDown(){
		driver.quit();
	}
}

