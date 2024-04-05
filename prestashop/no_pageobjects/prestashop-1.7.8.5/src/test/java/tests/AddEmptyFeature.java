package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyFeature extends BaseTest {

	@Test
	public void test_add_empty_feature() {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentAttributesGroups")).click();
		driver.findElement(By.id("subtab-AdminFeatures")).click();
		driver.findElement(By.id("page-header-desc-feature-new_feature")).click();
		driver.findElement(By.id("feature_form_submit_btn")).click();

		assertEquals("×\n" + "The field name is required at least in English (English).",
				driver.findElement(By.className("alert-danger")).getText());
	}
}
