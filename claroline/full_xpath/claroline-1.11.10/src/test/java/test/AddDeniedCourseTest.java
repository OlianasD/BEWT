package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class AddDeniedCourseTest extends BaseTest{

	@Test
	public void testClarolineAddDeniedCourse() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement platformAdminLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/ul/li[3]/span/a"));
		platformAdminLink.click();
		WebElement createCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]/ul/li[3]/a"));
		createCourseLink.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/div/dl/dd[1]/input"));
		titleField.clear();
		titleField.sendKeys("Course003");
		WebElement codeField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/div/dl/dd[2]/input"));
		codeField.clear();
		codeField.sendKeys("003");
		WebElement categoryMultiSelect = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/div/dl/dd[3]/table/tbody/tr/td[3]/select"));
		new Select(categoryMultiSelect).selectByVisibleText("Sciences");
		WebElement selectArrow = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/div/dl/dd[3]/table/tbody/tr/td[2]/a[2]"));
		selectArrow.click();
		WebElement registrationDeniedRadio = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset[1]/div/dl/dd[8]/input[2]"));
		registrationDeniedRadio.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/dl/dt/input"));
		saveBtn.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("You have just created the course website : 003"));
		WebElement continueLink = driver.findElement(By.xpath("/html/body/div/div[2]/p/a"));
		continueLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
