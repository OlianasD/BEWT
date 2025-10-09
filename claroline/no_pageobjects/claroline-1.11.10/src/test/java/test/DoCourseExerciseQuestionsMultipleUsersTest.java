package test;


import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class DoCourseExerciseQuestionsMultipleUsersTest extends BaseTest {


	@Test
	public void testClarolineDoCourseExerciseQuestionsMultipleUsers() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser1");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.linkText("Exercise 001")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[2]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[2]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[3]/td[1]/input"))
				.click();
		driver.findElement(By.name("cmdOk")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser2");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.linkText("Exercise 001")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[1]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[2]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[3]/td[1]/input"))
				.click();
		driver.findElement(By.name("cmdOk")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("testuser3");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.linkText("Exercise 001")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[1]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[1]/td[1]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[2]/td[1]/input"))
				.click();
		driver.findElement(By.name("cmdOk")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		driver.get(app_url);
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[6]/a/img")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[3]/td[1]")).getText().contains("testuser1 testuser1"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[3]/td[3]")).getText().contains("-3"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[4]/td[1]")).getText().contains("testuser2 testuser2"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[4]/td[3]")).getText().contains("0"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[5]/td[1]")).getText().contains("testuser3 testuser3"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table[1]/tbody/tr[5]/td[3]")).getText().contains("6"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
