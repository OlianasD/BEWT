package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;

public class DeletePost_Test extends BaseTest {
	
	@Test
	public void deletePost_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement contentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		contentLink.click();
		Thread.sleep(500);
		WebElement deleteThirdPost = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[3]/a[3]"));
		deleteThirdPost.click();
		Thread.sleep(500);
		WebElement deleteConfirm = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[2]/button[2]"));
		deleteConfirm.click();
		Thread.sleep(500);
		WebElement pagesContainer = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]"));
		
		assertFalse(pagesContainer.getText().contains("Follow Bludit"));
	}
	
}
