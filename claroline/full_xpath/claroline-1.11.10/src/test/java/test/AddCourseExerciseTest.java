package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class AddCourseExerciseTest extends BaseTest {

	@Test
	public void testClarolineAddCourseExercise() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement exercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		exercisesLink.click();
		WebElement newExercise = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/ul/li[2]/a"));
		newExercise.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[1]/input"));
		titleField.clear();
		titleField.sendKeys("Exercise 001");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div[2]/input"));
		saveBtn.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[2]/div"));
		assertTrue(successMsg.getText().contains("Exercise added"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
