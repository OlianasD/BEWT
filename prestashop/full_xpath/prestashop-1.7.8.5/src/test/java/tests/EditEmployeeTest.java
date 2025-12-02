package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditEmployeeTest extends BaseTest {
	
	@Test
	public void test_update_employeeNoPO() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement advancedParams = driver.findElement(By.xpath("/html/body/nav/div/ul/li[17]/a"));
		advancedParams.click();
		WebElement team = driver.findElement(By.xpath("/html/body/nav/div/ul/li[17]/ul/li[6]/a"));
		team.click();
		WebElement editIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[2]/td[8]/div/div/a[1]"));
		editIcon.click();
		WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[2]/div/input"));
		lastName.sendKeys("Main Admin");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));

		assertTrue(successMsg.getText().contains("Successful update"));
	}	
}
