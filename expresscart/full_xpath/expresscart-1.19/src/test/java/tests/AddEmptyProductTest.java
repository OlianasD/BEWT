package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmptyProductTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyProduct() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement addProductIcon = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[2]"));
		addProductIcon.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/div/button"));
		saveBtn.click();

		WebElement productTitle = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[2]/div"));
		WebElement productPrice = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[3]/div[1]/div"));
		assertTrue(productTitle.getAttribute("class").contains("has-error has-danger"));
		assertTrue(productPrice.getAttribute("class").contains("has-error has-danger"));
	}

}
