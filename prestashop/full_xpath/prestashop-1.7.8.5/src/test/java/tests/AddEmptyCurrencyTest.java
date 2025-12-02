package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyCurrencyTest extends BaseTest {
	
	@Test
	public void test_add_empty_currency(){
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement international = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/a"));
		international.click();
		WebElement localization = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/ul/li[1]/a"));
		localization.click();
		WebElement currencies = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a"));
		currencies.click();
		WebElement addCurrency = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addCurrency.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[3]/button"));
		saveBtn.click();
		WebElement nameError = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[3]/div/div[3]/div"));
		WebElement isoError = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[5]/div[1]/div/div[2]/div"));

		assertEquals("The field names is required at least in your default language.",
				nameError.getText());
		assertEquals("The \"ISO code\" field is required.", 
				isoError.getText());
	}
}
