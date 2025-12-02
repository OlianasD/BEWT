package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangeTask_Test extends BaseTest {
	
	@Test
	public void changeTask() throws InterruptedException {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement projectLink = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[2]/div[2]/div[1]/span/a"));
		projectLink.click();
		WebElement taskLink = driver.findElement(By.xpath("/html/body/section/section/div[2]/table/tbody/tr[3]/td[1]/div[1]/div/div[2]/div[3]/a"));
		taskLink.click();
		WebElement closeTaskLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul[2]/li[14]/a"));
		closeTaskLink.click();
		WebElement confirmBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/button"));
		confirmBtn.click();
		Thread.sleep(1000);
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/section/div/div/div[1]/ul/li[1]/span"));

		assertEquals("closed", displayedStatus.getText());
	}
		  

		  
}
