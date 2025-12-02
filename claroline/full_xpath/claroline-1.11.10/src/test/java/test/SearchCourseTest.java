package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;



public class SearchCourseTest extends BaseTest {

	@Test
	public void testClarolineSearchCourse() throws Exception {
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
		WebElement searchCourseBar = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]/ul/li[1]/form/input[1]"));
		searchCourseBar.clear();
		searchCourseBar.sendKeys("Course001");
		WebElement searchSubmitBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/form/input[2]"));
		searchSubmitBtn.click();
		WebElement displayedCourseName = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[2]"));
		WebElement displayedCourseCode = driver.findElement(By.xpath("/html/body/div/div[2]/table[2]/tbody/tr/td[1]"));

		assertTrue(displayedCourseName.getText().contains("Course001"));
		assertTrue(displayedCourseCode.getText().contains("001"));

		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
