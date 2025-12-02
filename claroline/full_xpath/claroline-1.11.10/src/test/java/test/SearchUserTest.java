package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class SearchUserTest extends BaseTest {

	@Test
	public void testClarolineSearchUser() throws Exception {
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
		searchUserBar.sendKeys("user001");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[1]/form/input[2]"));
		searchSubmitBtn.click();
		WebElement displayedName = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[2]"));
		WebElement displayedLastName = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[3]"));
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[6]"));
		assertEquals("Name001", displayedName.getText());
		assertEquals("Firstname001", displayedLastName.getText());
		assertEquals("User", displayedStatus.getText());
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
