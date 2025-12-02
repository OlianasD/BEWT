package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterEmployee_NoNameTest extends BaseTest {
	
	@Test
	public void test_register_employee_no_name(){
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
		WebElement addEmployee = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addEmployee.click();
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[6]/div/input"));
		email.sendKeys("smith@gmail.com");
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[7]/div/input"));
		password.sendKeys("abcd!@#$23");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/input"));
		
		assertTrue(firstName.getAttribute("validationMessage").contains("Please fill out this field."));
	 }
}
