package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class EmptyLogin extends BaseTest {
	
	
	@Test
	public void emptyLogin() {
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		assertEquals("Please fill in this field", driver.findElement(By.xpath("//*[@id=\"username-lbl\"]/span[2]")).getText());
	}
	
}