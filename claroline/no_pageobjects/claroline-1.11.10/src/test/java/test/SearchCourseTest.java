package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;



public class SearchCourseTest extends BaseTest {

	@Test
	public void testClarolineSearchCourse() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.id("search_course")).clear();
		driver.findElement(By.id("search_course")).sendKeys("Course001");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/form/input[2]")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[2]")).getText().contains("Course001"));
		assertTrue(driver.findElement(By.xpath("//*[@id='L0']")).getText().contains("001"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
