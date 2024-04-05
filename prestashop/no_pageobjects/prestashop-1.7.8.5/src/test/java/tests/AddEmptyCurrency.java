package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyCurrency extends BaseTest {
	
	@Test
	public void test_add_empty_currency(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).click();
		driver.findElement(By.id("subtab-AdminParentLocalization")).click();
		driver.findElement(By.id("subtab-AdminCurrencies")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("save-button")).click();
		
		assertEquals("The field names is required at least in your default language.", 
				driver.findElement(By.xpath("//*[@id=\"currency_form\"]/div/div[2]/div/div[3]/div/div[3]/div")).getText());
		assertEquals("The \"ISO code\" field is required.", 
				driver.findElement(By.xpath("//*[@id=\"currency\"]/div[1]/div/div[2]/div")).getText());
	}
}
