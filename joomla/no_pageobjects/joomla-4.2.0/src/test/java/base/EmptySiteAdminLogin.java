package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;

public class EmptySiteAdminLogin extends BaseTest {
	
	@Test
	public void emptySiteAdminLogin() throws InterruptedException {
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Site Administrator")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver = driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.id("btn-login-submit")).click();
		Thread.sleep(500);
		
		assertEquals("Please fill in this field", driver.findElement(By.xpath("//*[@id=\"form-login\"]/fieldset/div[1]/label/span")).getText());
		assertEquals("Please fill in this field", driver.findElement(By.xpath("//*[@id=\"form-login\"]/fieldset/div[2]/label/span")).getText());
	}
}
