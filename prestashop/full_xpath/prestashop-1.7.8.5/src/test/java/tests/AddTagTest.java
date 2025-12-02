package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddTagTest extends BaseTest {
	
	@Test
	public void test_add_tag() throws InterruptedException{
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement shopParams = driver.findElement(By.xpath("/html/body/nav/div/ul/li[16]/a"));
		shopParams.click();
		WebElement search = driver.findElement(By.xpath("/html/body/nav/div/ul/li[16]/ul/li[7]/a"));
		search.click();
		WebElement tags = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/ul/li[2]/a"));
		tags.click();
		WebElement addTag = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div/ul/li[1]/a"));
		addTag.click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[2]/div[1]/div/input"));
		name.sendKeys("Hat");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[4]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div"));

		assertTrue(successMsg.getText().contains("Successful creation"));
	}
}
