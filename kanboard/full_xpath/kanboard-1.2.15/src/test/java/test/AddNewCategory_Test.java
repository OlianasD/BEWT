package test;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddNewCategory_Test extends BaseTest {
		
		@Test
		public void addNewCategory() {
			String catName = "New Category 2";

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
			WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input[2]"));
			nameField.sendKeys(catName);
			WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/button"));
			saveBtn.click();
			WebElement displayedName = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/table/tbody/tr[2]/td[1]"));

			assertTrue(displayedName.getText().contains(catName));
		}
		  

		  
		  
}
