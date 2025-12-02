package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AddAsDraft_Test extends BaseTest {
	
	@Test
	public void addAsDraft_Test() {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement newContLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[4]/a"));
		newContLink.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/input"));
		titleField.sendKeys("Draft Content");
		WebElement draftSwitch = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/span"));
		draftSwitch.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		WebElement standardPost = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[1]/div[1]/a"));
		
		assertFalse(standardPost.getText().contains("Draft Content"));
		WebElement draftTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/ul/li[5]/a"));
		draftTab.click();
		WebElement draftPost = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[5]/table/tbody/tr/td[1]/div[1]/a"));
		assertEquals("Draft Content", draftPost.getText());
	}
}