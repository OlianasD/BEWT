package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class LoginUserTest extends BaseTest {


	@Test
	public void testClarolineLoginUser() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("user001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement displayedUser = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[1]"));
		assertTrue(displayedUser.getText().contains("Firstname001 Name001"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
