package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class EditProject extends BaseTest {
	
	@Test
	public void editProject() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Edit project")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/form/fieldset[1]/div/div/div[2]/textarea")).sendKeys("This is the new description");
		driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/form/div/div/button")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Summary")).click();
		
		assertEquals("This is the new description", driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/article/p")).getText());
	}
		  

		  
}
