package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyProductTest extends BaseTest {

	@Test
	public void test_add_empty_productNoPO() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement products = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[1]/a"));
		products.click();
		WebElement newProduct = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		newProduct.click();
		Thread.sleep(2000);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[4]/div[2]/input"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[1]/div/div/div[1]/div[1]/div/div/div[1]/ul/li"));

		assertEquals("This value should not be blank.",errorMsg.getText());

	}

}
