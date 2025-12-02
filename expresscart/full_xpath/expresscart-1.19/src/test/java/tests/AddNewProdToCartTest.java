package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewProdToCartTest extends BaseTest {
	
	@Test
	public void testExpressCartAddNewProdToCart() throws Exception {
		driver.get(appUrl);
		WebElement firstProd = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div/a/h3"));
		firstProd.click();
		WebElement addToCartBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/button"));
		addToCartBtn.click();
		Thread.sleep(500);
		WebElement cartCount = driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a/span"));
		assertEquals("1", cartCount.getText());
		WebElement cartBtn = driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a"));
		cartBtn.click();
		Thread.sleep(500);
		WebElement cartItem = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[1]/h6/a"));

		assertEquals("NewProduct000", cartItem.getText());
	}



}
