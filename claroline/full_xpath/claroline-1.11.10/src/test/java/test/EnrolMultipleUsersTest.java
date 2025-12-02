package test;

import org.openqa.selenium.WebElement;
import utils.Properties;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;


public class EnrolMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineEnrolMultipleUsers() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("testuser1");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement enrolCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[1]/a"));
		enrolCourseLink.click();
		WebElement courseSearchBox = driver.findElement(By.xpath("/html/body/div/div[2]/form/input"));
		courseSearchBox.clear();
		courseSearchBox.sendKeys("Course001");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
		searchSubmitBtn.click();
		Thread.sleep(1000);
		WebElement enrolIcon = driver.findElement(By.xpath("/html/body/div/div[2]/dl/dt/a[1]/img"));
		enrolIcon.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
		driver.get(Properties.app_url);
		WebElement secondUserField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		secondUserField.clear();
		secondUserField.sendKeys("testuser2");
		WebElement secondPswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		secondPswField.clear();
		secondPswField.sendKeys("n0tl34k3dy3t");
		WebElement secondLoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		secondLoginBtn.click();
		WebElement secondEnrolCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/a"));
		secondEnrolCourseLink.click();
		WebElement secondCourseSearchBox = driver.findElement(By.xpath("/html/body/div/div[2]/form/input"));
		secondCourseSearchBox.clear();
		secondCourseSearchBox.sendKeys("Course001");
		WebElement secondSearchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
		secondSearchSubmitBtn.click();
		Thread.sleep(1000);
		WebElement secondEnrolIcon = driver.findElement(By.xpath("/html/body/div/div[2]/dl/dt/a[1]/img"));
		secondEnrolIcon.click();
		WebElement secondLogoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		secondLogoutBtn.click();
		driver.get(Properties.app_url);
		WebElement thirdUserField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		thirdUserField.clear();
		thirdUserField.sendKeys("testuser3");
		WebElement thirdPswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		thirdPswField.clear();
		thirdPswField.sendKeys("n0tl34k3dy3t");
		WebElement thirdLoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		thirdLoginBtn.click();
		WebElement thirdEnrolCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/a"));
		thirdEnrolCourseLink.click();
		WebElement thirdCourseSearchBox = driver.findElement(By.xpath("/html/body/div/div[2]/form/input"));
		thirdCourseSearchBox.clear();
		thirdCourseSearchBox.sendKeys("Course001");
		WebElement thirdSearchSubmitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
		thirdSearchSubmitBtn.click();
		Thread.sleep(1000);
		WebElement thirdEnrolIcon = driver.findElement(By.xpath("/html/body/div/div[2]/dl/dt/a[1]/img"));
		thirdEnrolIcon.click();
		WebElement thirdLogoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		thirdLogoutBtn.click();
		driver.get(Properties.app_url);
		WebElement fourthUserField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		fourthUserField.clear();
		fourthUserField.sendKeys("admin");
		WebElement fourthPswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		fourthPswField.clear();
		fourthPswField.sendKeys("n0tl34k3dy3t");
		WebElement fourthLoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		fourthLoginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[11]/a"));
		usersLink.click();
		WebElement displayedUser1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[1]/a"));
		WebElement displayedUser2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[1]/a"));
		WebElement displayedUser3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[5]/td[1]/a"));
		assertTrue(displayedUser1.getText().contains("Testuser1"));
		assertTrue(displayedUser2.getText().contains("Testuser2"));
		assertTrue(displayedUser3.getText().contains("Testuser3"));
		WebElement lastLogoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		lastLogoutBtn.click();
	}

}
