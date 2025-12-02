package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyCategory_Test extends BaseTest {
	
	@Test
	public void addEmptyCategory() {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement projectDropdownIcon = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[2]/div[2]/div[1]/div/a/strong/i"));
		projectDropdownIcon.click();
		WebElement configureProjectLink = driver.findElement(By.xpath("/html/body/div/ul/li[5]/a"));
		configureProjectLink.click();
		WebElement categoriesLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[10]/a"));
		categoriesLink.click();
		WebElement addCategoryLink = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div/ul/li/a"));
		addCategoryLink.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/button"));
		saveBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/ul"));

		assertEquals("The name is required", errorMsg.getText());
		  
	}
}
