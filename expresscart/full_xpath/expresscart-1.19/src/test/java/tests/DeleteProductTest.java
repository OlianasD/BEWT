package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeleteProductTest extends BaseTest {

	@Test
	public void testExpressCartDeleteProductNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement productsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[1]"));
		productsLink.click();
		WebElement deleteFirstProd = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/button"));
		deleteFirstProd.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		WebElement secondProductsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[1]"));
		secondProductsLink.click();
		WebElement firstProd = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/a"));
		
		assertFalse(firstProd.getText().contains("NewProduct000"));
	}


}
