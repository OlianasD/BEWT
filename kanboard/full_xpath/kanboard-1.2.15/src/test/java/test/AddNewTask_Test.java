package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewTask_Test extends BaseTest {
		  
	@Test
	public void addNewTask() {
		String taskName = "task 3";

		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement projectLink = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[2]/div[2]/div[1]/span/a"));
		projectLink.click();
		WebElement gearIcon = driver.findElement(By.xpath("/html/body/section/section/div[1]/div[1]/div/a"));
		gearIcon.click();
		WebElement addTaskLink = driver.findElement(By.xpath("/html/body/div/ul/li[3]/a"));
		addTaskLink.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/div[1]/input[1]"));
		titleField.sendKeys(taskName);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/div[4]/div/div/button"));
		saveBtn.click();

		WebElement displayedTaskName = driver.findElement(By.xpath("/html/body/section/section/div[2]/table/tbody/tr[2]/td[1]/div[1]/div/div[2]/div[3]/a"));
		assertEquals(taskName, displayedTaskName.getText());
		
	}
		  
		  
}
