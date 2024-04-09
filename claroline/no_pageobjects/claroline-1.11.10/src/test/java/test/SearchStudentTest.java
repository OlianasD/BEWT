package test;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;



public class SearchStudentTest extends BaseTest {

	@Test
	public void testClarolineSearchStudent() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Advanced")).click();
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("testuser1");
		new Select(driver.findElement(By.id("action"))).selectByVisibleText("Student");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/table/tbody/tr[7]/td[2]/input")).click();
		assertTrue(driver.findElement(By.id("L0")).getText().contains("testuser1"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
