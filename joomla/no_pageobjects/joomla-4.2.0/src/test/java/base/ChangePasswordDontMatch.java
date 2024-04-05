package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class ChangePasswordDontMatch extends BaseTest {
	
	@Test
	public void changePasswordDontMatch() {
		String username = "tuser01";
		String password = "newpassword01";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li/a")).click();
		driver.findElement(By.id("jform_password1")).sendKeys("asdasdasd22");
		driver.findElement(By.id("jform_password2")).sendKeys("zxczxczxc23");
		driver.findElement(By.className("btn-primary")).click();
		
		assertEquals("The passwords you entered do not match. Please enter your desired password in the password field and confirm your entry by entering it in the confirm password field.",driver.findElement(By.className("alert-message")).getText());
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}