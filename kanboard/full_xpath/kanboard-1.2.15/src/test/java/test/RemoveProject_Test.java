package test;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RemoveProject_Test extends BaseTest {
	
	@Test
	public void removeProject() throws InterruptedException {
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
		WebElement removeBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[17]/a"));
		removeBtn.click();
		WebElement confirmBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/button"));
		confirmBtn.click();
		Thread.sleep(500);
		WebElement body = driver.findElement(By.xpath("/html/body"));

		assertFalse(body.getText().contains("Test 2"));
	}

}
