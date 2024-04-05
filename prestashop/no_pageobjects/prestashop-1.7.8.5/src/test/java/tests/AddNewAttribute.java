package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddNewAttribute extends BaseTest {

	@Test
	public void test_add_attributes() {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentAttributesGroups")).click();
		driver.findElement(By.id("page-header-desc-attribute_group-new_attribute_group")).click();
		driver.findElement(By.id("name_1")).sendKeys("Quantity");
		driver.findElement(By.id("public_name_1")).sendKeys("Qnt");
		driver.findElement(By.id("attribute_group_form_submit_btn")).click();

		assertTrue(driver.findElement(By.className("alert-success")).getText().contains("Successful creation"));

	}
}
