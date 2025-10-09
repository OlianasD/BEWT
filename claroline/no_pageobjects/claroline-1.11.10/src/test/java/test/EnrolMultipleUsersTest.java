package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;


public class EnrolMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineEnrolMultipleUsers() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser1");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Enrol on a new course")).click();
		driver.findElement(By.id("coursesearchbox_keyword")).clear();
		driver.findElement(By.id("coursesearchbox_keyword")).sendKeys("Course001");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='claroBody']/dl[1]/dt/a[1]/img")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser2");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Enrol on a new course")).click();
		driver.findElement(By.id("coursesearchbox_keyword")).clear();
		driver.findElement(By.id("coursesearchbox_keyword")).sendKeys("Course001");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='claroBody']/dl[1]/dt/a[1]/img")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser3");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Enrol on a new course")).click();
		driver.findElement(By.id("coursesearchbox_keyword")).clear();
		driver.findElement(By.id("coursesearchbox_keyword")).sendKeys("Course001");
		driver.findElement(By.xpath("//*[@id='claroBody']/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='claroBody']/dl[1]/dt/a[1]/img")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLUSR")).click();
		assertTrue(driver.findElement(By.linkText("Testuser1")).getText().contains("Testuser1"));
		assertTrue(driver.findElement(By.linkText("Testuser2")).getText().contains("Testuser2"));
		assertTrue(driver.findElement(By.linkText("Testuser3")).getText().contains("Testuser3"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
