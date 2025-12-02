package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddProductTagTest extends BaseTest {
	
	@Test
	public void testExpressCartAddProductTagNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement productsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[3]/a[1]"));
		productsLink.click();
		WebElement firstProdLink = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/a"));
		firstProdLink.click();
		WebElement tagsField = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div/div[9]/div/div/input[3]"));
		tagsField.sendKeys("tag000,");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div/div[1]/div/div/button[2]"));
		saveBtn.click();
		WebElement displayedTag = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div/div[9]/div/div/div/span"));

		assertEquals("tag000", displayedTag.getText());
	}



}
