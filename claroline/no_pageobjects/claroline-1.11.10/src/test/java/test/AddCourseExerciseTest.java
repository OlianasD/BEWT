package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class AddCourseExerciseTest extends BaseTest {

	@Test
	public void testClarolineAddCourseExercise() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.linkText("New exercise")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Exercise 001");
		driver.findElement(By.xpath("//*[@id='courseRightContent']/form/div[2]/input")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/div[2]/div")).getText().contains("Exercise added"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
