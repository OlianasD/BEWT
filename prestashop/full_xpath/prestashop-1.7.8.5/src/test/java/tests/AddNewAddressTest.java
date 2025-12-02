package tests;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewAddressTest extends BaseTest {
	
	@Test
	public void test_add_address(){
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement customers = driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]/a"));
		customers.click();
		WebElement addresses = driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]/ul/li[2]/a"));
		addresses.click();
		WebElement addAddress = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addAddress.click();
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[1]/div/input"));
		email.sendKeys("anonymous@psgdpr.com");
		WebElement alias = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[3]/div/input"));
		alias.sendKeys("Test");
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[4]/div/input"));
		firstName.clear();
		firstName.sendKeys("John");
		WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[5]/div/input"));
		lastName.clear();
		lastName.sendKeys("DOE");
		WebElement address = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[8]/div/input"));
		address.sendKeys("Via Torino");
		WebElement postCode = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[10]/div/input"));
		postCode.sendKeys("12345");
		WebElement phone = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[14]/div/input"));
		phone.sendKeys("123456789");
		WebElement mobile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[15]/div/input"));
		mobile.sendKeys("987654321");
		WebElement city = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[11]/div/input"));
		city.sendKeys("Bologna");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[3]/div[2]/button"));
		saveBtn.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		
		assertTrue(successMsg.getText().contains("Successful creation"));
	}
}
