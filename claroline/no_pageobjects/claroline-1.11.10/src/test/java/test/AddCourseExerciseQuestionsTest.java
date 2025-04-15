package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class AddCourseExerciseQuestionsTest extends BaseTest {


	@Test
	public void testClarolineAddCourseExerciseQuestions() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("001 - Course001")).click();
		driver.findElement(By.id("CLQWZ")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[2]/a/img")).click();
		driver.findElement(By.linkText("New question")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Question 1");
		driver.findElement(By.id("MCUA")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/form/div[2]/input")).click();
		driver.findElement(By.id("correct_1")).click();
		driver.findElement(By.name("grade_1")).clear();
		driver.findElement(By.name("grade_1")).sendKeys("3");
		driver.findElement(By.name("grade_2")).clear();
		driver.findElement(By.name("grade_2")).sendKeys("-3");
		driver.findElement(By.name("cmdOk")).click(); 
		driver.findElement(By.linkText("New question")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Question 2");
		driver.findElement(By.id("TF")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/form/div[2]/input")).click();
		driver.findElement(By.id("trueCorrect")).click();
		driver.findElement(By.name("trueGrade")).clear();
		driver.findElement(By.name("trueGrade")).sendKeys("3");
		driver.findElement(By.name("falseGrade")).clear();
		driver.findElement(By.name("falseGrade")).sendKeys("-3");
		driver.findElement(By.name("cmdOk")).click(); 
		driver.findElement(By.linkText("New question")).click();
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Question 3");
		driver.findElement(By.id("MCMA")).click();
		driver.findElement(By.xpath("//*[@id='courseRightContent']/form/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("cmdAddAnsw")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.id("correct_1")).click();
		driver.findElement(By.name("grade_1")).clear();
		driver.findElement(By.name("grade_1")).sendKeys("3");
		driver.findElement(By.name("grade_2")).clear();
		driver.findElement(By.name("grade_2")).sendKeys("0");
		driver.findElement(By.name("grade_3")).clear();
		driver.findElement(By.name("grade_3")).sendKeys("-3");
		driver.findElement(By.name("cmdOk")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.linkText("Exercise 001")).click();		
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[1]/td[2]")).getText().contains("Question 1"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[1]/td[4]")).getText().contains("Multiple choice (Unique answer)"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[2]")).getText().contains("Question 2"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[2]/td[4]")).getText().contains("True/False"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[3]/td[2]")).getText().contains("Question 3"));
		assertTrue(driver.findElement(By.xpath("//*[@id='courseRightContent']/table/tbody/tr[3]/td[4]")).getText().contains("Multiple choice (Multiple answers)"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
