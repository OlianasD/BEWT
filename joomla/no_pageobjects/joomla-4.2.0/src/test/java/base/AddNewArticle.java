package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewArticle extends BaseTest {
	
	@Test
	public void addNewArticle() {
		String title = "Test Article 01";
		String body = "This is the body of the first article for testing the platform";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Create a Post")).click();
		driver.findElement(By.id("jform_title")).sendKeys(title);
		driver.switchTo().frame(driver.findElement(By.id("jform_articletext_ifr")));
		driver.findElement(By.id("tinymce")).sendKeys(body);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div/button[2]")).click();
		
		assertEquals(title, driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div/div/h2/a")).getText());
		assertEquals(body, driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div/p")).getText());
		
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
		
	}
}
