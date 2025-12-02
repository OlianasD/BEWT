package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreateUserPageTest extends BaseTest {
	
	@Test
	public void createUserPage() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li/a"));
		loginLink.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[1]/div/input"));
		userField.clear();
		userField.sendKeys("User001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[2]/div/input"));
		pswField.clear();
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement userLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li[1]/a"));
		userLink.click();
		WebElement createSource = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		createSource.click();
		WebElement classicEditor = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[2]/div[3]/div[1]/div[2]/div/textarea"));
		classicEditor.sendKeys("This is my user page");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[4]/div[4]/span[1]/input"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));
		
		assertEquals("User:User001", heading.getText());
		assertEquals("This is my user page", text.getText());
	}
	
	
}