package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddMenuTest extends BaseTest {
	
	@Test
	public void testExpressCartAddMenu() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement menuLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[2]/a"));
		menuLink.click();
		WebElement menuName = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div[3]/div[1]/input"));
		menuName.sendKeys("Test Menu");
		WebElement menuUrl = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div[3]/div[2]/input"));
		menuUrl.sendKeys("/category/tag000");
		WebElement addMenuBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div[3]/div[3]/button"));
		addMenuBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[3]"));
		assertEquals("Menu created successfully.", successMsg.getText());
	}



}
