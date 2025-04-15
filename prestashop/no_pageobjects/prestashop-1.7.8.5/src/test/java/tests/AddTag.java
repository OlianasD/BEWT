package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class AddTag extends BaseTest {
	
	@Test
	public void test_add_tag() throws InterruptedException{
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-ShopParameters")).click();
		driver.findElement(By.id("subtab-AdminParentSearchConf")).click();
		driver.findElement(By.id("subtab-AdminTags")).click();
		driver.findElement(By.id("page-header-desc-tag-new_tag")).click();
		driver.findElement(By.id("name")).sendKeys("Hat");
		driver.findElement(By.id("tag_form_submit_btn")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.className("alert-success")).getText().contains("Successful creation"));
	}
}
