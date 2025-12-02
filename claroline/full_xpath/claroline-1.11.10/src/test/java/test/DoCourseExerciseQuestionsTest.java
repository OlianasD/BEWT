package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;

public class DoCourseExerciseQuestionsTest extends BaseTest {


	@Test
	public void testClarolineDoCourseExerciseQuestions() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("user001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[2]"));
		pswField.clear();
		pswField.sendKeys("n0tl34k3dy3t");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/fieldset/button"));
		loginBtn.click();
		WebElement courseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		courseLink.click();
		WebElement exercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		exercisesLink.click();
		WebElement exercise1Link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr/td/a"));
		exercise1Link.click();
		WebElement answer1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[1]/td[1]/input"));
		answer1.click();
		WebElement answer2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[1]/td[1]/input"));
		answer2.click();
		WebElement answer3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[1]/td[1]/input"));
		answer3.click();
		WebElement finishBtn  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div/input"));
		finishBtn.click();
		Thread.sleep(1000);
		WebElement scoreMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div[1]/div/strong"));
		assertTrue(scoreMsg.getText().contains("Your total score is 9/9"));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}


}
