package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class RemoveEnrolUserTest extends BaseTest {


	@Test
	public void testClarolineRemoveEnrolUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("user001");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password001");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Remove course enrolment")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/dl/dt/a[1]/img")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div")).getText().contains("Your enrollment on the course has been removed"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
