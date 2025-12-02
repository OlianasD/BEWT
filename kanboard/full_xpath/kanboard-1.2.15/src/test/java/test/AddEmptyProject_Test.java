package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyProject_Test extends BaseTest {
	
	@Test
	public void addEmptyProject() {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement newProjLink = driver.findElement(By.xpath("/html/body/section/section/div/ul/li[1]/a"));
		newProjLink.click();
		WebElement projSaveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/div[2]/div/button"));
		projSaveBtn.click();

		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/section/form/ul/li"));
		assertEquals("The project name is required", errorMsg.getText());
	}
}
