package tests;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;



public class AddEmptyCategory extends BaseTest {

	
	@Test
	public void test_add_empty_category() throws InterruptedException{
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminCategories")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		
		
		assertEquals("The field name is required at least in your default language.", 
					driver.findElement(By.xpath("//*[@id=\"main-div\"]/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div[2]/div[2]/div")).getText());
	}
}
