package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ChangePasswordDontMatchTest extends BaseTest {
	
	@Test
	public void changePasswordDontMatch() {
		String username = "tuser01";
		String password = "newpassword01";

		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys(username);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement editProfile = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/ul/li/a"));
		editProfile.click();
		WebElement newPassword = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset[1]/div[3]/div[2]/div/div/input"));
		newPassword.sendKeys("asdasdasd22");
		WebElement confirmPassword = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset[1]/div[4]/div[2]/div/div/input"));
		confirmPassword.sendKeys("zxczxczxc23");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button[1]"));
		saveBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div/div/div/div"));
		
		assertEquals("The passwords you entered do not match. Please enter your desired password in the password field and confirm your entry by entering it in the confirm password field.",errorMsg.getText());
		WebElement secondAuthorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		secondAuthorLogin.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
	}
}