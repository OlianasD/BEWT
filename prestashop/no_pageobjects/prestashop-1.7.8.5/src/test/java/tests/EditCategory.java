package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class EditCategory extends BaseTest {
	
	@Test
	public void test_edit_category() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminCategories")).click();
		driver.findElement(By.xpath("//*[@id=\"tr_2_10_3\"]/td[7]/div/div/a[1]")).click();
		driver.findElement(By.id("category_name_1")).clear();
		driver.findElement(By.id("category_name_1")).sendKeys("Fall Collection");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful update"));
	}	 
}
