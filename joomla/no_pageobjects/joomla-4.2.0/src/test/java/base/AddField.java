package base;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class AddField extends BaseTest {
	
	@Test
	public void addField() {
		String field = "Test Field 000";
		
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
		driver.findElement(By.xpath("//*[@id=\"menu12\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-new\"]/button")).click();
		driver.findElement(By.id("jform_title")).sendKeys(field);
		driver.findElement(By.xpath("//*[@id=\"save-group-children-save\"]/button")).click();
		
		assertTrue(isFieldPresent(field));
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
	
	protected boolean isFieldPresent(String field) {
		try {
			return driver.findElement(By.id("fieldList")).getText().contains(field);
		} catch(NoSuchElementException e) {
			if(driver.findElement(By.xpath("//*[@id=\"j-main-container\"]/div[2]")).getText().contains("No Matching Results")) {
				return false;
			}
			else {
				throw e;
			}
			
		}
	}
}