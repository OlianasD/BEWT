package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewFeatures extends BaseTest {


	@Test
	public void test_add_featuresNoPO() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentAttributesGroups")).click();
		driver.findElement(By.id("subtab-AdminFeatures")).click();
		driver.findElement(By.id("page-header-desc-feature-new_feature")).click();
		driver.findElement(By.id("name_1")).sendKeys("Strong");
		driver.findElement(By.id("feature_form_submit_btn")).click();
		Thread.sleep(1000);
		
		
		assertTrue(driver.findElement(By.className("alert-success")).getText().contains("Successful creation"));
	}

}
