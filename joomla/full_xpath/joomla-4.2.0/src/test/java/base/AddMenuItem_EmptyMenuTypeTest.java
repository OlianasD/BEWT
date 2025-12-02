package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddMenuItem_EmptyMenuTypeTest extends BaseTest {
	
	@Test
	public void addMenuItem_EmptyMenuType() throws InterruptedException {
		String name = "Test menu item";

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
		WebElement menusLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[3]/a"));
		menusLink.click();
		WebElement allMenuItemsLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[3]/ul/li[3]/a/span"));
		allMenuItemsLink.click();
		WebElement addMenuItem = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/nav/div/joomla-toolbar-button[1]/button"));
		addMenuItem.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[1]/div[1]/div/div[2]/input"));
		titleField.sendKeys(name);
		WebElement menuTypeSelect = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[2]/joomla-tab/joomla-tab-element[1]/div/div[2]/fieldset/div[1]/div[2]/select"));
		new Select(menuTypeSelect).selectByVisibleText("Main Menu");
		Thread.sleep(1000);
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/nav/div/div/joomla-toolbar-button/button"));
		saveAndCloseBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div[2]/joomla-tab/joomla-tab-element[1]/div/div[1]/div[1]/div[1]/label/span[2]"));
		assertEquals("Please fill in this field", errorMsg.getText());
	}
}
