package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;


public class SearchAdminTest extends BaseTest {


	@Test
	public void testClarolineSearchAdmin() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Advanced")).click();
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Doe");
		new Select(driver.findElement(By.id("action"))).selectByVisibleText("Platform administrator");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/table/tbody/tr[7]/td[2]/input")).click();
		assertTrue(driver.findElement(By.id("L0")).getText().contains("Doe"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
