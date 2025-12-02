package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class AddEmptyCourseTest extends BaseTest {

	@Test
	public void testClarolineAddEmptyCourse() throws Exception {
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
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/dl/dt/input"));
		saveBtn.click();
		WebElement titleErrorMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/span[1]"));
		WebElement codeErrorMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/span[2]"));

		assertTrue(titleErrorMsg.getText().contains("Course title needed"));
		assertTrue(codeErrorMsg.getText().contains("Course code needed"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
