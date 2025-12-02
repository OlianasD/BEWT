package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmptyStateTest extends BaseTest {

	@Test
	public void test_add_empty_stateNoPO() {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement international = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/a"));
		international.click();
		WebElement locations = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/ul/li[2]/a"));
		locations.click();
		WebElement states = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a"));
		states.click();
		WebElement addNewState = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div/ul/li[1]/a"));
		addNewState.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[3]/button"));
		saveBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div"));
		assertEquals(
				"×\n" + "There are 2 errors.\n" + "The iso_code field is required.\n" + "The name field is required.",
				errorMsg.getText());

	}

}
