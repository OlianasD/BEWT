package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class RemoveEnrolUserTest extends BaseTest {


	@Test
	public void testClarolineRemoveEnrolUser() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("user001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement removeEnrolment = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/a"));
		removeEnrolment.click();
		WebElement removeIcon = driver.findElement(By.xpath("/html/body/div/div[2]/dl/dt/a[1]/img"));
		removeIcon.click();
		driver.switchTo().alert().accept();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("Your enrollment on the course has been removed"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
