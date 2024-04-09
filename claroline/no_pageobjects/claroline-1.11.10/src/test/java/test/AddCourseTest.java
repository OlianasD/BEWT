package test;

import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class AddCourseTest extends BaseTest {

	@Test
	public void testClarolineAddCourse() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Create course")).click();
		driver.findElement(By.id("course_title")).clear();
		driver.findElement(By.id("course_title")).sendKeys("Course001");
		driver.findElement(By.id("course_officialCode")).clear();
		driver.findElement(By.id("course_officialCode")).sendKeys("001");
		new Select(driver.findElement(By.id("mslist2"))).selectByVisibleText("Sciences");
		driver.findElement(By.xpath("//a[@class=\"msremove\"]")).click();
		driver.findElement(By.id("registration_true")).click();
		driver.findElement(By.id("access_public")).click();
		driver.findElement(By.name("changeProperties")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div")).getText().contains("You have just created the course website : 001"));
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
