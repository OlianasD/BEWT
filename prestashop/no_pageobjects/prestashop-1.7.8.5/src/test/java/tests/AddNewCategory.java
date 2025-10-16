package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;



public class AddNewCategory extends BaseTest {

	
	@Test
	public void test_add_category() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminCategories")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("category_name_1")).clear();
		driver.findElement(By.id("category_name_1")).sendKeys("Winters Collection");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful creation"));
	}
	

}
