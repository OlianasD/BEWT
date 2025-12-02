package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class AddSocials_Test extends BaseTest {
	
	@Test
	public void addSocials_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[8]/a"));
		usersLink.click();
		WebElement user = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a"));
		user.click();
		WebElement socialTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[4]"));
		socialTab.click();
		WebElement fbField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div[2]/div/input"));
		fbField.sendKeys("https://www.facebook.com/some_fake_user_name_52432562135863");
		WebElement igField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div[4]/div/input"));
		igField.sendKeys("https://instagram.com/some_fake_user_name_52432562135863");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondUser = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a"));
		secondUser.click();
		WebElement secondSocialTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[4]"));
		secondSocialTab.click();
		Thread.sleep(500);
		WebElement secondFbField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div[2]/div/input"));
		WebElement secondIgField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div[4]/div/input"));

		assertEquals("https://www.facebook.com/some_fake_user_name_52432562135863", secondFbField.getAttribute("value"));
		assertEquals("https://instagram.com/some_fake_user_name_52432562135863", secondIgField.getAttribute("value"));
		
	}
}