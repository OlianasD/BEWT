package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditProject_Test extends BaseTest {
	
	@Test
	public void editProject() {
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
		WebElement editProjectLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[3]/a"));
		editProjectLink.click();
		WebElement descriptionField = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/div/div/div[2]/textarea"));
		descriptionField.sendKeys("This is the new description");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/div/div/button"));
		saveBtn.click();
		WebElement summaryLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[1]/a"));
		summaryLink.click();
		WebElement displayedDescription = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/article/p"));
		
		assertEquals("This is the new description", displayedDescription.getText());
	}
		  

		  
}
