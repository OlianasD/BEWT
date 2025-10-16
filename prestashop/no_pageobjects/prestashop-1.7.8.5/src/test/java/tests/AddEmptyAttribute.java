package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyAttribute extends BaseTest {
	
	@Test
	public void test_add_empty_attributes() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentAttributesGroups")).click();
		driver.findElement(By.id("page-header-desc-attribute_group-new_attribute_group")).click();
		driver.findElement(By.id("attribute_group_form_submit_btn")).click();
		Thread.sleep(500);
		
		assertEquals("×\n"
				+ "There are 2 errors.\n"
				+ "The field name is required at least in English (English).\n"
				+ "The field public_name is required at least in English (English).", driver.findElement(By.className("alert-danger"))
					.getText());
	}
}
