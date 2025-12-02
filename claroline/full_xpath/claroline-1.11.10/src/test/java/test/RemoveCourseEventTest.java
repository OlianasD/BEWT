package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class RemoveCourseEventTest extends BaseTest {

	@Test
	public void testClarolineRemoveCourseEvent() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement agendaLink = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[3]/a"));
		agendaLink.click();
		WebElement clearEvents = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/ul/li[5]/a"));
		clearEvents.click();
		driver.switchTo().alert().accept();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("All events deleted from the agenda"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
