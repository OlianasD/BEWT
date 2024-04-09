package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class SearchAndRemovePasswordCourseTest extends BaseTest {


	@Test
	public void testClarolineSearchAndRemovePasswordCourse() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/ul/li[2]/ul/li[1]/form/small/a")).click();
		driver.findElement(By.id("intitule")).clear();
		driver.findElement(By.id("intitule")).sendKeys("Course002");
		driver.findElement(By.id("subscription_key")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/form/fieldset/input")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[2]/a")).getText()
				.contains("Course002"));
		driver.findElement(By.xpath("html/body/div[1]/div[2]/table[2]/tbody/tr/td[5]/a/img")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div")).getText()
				.contains("The course has been successfully deleted"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
