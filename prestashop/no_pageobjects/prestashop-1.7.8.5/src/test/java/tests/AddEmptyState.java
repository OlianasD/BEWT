package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddEmptyState extends BaseTest {

	@Test
	public void test_add_empty_stateNoPO() {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCountries\"]/a")).click();
		driver.findElement(By.id("subtab-AdminStates")).click();
		driver.findElement(By.id("page-header-desc-state-new_state")).click();
		driver.findElement(By.id("state_form_submit_btn")).click();

		assertEquals(
				"×\n" + "There are 2 errors.\n" + "The iso_code field is required.\n" + "The name field is required.",
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div")).getText());

	}

}
