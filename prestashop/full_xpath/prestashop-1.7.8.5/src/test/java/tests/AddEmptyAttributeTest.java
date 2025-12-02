package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyAttributeTest extends BaseTest {
	
	@Test
	public void test_add_empty_attributes(){
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement attrsAndFeatures = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[4]/a"));
		attrsAndFeatures.click();
		WebElement addAttribute = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div/ul/li[1]/a"));
		addAttribute.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[3]/button"));
		saveBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div"));
		
		
		assertEquals("×\n"
				+ "There are 2 errors.\n"
				+ "The field name is required at least in English (English).\n"
				+ "The field public_name is required at least in English (English).", errorMsg.getText());
	}
}
