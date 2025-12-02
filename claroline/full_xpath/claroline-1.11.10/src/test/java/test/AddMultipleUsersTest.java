package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class AddMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineAddMultipleUsers() throws Exception {
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
		lastNameField.sendKeys("testuser1");
		WebElement firstNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[2]/input"));
		firstNameField.clear();
		firstNameField.sendKeys("testuser1");
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[2]/input"));
		usernameField.clear();
		usernameField.sendKeys("testuser1");
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
		WebElement createAnotherUser = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[3]/a"));
		createAnotherUser.click();
		WebElement secondLastNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[1]/input"));
		secondLastNameField.clear();
		secondLastNameField.sendKeys("testuser2");
		WebElement secondFirstNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[2]/input"));
		secondFirstNameField.clear();
		secondFirstNameField.sendKeys("testuser2");
		WebElement secondUsernameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[2]/input"));
		secondUsernameField.clear();
		secondUsernameField.sendKeys("testuser2");
		WebElement secondPasswordField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[3]/input"));
		secondPasswordField.clear();
		secondPasswordField.sendKeys("n0tl34k3dy3t");
		WebElement secondPasswordConfField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[4]/input"));
		secondPasswordConfField.clear();
		secondPasswordConfField.sendKeys("n0tl34k3dy3t");
		WebElement teacherRadioBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[4]/dl/dd/input[2]"));
		teacherRadioBtn.click();
		WebElement secondSaveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/dl/dt/input"));
		secondSaveBtn.click();
		WebElement secondCreateAnotherUser = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[3]/a"));
		secondCreateAnotherUser.click();
		Thread.sleep(1000);
		WebElement thirdLastNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[1]/input"));
		thirdLastNameField.clear();
		thirdLastNameField.sendKeys("testuser3");
		WebElement thirdFirstNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/dl/dd[2]/input"));
		thirdFirstNameField.clear();
		thirdFirstNameField.sendKeys("testuser3");
		WebElement thirdUsernameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[2]/input"));
		thirdUsernameField.clear();
		thirdUsernameField.sendKeys("testuser3");
		WebElement thirdPasswordField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[3]/input"));
		thirdPasswordField.clear();
		thirdPasswordField.sendKeys("n0tl34k3dy3t");
		WebElement thirdPasswordConfField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[2]/dl/dd[4]/input"));
		thirdPasswordConfField.clear();
		thirdPasswordConfField.sendKeys("n0tl34k3dy3t");
		WebElement adminRadioBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[4]/dl/dd/span/input"));
		adminRadioBtn.click();
		WebElement thirdSaveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/dl/dt/input"));
		thirdSaveBtn.click();
		WebElement backToAdminPage = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[4]/a"));
		backToAdminPage.click();
		WebElement userListLink = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[2]/a"));
		userListLink.click();
		WebElement displayedUser1 = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[4]/td[2]"));
		WebElement displayedUser2 = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[5]/td[2]"));
		WebElement displayedUser3 = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr[2]/td[2]"));
		assertTrue(displayedUser1.getText().contains("testuser1"));
		assertTrue(displayedUser2.getText().contains("testuser2"));
		assertTrue(displayedUser3.getText().contains("testuser3"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
