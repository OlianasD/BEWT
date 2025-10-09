package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AssignCategory extends BaseTest {
	
	@Test
	public void assignCategory() {
		String article = "Your Template";
		String cat = "Test Category 001";
		
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
		driver.findElement(By.linkText("Articles")).click();
		driver.findElement(By.linkText(article)).click();
		driver.findElement(By.xpath("//*[@id=\"general\"]/div/div[2]/fieldset/div[2]/div[2]/joomla-field-fancy-select/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[2]/joomla-tab/joomla-tab-element[1]/div/div[2]/fieldset/div[2]/div[2]/joomla-field-fancy-select/div/div[2]/input")).sendKeys(cat);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[2]/joomla-tab/joomla-tab-element[1]/div/div[2]/fieldset/div[2]/div[2]/joomla-field-fancy-select/div/div[2]/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("button-save")).click();
		
		assertEquals(cat, driver.findElement(By.xpath("//*[@id=\"articleList\"]/tbody/tr[1]/th/div/div[2]/a")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}