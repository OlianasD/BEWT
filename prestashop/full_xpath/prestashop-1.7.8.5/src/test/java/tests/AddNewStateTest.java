package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewStateTest extends BaseTest {

	@Test
	public void test_add_new_state() throws InterruptedException {
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
		WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[2]/div[1]/div/input"));
		name.sendKeys("Liguria3");
		WebElement isoCode = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[2]/div[2]/div/input"));
		isoCode.sendKeys("1121");
		WebElement countrySelect = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[2]/div[3]/div/select"));
		new Select(countrySelect).selectByVisibleText("Italy");
		WebElement zoneSelect = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[2]/div[4]/div/select"));
		new Select(zoneSelect).selectByVisibleText("Europe");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/form/div/div[3]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div"));
		assertTrue(successMsg.getText().contains("Successful creation"));
	}

}
