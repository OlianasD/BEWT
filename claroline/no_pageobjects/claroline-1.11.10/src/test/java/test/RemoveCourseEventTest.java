package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class RemoveCourseEventTest extends BaseTest {

	@Test
	public void testClarolineRemoveCourseEvent() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLCAL")).click();
		driver.findElement(By.linkText("Clear up event list")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/div[2]/div")).getText()
				.contains("All events deleted from the agenda"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
