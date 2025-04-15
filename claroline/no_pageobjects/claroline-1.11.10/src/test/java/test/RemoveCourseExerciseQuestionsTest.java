package test;


import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class RemoveCourseExerciseQuestionsTest extends BaseTest {


	@Test
	public void testClarolineRemoveCourseExerciseQuestions() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[2]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[1]/td[6]/a/img")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[1]/td[6]/a/img")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[1]/td[6]/a/img")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr/td")).getText().contains("Empty"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
