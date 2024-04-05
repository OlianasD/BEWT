package base;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.JavascriptExecutor;

public class AssignUserToGroup extends BaseTest {
	
	@Test
	public void assignUserToGroup() {
		String group = "Test Group 000";
		String user = "Test User";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Site Administrator")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver = driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.id("mod-login-username")).clear();
		driver.findElement(By.id("mod-login-username")).sendKeys("administrator");
		driver.findElement(By.id("mod-login-password")).clear();
		driver.findElement(By.id("mod-login-password")).sendKeys(rootPassword);
		driver.findElement(By.id("btn-login-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"cpanel-modules\"]/div/div/div[1]/div/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		WebElement userElem = driver.findElement(By.linkText(user));
		new JavascriptExecutor(driver).scrollTo(userElem);
		userElem.click();
		driver.findElement(By.xpath("//*[@id=\"myTab\"]/div/button[2]")).click();
		driver.findElement(By.id("1group_10")).click();
		driver.findElement(By.xpath("//*[@id=\"save-group-children-save\"]/button")).click();
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/td[5]")).getText().contains(group));
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}
