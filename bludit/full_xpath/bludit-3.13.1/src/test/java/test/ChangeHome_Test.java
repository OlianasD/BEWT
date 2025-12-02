package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangeHome_Test extends BaseTest {
	
	@Test
	public void changeHome_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement generalLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[10]/a"));
		generalLink.click();
		WebElement navAdvancedTab =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[2]"));
		navAdvancedTab.click();
		WebElement homeSelect = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div[3]/div/span/span[1]/span"));
		homeSelect.click();
		WebElement homeInput = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		homeInput.sendKeys("Create your own content");
		Thread.sleep(1000);
		WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"select2-jshomepage-results\"]/li"));
		elem1.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement homeContainer = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div[3]/div/span/span[1]/span/span[1]"));

		assertEquals("Create your own content", homeContainer.getAttribute("title"));
	}
	
}