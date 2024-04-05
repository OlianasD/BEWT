package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddEmptyArticle extends BaseTest {
	
	@Test
	public void addEmptyArticle() {
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Create a Post")).click();
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div/button[2]")).click();
		
		assertEquals("Please fill in this field", driver.findElement(By.xpath("//*[@id=\"jform_title-lbl\"]/span[2]")).getText());
	}
}
