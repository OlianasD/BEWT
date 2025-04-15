package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class MakeCourseExerciseVisibleTest extends BaseTest {

	@Test
	public void testClarolineMakeCourseExerciseVisible() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[4]/a/img"))
						.getAttribute("alt").contains("Make visible"));
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[4]/a/img")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[4]/a/img"))
						.getAttribute("alt").contains("Make invisible"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
