package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewPrivateProject_Test extends BaseTest {
	
	@Test
	public void addNewPrivateProject() throws InterruptedException {
		String projName = "Test private 2";

		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement newPersonalProjectLink = driver.findElement(By.xpath("/html/body/section/section/div/ul/li[2]/a"));
		newPersonalProjectLink.click();
		WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/input[3]"));
		nameField.sendKeys(projName);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/div[2]/div/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement displayedName = driver.findElement(By.xpath("/html/body/header/div[1]/h1/span[2]"));
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul/li[1]"));
		WebElement displayedPersonal = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul/li[3]"));
		WebElement displayedAccess = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul/li[4]"));

		assertEquals(projName, displayedName.getText());
		assertEquals("This project is open", displayedStatus.getText());
		assertTrue(displayedPersonal.getText().contains("This project is personal"));
		assertEquals("Public access disabled", displayedAccess.getText());
	}
		  
		  
		  
}
