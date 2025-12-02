package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class AddCourseExerciseQuestionsTest extends BaseTest {


	@Test
	public void testClarolineAddCourseExerciseQuestions() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement exercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		exercisesLink.click();
		WebElement modifyExercise = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]/a/img"));
		modifyExercise.click();
		WebElement newQuestion = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/ul/li[3]/a"));
		newQuestion.click();
		WebElement question1Title = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[1]/input"));
		question1Title.clear();
		question1Title.sendKeys("Question 1");
		WebElement question1MCUA = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[5]/input[1]"));
		question1MCUA.click();
		WebElement question1OkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div[2]/input"));
		question1OkBtn.click();
		WebElement question1Correct1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/input"));
		question1Correct1.click();
		WebElement question1GradeCorrect = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[4]/input"));
		question1GradeCorrect.clear();
		question1GradeCorrect.sendKeys("3");
		WebElement question1GradeWrong = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[2]/td[4]/input"));
		question1GradeWrong.clear();
		question1GradeWrong.sendKeys("-3");
		WebElement question1AnswersOkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[3]/td/input[1]"));
		question1AnswersOkBtn.click();
		WebElement secondNewQuestion = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/ul/li[3]/a"));
		secondNewQuestion.click();
		WebElement question2Title = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[1]/input"));
		question2Title.clear();
		question2Title.sendKeys("Question 2");
		WebElement question2TF = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[5]/input[3]"));
		question2TF.click();
		WebElement question2OkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div[2]/input"));
		question2OkBtn.click();
		WebElement question2TrueCorrect = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/input"));
		question2TrueCorrect.click();
		WebElement question2GradeCorrect = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[4]/input"));
		question2GradeCorrect.clear();
		question2GradeCorrect.sendKeys("3");
		WebElement question2GradeWrong = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[2]/td[4]/input"));
		question2GradeWrong.clear();
		question2GradeWrong.sendKeys("-3");
		WebElement question2AnswersOkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[3]/td/input"));
		question2AnswersOkBtn.click();
		WebElement thirdNewQuestion = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/ul/li[3]/a"));
		thirdNewQuestion.click();
		WebElement question3Title = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[1]/input"));
		question3Title.clear();
		question3Title.sendKeys("Question 3");
		WebElement question3MCMA = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset/dl/dd[5]/input[2]"));
		question3MCMA.click();
		WebElement question3OkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div[2]/input"));
		question3OkBtn.click();
		Thread.sleep(1000);
		WebElement question3AddAnsw = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[3]/td/input[3]"));
		question3AddAnsw.click();
		Thread.sleep(1000);
		WebElement question3Correct1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/input"));
		question3Correct1.click();
		WebElement question3Grade1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[1]/td[4]/input"));
		question3Grade1.clear();
		question3Grade1.sendKeys("3");
		WebElement question3Grade2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[2]/td[4]/input"));
		question3Grade2.clear();
		question3Grade2.sendKeys("0");
		WebElement question3Grade3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[3]/td[4]/input"));
		question3Grade3.clear();
		question3Grade3.sendKeys("-3");
		WebElement question3AnswersOkBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody/tr[4]/td/input[1]"));
		question3AnswersOkBtn.click();
		Thread.sleep(1000);
		WebElement exercise001Link = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div[1]/ul/li[4]/a"));
		exercise001Link.click();
		WebElement question1DisplayedTitle = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[2]"));
		WebElement question1DisplayedType = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[4]/small"));
		WebElement question2DisplayedTitle = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]"));
		WebElement question2DisplayedType = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[4]/small"));
		WebElement question3DisplayedTitle = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[2]"));
		WebElement question3DisplayedType = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[4]/small"));
		assertTrue(question1DisplayedTitle.getText().contains("Question 1"));
		assertTrue(question1DisplayedType.getText().contains("Multiple choice (Unique answer)"));
		assertTrue(question2DisplayedTitle.getText().contains("Question 2"));
		assertTrue(question2DisplayedType.getText().contains("True/False"));
		assertTrue(question3DisplayedTitle.getText().contains("Question 3"));
		assertTrue(question3DisplayedType.getText().contains("Multiple choice (Multiple answers)"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
