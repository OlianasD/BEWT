package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewProject_Test extends BaseTest {
		  
	@Test
	public void addNewProject() throws InterruptedException {
		String projName = "Test 2";

		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement newProjLink = driver.findElement(By.xpath("/html/body/section/section/div/ul/li[1]/a"));
		newProjLink.click();
		WebElement projNameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/input[3]"));
		projNameField.sendKeys(projName);
		WebElement projSaveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/div[2]/div/button"));
		projSaveBtn.click();
		Thread.sleep(1000);

		WebElement projTitle = driver.findElement(By.xpath("/html/body/header/div[1]/h1/span[2]"));
		WebElement projStatus = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul/li[1]"));

		assertEquals(projName, projTitle.getText());
		assertEquals("This project is open", projStatus.getText());
		
		
		
	}
		  
		  
}
