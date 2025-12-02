package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddProductTest extends BaseTest {
	
	@Test
	public void testExpressCartAddProduct() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement addProductIcon = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[2]"));
		addProductIcon.click();
		WebElement productTitle = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[2]/div/input"));
		productTitle.sendKeys("NewProduct000");
		WebElement productPrice = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[3]/div[1]/div/div/input"));
		productPrice.sendKeys("15.95");
		WebElement productDescription = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[4]/div[2]/div/div/div[3]/div[2]"));
		productDescription.sendKeys("Description for product 000");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/div/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement productsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[1]"));
		productsLink.click();
		WebElement displayedProduct = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/a"));
		assertEquals( "NewProduct000", displayedProduct.getText());
	}


}
