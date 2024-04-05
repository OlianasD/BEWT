package tests;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.openqa.selenium.By;

public class RemoveProject extends BaseTest {
	
	@Test
	public void removeProject() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Remove")).click();
		driver.findElement(By.id("modal-confirm-button")).click();
		Thread.sleep(500);
		
		assertFalse(driver.findElement(By.tagName("body")).getText().contains("Test 2"));  
	}

}
