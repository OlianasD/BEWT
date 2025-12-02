package tests;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditManufacturerTest extends BaseTest {
	
	@Test()
	public void test_edit_manufacturer_address() throws InterruptedException{
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement brandsAndSuppliers = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[5]/a"));
		brandsAndSuppliers.click();
		WebElement threePointsIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[2]/td[8]/div/div/a[2]"));
		threePointsIcon.click();
		WebElement edit = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[2]/td[8]/div/div/div/a[1]"));
		edit.click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/form/div/div[1]/div/div[1]/div/input"));
		name.clear();
		name.sendKeys("Smith Co");
		Thread.sleep(500);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div"));
		assertTrue(successMsg.getText().contains("Successful update"));
	}	 
}
