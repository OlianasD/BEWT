package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class ViewProfileStatisticsUserTest extends BaseTest {

	@Test
	public void testClarolineViewProfileStatisticsUser() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("user001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement manageAccountLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[2]/span/a"));
		manageAccountLink.click();
		WebElement viewStatisticsLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/table/tbody/tr/td[2]/ul/li/a"));
		viewStatisticsLink.click();
		Thread.sleep(1000);
		WebElement courseSelect = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/p/select"));
		new Select(courseSelect).selectByVisibleText("Course001");
		WebElement exerciseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[4]/div[1]/table/tbody/tr[1]/td[1]/a"));
		WebElement exerciseScore = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[4]/div[1]/table/tbody/tr[1]/td[3]"));
		assertTrue(exerciseLink.getText().contains("Exercise 001"));
		assertTrue(exerciseScore.getText().contains("9"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
