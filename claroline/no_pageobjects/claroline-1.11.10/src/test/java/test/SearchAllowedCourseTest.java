package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class SearchAllowedCourseTest extends BaseTest {

	@Test
	public void testClarolineSearchAllowedCourse() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/ul/li[2]/ul/li[1]/form/small/a")).click();
		driver.findElement(By.id("intitule")).clear();
		driver.findElement(By.id("intitule")).sendKeys("Course001");
		driver.findElement(By.id("subscription_allowed")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/form/fieldset/input")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[2]/a")).getText()
				.contains("Course001"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
