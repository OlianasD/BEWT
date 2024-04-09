package test;


import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class AddEmptyCourseTest extends BaseTest {

	@Test
	public void testClarolineAddEmptyCourse() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Create course")).click();
		driver.findElement(By.name("changeProperties")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div/span[1]")).getText().contains("Course title needed"));
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div/span[2]")).getText().contains("Course code needed"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
