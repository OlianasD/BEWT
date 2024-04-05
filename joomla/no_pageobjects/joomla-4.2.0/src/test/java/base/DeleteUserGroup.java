package base;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.JavascriptExecutor;

public class DeleteUserGroup extends BaseTest {
	
	@Test
	public void deleteUserGroup() {
		String group = "Test Group 000";
		
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
		driver.findElement(By.xpath("//*[@id=\"menu12\"]/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse4\"]/li[2]/a")).click();
		WebElement selector = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr[10]/td[1]/input"));
		new JavascriptExecutor(driver).scrollTo(selector);
		selector.click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-delete\"]/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		
		assertFalse(driver.findElement(By.id("groupList")).getText().contains(group));
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();	
	}
}