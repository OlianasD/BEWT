package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AdminLoginTest extends BaseTest {
	
	@Test
	public void adminLoginTest() {
		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement displayedName = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/fieldset[1]/dl/dd[1]"));
		assertEquals("Super User", displayedName.getText());
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
		
	}
	
}
