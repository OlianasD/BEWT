package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class EnrolPasswordCourseGoodPasswordUserTest extends BaseTest {

	@Test
	public void testClarolineEnrolPasswordCourseGoodPasswordUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("user001");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Enrol on a new course")).click();
		driver.findElement(By.id("coursesearchbox_keyword")).clear();
		driver.findElement(By.id("coursesearchbox_keyword")).sendKeys("Course002");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/button")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/dl[1]/dt[1]/a[1]/img")).click();
		driver.findElement(By.name("registrationKey")).clear();
		driver.findElement(By.name("registrationKey")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[2]/form/p/input")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div")).getText()
				.contains("You've been enrolled on the course"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
