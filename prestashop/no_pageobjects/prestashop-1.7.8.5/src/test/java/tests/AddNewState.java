package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddNewState extends BaseTest {

	@Test
	public void test_add_new_state() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCountries\"]/a")).click();
		driver.findElement(By.id("subtab-AdminStates")).click();
		driver.findElement(By.id("page-header-desc-state-new_state")).click();
		driver.findElement(By.name("name")).sendKeys("Liguria3");
		driver.findElement(By.name("iso_code")).sendKeys("1121");
		driver.findElement(By.name("id_country")).sendKeys("Italy");
		driver.findElement(By.name("id_zone")).sendKeys("Europe");
		driver.findElement(By.id("state_form_submit_btn")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.className("alert-success")).getText().contains("Successful creation"));
	}

}
