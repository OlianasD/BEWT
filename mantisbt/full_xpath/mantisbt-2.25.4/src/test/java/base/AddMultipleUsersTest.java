package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddMultipleUsersTest extends BaseTest {
	
	@Test
	public void addMultipleUsers() throws InterruptedException {
		WebElement loginUsr = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/label/span/input"));
		loginUsr.clear();
		loginUsr.sendKeys("administrator");
		WebElement usrLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]"));
		usrLoginBtn.click();
		Thread.sleep(500);
		WebElement loginPsw = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/label/span/input"));
		loginPsw.clear();
		loginPsw.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]"));
		pswLoginBtn.click();
		WebElement manage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a"));
		manage.click();
		WebElement manageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		manageUsers.click();
		WebElement createUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div/div[1]/a"));
		createUserBtn.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		userField.clear();
		userField.sendKeys("username001");
		WebElement realnameField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[2]/td[2]/input"));
		realnameField.clear();
		realnameField.sendKeys("username001");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[3]/td[2]/input"));
		emailField.clear();
		emailField.sendKeys("username001@username.it");
		WebElement accessLevelSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[4]/td[2]/select"));
		new Select(accessLevelSelect).selectByVisibleText(Strings.updater);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondManageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		secondManageUsers.click();
		WebElement displayedUsername = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a"));
		WebElement displayedRealname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[2]"));
		WebElement displayedEmail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[3]"));
		WebElement displayedAccessLevel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[4]"));

		assertEquals("username001", displayedUsername.getText());
		assertEquals("username001", displayedRealname.getText());
		assertEquals("username001@username.it", displayedEmail.getText());
		assertEquals(Strings.updater, displayedAccessLevel.getText());

		WebElement secondCreateUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div/div[1]/a"));
		secondCreateUserBtn.click();
		WebElement secondUserField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		secondUserField.clear();
		secondUserField.sendKeys("username002");
		WebElement secondRealnameField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[2]/td[2]/input"));
		secondRealnameField.clear();
		secondRealnameField.sendKeys("username002");
		WebElement secondEmailField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[3]/td[2]/input"));
		secondEmailField.clear();
		secondEmailField.sendKeys("username002@username.it");
		WebElement secondAccessLevelSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[4]/td[2]/select"));
		new Select(secondAccessLevelSelect).selectByVisibleText(Strings.updater);
		WebElement secondSaveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		secondSaveBtn.click();
		Thread.sleep(500);
		WebElement thirdManageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		thirdManageUsers.click();
		WebElement secondDisplayedUsername = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[3]/td[1]/a"));
		WebElement secondDisplayedRealname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[3]/td[2]"));
		WebElement secondDisplayedEmail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[3]/td[3]"));
		WebElement secondDisplayedAccessLevel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[3]/td[4]"));

		assertEquals("username002", secondDisplayedUsername.getText());
		assertEquals("username002", secondDisplayedRealname.getText());
		assertEquals("username002@username.it", secondDisplayedEmail.getText());
		assertEquals(Strings.updater, secondDisplayedAccessLevel.getText());

		WebElement thirdCreateUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div/div[1]/a"));
		thirdCreateUserBtn.click();
		WebElement thirdUserField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		thirdUserField.clear();
		thirdUserField.sendKeys("username003");
		WebElement thirdRealnameField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[2]/td[2]/input"));
		thirdRealnameField.clear();
		thirdRealnameField.sendKeys("username003");
		WebElement thirdEmailField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[3]/td[2]/input"));
		thirdEmailField.clear();
		thirdEmailField.sendKeys("username003@username.it");
		WebElement thirdAccessLevelSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[4]/td[2]/select"));
		new Select(thirdAccessLevelSelect).selectByVisibleText(Strings.updater);
		WebElement thirdSaveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		thirdSaveBtn.click();
		Thread.sleep(500);
		WebElement fourthManageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		fourthManageUsers.click();
		WebElement thirdDisplayedUsername = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/a"));
		WebElement thirdDisplayedRealname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[4]/td[2]"));
		WebElement thirdDisplayedEmail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[4]/td[3]"));
		WebElement thirdDisplayedAccessLevel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[4]/td[4]"));

		assertEquals("username003", thirdDisplayedUsername.getText());
		assertEquals("username003", thirdDisplayedRealname.getText());
		assertEquals("username003@username.it", thirdDisplayedEmail.getText());
		assertEquals(Strings.updater, thirdDisplayedAccessLevel.getText());
	}
	
}