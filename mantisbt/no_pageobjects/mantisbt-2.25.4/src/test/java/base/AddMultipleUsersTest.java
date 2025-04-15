package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddMultipleUsersTest extends BaseTest {
	
	@Test
	public void addMultipleUsers() throws InterruptedException {
		String username = "username00%d";
		String realname = "username00%d";
		String email = "username00%d@username.it";
		
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		
		for(int i=1; i<=3; i++) {
			driver.findElement(By.xpath("//*[@id=\"manage-user-div\"]/div[1]/a")).click();
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(String.format(username, i));
			driver.findElement(By.name("realname")).clear();
			driver.findElement(By.name("realname")).sendKeys(String.format(realname, i));
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(String.format(email, i));
			new Select(driver.findElement(By.name("access_level"))).selectByVisibleText(Strings.updater);
			driver.findElement(By.xpath("//*[@id=\"manage-user-create-form\"]/div/div[3]/input")).click();
			Thread.sleep(500);
			driver.findElement(By.linkText(Strings.manageUsers)).click();
			
			assertEquals(String.format(username, i), driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr["+(i+1)+"]/td[1]/a")).getText());
			assertEquals(String.format(realname, i), driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr["+(i+1)+"]/td[2]")).getText());
			assertEquals(String.format(email, i), driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr["+(i+1)+"]/td[3]")).getText());
			assertEquals(Strings.updater, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr["+(i+1)+"]/td[4]")).getText());
		}
	}
	
}