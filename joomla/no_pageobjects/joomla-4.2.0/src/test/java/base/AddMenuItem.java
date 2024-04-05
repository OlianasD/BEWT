package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddMenuItem extends BaseTest {
	
	@Test
	public void addMenuItem() throws InterruptedException {
		String name = "Test menu item";
		
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
		driver.findElement(By.linkText("Menus")).click();
		driver.findElement(By.linkText("All Menu Items")).click();
		driver.findElement(By.className("button-new")).click();
		driver.findElement(By.id("jform_title")).sendKeys(name);
		new Select(driver.findElement(By.id("jform_menutype"))).selectByVisibleText("Main Menu");
		driver.findElement(By.xpath("//*[@id=\"details\"]/div/div[1]/div[1]/div[2]/span/button")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.className("iframe")));
		driver.findElement(By.xpath("//*[@id=\"collapse0-heading\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/a[1]/div")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.className("button-save")).click();
		
		assertEquals("Menu item saved.", driver.findElement(By.className("alert-message")).getText());
		assertTrue(driver.findElement(By.id("menuitemList")).getText().contains(name));
	}
}
