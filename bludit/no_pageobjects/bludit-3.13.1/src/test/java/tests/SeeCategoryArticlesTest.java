package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeeCategoryArticlesTest extends BaseTest {
	
	@Test
	public void seeCategoryArticles() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("/category/aaanewurl001")).click();
		
		assertEquals("Create your own content", driver.findElement(By.xpath("/html/body/section/div/div/div/a/h2")).getText());
	}
}