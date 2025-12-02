package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class DeleteUserTest extends BaseTest {
	
	@Test
	public void deleteUser() throws InterruptedException {
		String userName = "username001";

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
		WebElement body = driver.findElement(By.xpath("/html/body"));
		
		assertFalse(body.getText().contains(userName));

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}