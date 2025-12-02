package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class AddEmptyUserFailsTest extends BaseTest {

	@Test
	public void addEmptyUserFails() throws InterruptedException {

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
		WebElement manage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span"));
		manage.click();
		WebElement manageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		manageUsers.click();
		WebElement createUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div/div[1]/a"));
		createUserBtn.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		saveBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/p[2]"));

		assertEquals(Strings.errorInvalidUser, errorMsg.getText());
	}

}