package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class EnrolPasswordCourseGoodPasswordUserTest extends BaseTest {

	@Test
	public void testClarolineEnrolPasswordCourseGoodPasswordUser() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("user001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement enrolCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[1]/a"));
		enrolCourseLink.click();
		WebElement courseSearchBox = driver.findElement(By.xpath("/html/body/div/div[2]/form/input"));
		courseSearchBox.clear();
		courseSearchBox.sendKeys("Course002");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
		searchSubmitBtn.click();
		WebElement enrolIcon = driver.findElement(By.xpath("/html/body/div/div[2]/dl/dt/a[1]/img"));
		enrolIcon.click();
		WebElement registrationKeyField = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/form/fieldset/dl/dd/input"));
		registrationKeyField.sendKeys("n0tl34k3dy3t");
		WebElement okBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/form/p/input"));
		okBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("You've been enrolled on the course"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
