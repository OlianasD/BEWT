package test;

import org.openqa.selenium.WebElement;
import utils.DriverProvider;
import utils.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchAndRemoveDeniedCourseTest extends BaseTest {

	@Test
	public void testClarolineSearchAndRemoveDeniedCourse() throws Exception {
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
		WebElement advancedCourseSearchLink = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]/ul/li[1]/form/small/a"));
		advancedCourseSearchLink.click();
		WebElement courseTitleField = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset/dl/dd[2]/input"));
		courseTitleField.sendKeys("Course003");
		WebElement deniedRadio = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset/dl/dd[5]/table/tbody/tr/td[3]/input"));
		deniedRadio.click();
		WebElement submitSearchBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset/input"));
		submitSearchBtn.click();
		WebElement res = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[2]/a"));
		assertTrue(res.getText().contains("Course003"));
		WebElement deleteBtn = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[5]/a/img"));
		deleteBtn.click();
		driver.switchTo().alert().accept();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("The course has been successfully deleted"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
