package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class EditArticle extends BaseTest {
	
	@Test
	public void editArticle() throws Exception {
		String expectedBody = "This is the body of the first article for testing the platformEDITED";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div[1]/div/div[2]/div/div/a/div")).click();
		driver.switchTo().frame(driver.findElement(By.id("jform_articletext_ifr")));
		driver.findElement(By.id("tinymce")).sendKeys("EDITED");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div/button[2]")).click();
		
		assertEquals(expectedBody, driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div/p")).getText());
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}
