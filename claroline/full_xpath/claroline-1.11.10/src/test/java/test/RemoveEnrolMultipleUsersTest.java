package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class RemoveEnrolMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineRemoveEnrolMultipleUsers() throws Exception {
		WebElement UserField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		UserField.clear();
		UserField.sendKeys("admin");
		WebElement PswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		PswField.clear();
		PswField.sendKeys("n0tl34k3dy3t");
		WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		LoginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[11]/a"));
		usersLink.click();
		WebElement usersNumber = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/span"));
		assertTrue(usersNumber.getText().contains("5"));
		WebElement removeFirstUser = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[10]/a/img"));
		removeFirstUser.click();
		driver.switchTo().alert().accept();
		WebElement removeSecondUser = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[10]/a/img"));
		removeSecondUser.click();
		driver.switchTo().alert().accept();
		WebElement removeThirdUser = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[10]/a/img"));
		removeThirdUser.click();
		driver.switchTo().alert().accept();
		WebElement secondUsersNumber = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/span"));
		assertTrue(secondUsersNumber.getText().contains("2"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
