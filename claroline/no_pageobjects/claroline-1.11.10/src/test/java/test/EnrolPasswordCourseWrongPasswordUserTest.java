package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class EnrolPasswordCourseWrongPasswordUserTest extends BaseTest {

	@Test
	public void testClarolineEnrolPasswordCourseWrongPasswordUser() throws Exception {
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
		driver.findElement(By.name("registrationKey")).sendKeys("0v3rtlyC0mpl1c4t3dPsW");
		driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[2]/form/p/input")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[1]")).getText()
				.contains("Invalid enrolment key given"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
