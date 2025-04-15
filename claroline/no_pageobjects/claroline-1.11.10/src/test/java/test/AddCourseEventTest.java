package test;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;


import static org.junit.Assert.assertTrue;

public class AddCourseEventTest extends BaseTest {

	@Test
	public void testClarolineAddCourseEvent() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLCAL")).click();
		driver.findElement(By.linkText("Add an event")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Exam 001");
		new Select(driver.findElement(By.id("fday"))).selectByVisibleText("31");
		new Select(driver.findElement(By.id("fmonth"))).selectByVisibleText("May");
		new Select(driver.findElement(By.id("fyear"))).selectByVisibleText("2023");
		driver.findElement(By.id("location")).clear();
		driver.findElement(By.id("location")).sendKeys("Genoa");
		driver.findElement(By.name("submitEvent")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/div[2]/div")).getText()
				.contains("Event added to the agenda."));
		driver.findElement(By.linkText("Logout")).click();
	}

}
