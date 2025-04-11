package test;


import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class RemoveEnrolMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineRemoveEnrolMultipleUsers() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLUSR")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/div[1]/span")).getText().contains("5"));
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[3]/td[10]/a/img")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[3]/td[10]/a/img")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[3]/td[10]/a/img")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/div[1]/span")).getText().contains("2"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
