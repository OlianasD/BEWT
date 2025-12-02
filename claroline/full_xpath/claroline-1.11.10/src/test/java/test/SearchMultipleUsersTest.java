package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


public class SearchMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineSearchMultipleUsers() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement platformAdminLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/ul/li[3]/span/a"));
		platformAdminLink.click();
		WebElement searchUserBar = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[1]/form/input[1]"));
		searchUserBar.clear();
		searchUserBar.sendKeys("testuser");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[1]/form/input[2]"));
		searchSubmitBtn.click();
		WebElement sortById = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/thead/tr/th[1]/a"));
		sortById.click();
		WebElement firstUser = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[1]/td[2]"));
		WebElement secondUser = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[2]/td[2]"));
		WebElement thirdUser = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[3]/td[2]"));
		assertTrue(firstUser.getText().contains("testuser1"));
		assertTrue(secondUser.getText().contains("testuser2"));
		assertTrue(thirdUser.getText().contains("testuser3"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
