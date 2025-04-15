package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AssignCategoryTest extends BaseTest {
	
	@Test
	public void assignCategory() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		new Select(driver.findElement(By.id("jscategory"))).selectByVisibleText("Category001");
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		
		assertEquals("Category001", new Select(driver.findElement(By.id("jscategory"))).getFirstSelectedOption().getText());
		
		
	}
}