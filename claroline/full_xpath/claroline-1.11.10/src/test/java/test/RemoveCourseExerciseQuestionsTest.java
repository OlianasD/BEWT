package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class RemoveCourseExerciseQuestionsTest extends BaseTest {


	@Test
	public void testClarolineRemoveCourseExerciseQuestions() throws Exception {
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
		WebElement modifyIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]/a/img"));
		modifyIcon.click();
		WebElement deleteFirstQuestionIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a/img"));
		deleteFirstQuestionIcon.click();
		driver.switchTo().alert().accept();
		WebElement deleteSecondQuestionIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a/img"));
		deleteSecondQuestionIcon.click();
		driver.switchTo().alert().accept();
		WebElement deleteThirdQuestionIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a/img"));
		deleteThirdQuestionIcon.click();
		driver.switchTo().alert().accept();
		WebElement questionArea = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/table/tbody/tr/td"));
		assertTrue(questionArea.getText().contains("Empty"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
