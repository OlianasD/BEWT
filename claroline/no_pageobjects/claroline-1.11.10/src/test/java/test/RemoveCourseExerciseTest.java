package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveCourseExerciseTest extends BaseTest {


	@Test
	public void testClarolineRemoveCourseExercise() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[1]/a")).getText()
				.contains("Exercise 001"));
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[3]/a/img")).click();
		driver.switchTo().alert().accept();
		assertFalse(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]")).getText().contains("Exercise 001"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
