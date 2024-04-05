package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyProduct extends BaseTest {

	@Test
	public void test_add_empty_productNoPO() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminProducts\"]/a")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		

		assertEquals("This value should not be blank.",
				driver.findElement(By.xpath("//*[@id=\"form_step1_name\"]/div/div[1]/ul")).getText());

	}

}
