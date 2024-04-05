package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewColumn extends BaseTest {
	
	@Test
	public void addNewColumn() {
		String columnName = "New Column 3";
		
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Columns")).click();
		driver.findElement(By.linkText("Add a new column")).click();
		driver.findElement(By.id("form-title")).sendKeys(columnName);
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[2]/div/button")).click();
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/table/tbody/tr[5]/td[1]")).getText().contains("New Column 3"));
		
	}
		  
		  
		  
}
