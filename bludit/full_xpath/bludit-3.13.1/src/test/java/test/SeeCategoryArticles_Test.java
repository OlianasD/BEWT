package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SeeCategoryArticles_Test extends BaseTest {
	
	@Test
	public void seeCategoryArticles_Test() {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement categoriesLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[7]/a"));
		categoriesLink.click();
		WebElement categoryUrlLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a"));
		categoryUrlLink.click();
		WebElement postTitle = driver.findElement(By.xpath("/html/body/section/div/div/div/a/h2"));
		
		assertEquals("Create your own content", postTitle.getText());
	}
}