package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class AddUserTest extends BaseTest {

	@Test
	public void testClarolineAddUser() throws Exception {
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
		WebElement createUserLink = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[4]/a"));
		createUserLink.click();
		WebElement lastNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[1]/input"));
		lastNameField.clear();
		lastNameField.sendKeys("Name001");
		WebElement firstNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[2]/input"));
		firstNameField.clear();
		firstNameField.sendKeys("Firstname001");
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[2]/input"));
		usernameField.clear();
		usernameField.sendKeys("user001");
		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[3]/input"));
		passwordField.clear();
		passwordField.sendKeys("n0tl34k3dy3t");
		WebElement passwordConfField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[4]/input"));
		passwordConfField.clear();
		passwordConfField.sendKeys("n0tl34k3dy3t");
		WebElement studentRadioBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[4]/dl/dd/input[1]"));
		studentRadioBtn.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/dl/dt/input"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement confirmMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]"));
		assertTrue(confirmMsg.getText().contains("The new user has been sucessfully created"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
