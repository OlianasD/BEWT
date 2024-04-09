package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class ViewProfileStatisticsUserTest extends BaseTest {

	@Test
	public void testClarolineViewProfileStatisticsUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("user001");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password001");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Manage my account")).click();
		driver.findElement(By.linkText("View my statistics")).click();
		new Select(driver.findElement(By.id("cidReq"))).selectByVisibleText("Course001");
		assertTrue(driver.findElement(By.linkText("Exercise 001"))
				.getText().contains("Exercise 001"));
		assertTrue(driver.findElement(By.xpath("//*[@id='leftContent']/div[4]/div[1]/table/tbody/tr[1]/td[3]"))
				.getText().contains("9"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
