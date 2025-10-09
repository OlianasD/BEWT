package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddEmptyField extends BaseTest {
	
	@Test
	public void addEmptyField() {
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
		driver.findElement(By.xpath("//*[@id=\"save-group-children-save\"]/button")).click();
		
		
		assertEquals("Please fill in this field", driver.findElement(By.xpath("//*[@id=\"jform_title-lbl\"]/span[2]")).getText());

	}
}