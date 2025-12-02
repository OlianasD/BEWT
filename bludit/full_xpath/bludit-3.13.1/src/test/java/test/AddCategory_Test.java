package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class AddCategory_Test extends BaseTest {
	
	@Test
	public void addCategory_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement categoriesLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[7]/a"));
		categoriesLink.click();
		WebElement addCatLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a"));
		addCatLink.click();
		WebElement nameField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/input"));
		nameField.sendKeys("Category001");
		WebElement descrField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div/textarea"));
		descrField.sendKeys("Description001");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement category = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a"));

		assertEquals("Category001", category.getText());
		
	}
	
}
