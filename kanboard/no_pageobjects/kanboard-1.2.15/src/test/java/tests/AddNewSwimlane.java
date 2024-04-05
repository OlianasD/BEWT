package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;




public class AddNewSwimlane extends BaseTest {
	
	@Test
	public void addNewSwimlane() {
		String laneName = "New Swimlane 3";
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Swimlanes")).click();
		driver.findElement(By.linkText("Add a new swimlane")).click();
		driver.findElement(By.id("form-name")).sendKeys(laneName);
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[2]/div/button")).click();
		
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/table/tbody/tr[2]/td[1]")).getText().contains("New Swimlane 3"));  
	}
		  
		  
		  
}
