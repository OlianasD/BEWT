package tests;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyCategoryTest extends BaseTest {

	
	@Test
	public void test_add_empty_category() throws InterruptedException{
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement categories = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[2]/a"));
		categories.click();
		WebElement addCategory = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addCategory.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div[2]/div[2]/div"));
		
		assertEquals("The field name is required at least in your default language.", errorMsg.getText());
	}
}
