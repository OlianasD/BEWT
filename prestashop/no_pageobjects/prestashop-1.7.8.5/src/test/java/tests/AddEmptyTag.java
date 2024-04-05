package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;



public class AddEmptyTag extends BaseTest {
	
	@Test
	public void test_add_empty_tag(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-ShopParameters")).click();
		driver.findElement(By.id("subtab-AdminParentSearchConf")).click();
		driver.findElement(By.id("subtab-AdminTags")).click();
		driver.findElement(By.id("page-header-desc-tag-new_tag")).click();
		driver.findElement(By.id("tag_form_submit_btn")).click();
		
		assertEquals("×\n"
		 		+ "The name field is required.", driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div")).getText());
	}
}
