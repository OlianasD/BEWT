package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddFieldGroupTest extends BaseTest {
	
	@Test
	public void addFieldGroupNoPO() {
		String group = "Test Group 000";

		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement siteAdminLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[3]/a"));
		siteAdminLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver = driver.switchTo().window(tabs2.get(1));
		WebElement siteAdminUser = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[1]/div/input"));
		siteAdminUser.clear();
		siteAdminUser.sendKeys("administrator");
		WebElement siteAdminPsw = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[2]/div/input"));
		siteAdminPsw.clear();
		siteAdminPsw.sendKeys(rootPassword);
		WebElement siteAdminLoginBtn = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[3]/div/button"));
		siteAdminLoginBtn.click();
		WebElement contentLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[2]/a"));
		contentLink.click();
		WebElement fieldGroupsLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[2]/ul/li[6]/a"));
		fieldGroupsLink.click();
		WebElement addFieldGroupBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/nav/div/joomla-toolbar-button[1]/button"));
		addFieldGroupBtn.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[1]/div[1]/div/div[2]/input"));
		titleField.sendKeys(group);
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/nav/div/div/joomla-toolbar-button/button"));
		saveAndCloseBtn.click();
		WebElement displayedGroup = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr/th/div/a"));
		assertEquals(group, displayedGroup.getText());

		WebElement userMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/button/div[2]"));
		userMenuDropdown.click();
		WebElement siteAdminLogoutLink = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/div/a[3]"));
		siteAdminLogoutLink.click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
		driver = driver.switchTo().window(tabs2.get(0));
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
	}

}