package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class DeleteMultipleUsersTest extends BaseTest {
	
	@Test
	public void deleteMultipleUsers() throws InterruptedException {
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
		WebElement userLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a"));
		userLink.click();
		WebElement deleteUser = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/form[2]/fieldset/span/input"));
		deleteUser.click();
		WebElement confirmDelete = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/input[4]"));
		confirmDelete.click();
		Thread.sleep(3000);
		WebElement firstBody = driver.findElement(By.xpath("/html/body"));
		assertFalse(firstBody.getText().contains("username001"));

		WebElement secondUserLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a"));
		secondUserLink.click();
		WebElement secondDeleteUser = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/form[2]/fieldset/span/input"));
		secondDeleteUser.click();
		WebElement secondConfirmDelete = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/input[4]"));
		secondConfirmDelete.click();
		Thread.sleep(3000);
		WebElement secondBody = driver.findElement(By.xpath("/html/body"));
		assertFalse(secondBody.getText().contains("username002"));

		WebElement thirdUserLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a"));
		thirdUserLink.click();
		WebElement thirdDeleteUser = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/form[2]/fieldset/span/input"));
		thirdDeleteUser.click();
		WebElement thirdConfirmDelete = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/input[4]"));
		thirdConfirmDelete.click();
		Thread.sleep(3000);
		WebElement thirdBody = driver.findElement(By.xpath("/html/body"));
		assertFalse(thirdBody.getText().contains("username003"));

	}
	
}