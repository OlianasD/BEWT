package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;


public class SearchAdminTest extends BaseTest {


	@Test
	public void testClarolineSearchAdmin() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement platformAdminLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/ul/li[3]/span/a"));
		platformAdminLink.click();
		WebElement advancedUserSearch = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/ul/li[1]/form/small/a"));
		advancedUserSearch.click();
		WebElement lastNameField = driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[1]/td[2]/input"));
		lastNameField.clear();
		lastNameField.sendKeys("Doe");
		WebElement roleSelect = driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[6]/td[2]/select"));
		new Select(roleSelect).selectByVisibleText("Platform administrator");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[7]/td[2]/input"));
		searchSubmitBtn.click();
		WebElement displayedUser = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[2]"));
		assertTrue(displayedUser.getText().contains("Doe"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
