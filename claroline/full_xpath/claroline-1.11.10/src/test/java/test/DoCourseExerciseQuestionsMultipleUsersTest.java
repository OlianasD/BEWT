package test;


import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import utils.Properties;

public class DoCourseExerciseQuestionsMultipleUsersTest extends BaseTest {


	@Test
	public void testClarolineDoCourseExerciseQuestionsMultipleUsers() throws Exception {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form/fieldset/input[1]"));
		userField.clear();
		userField.sendKeys("testuser1");
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
		WebElement answer1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[2]/td[1]/input"));
		answer1.click();
		WebElement answer2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[2]/td[1]/input"));
		answer2.click();
		WebElement answer3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[3]/td[1]/input"));
		answer3.click();
		WebElement finishBtn  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div/input"));
		finishBtn.click();
		Thread.sleep(1000);
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
		WebElement secondCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		secondCourseLink.click();
		WebElement secondExercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		secondExercisesLink.click();
		WebElement secondExercise1Link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr/td/a"));
		secondExercise1Link.click();
		WebElement secondAnswer1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[1]/td[1]/input"));
		secondAnswer1.click();
		WebElement secondAnswer2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[2]/td[1]/input"));
		secondAnswer2.click();
		WebElement secondAnswer3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[3]/td[1]/input"));
		secondAnswer3.click();
		WebElement secondFinishBtn  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div/input"));
		secondFinishBtn.click();
		Thread.sleep(1000);
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
		WebElement thirdCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		thirdCourseLink.click();
		WebElement thirdExercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		thirdExercisesLink.click();
		WebElement thirdExercise1Link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[1]/a"));
		thirdExercise1Link.click();
		WebElement thirdAnswer1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[1]/tr/td/table/tbody/tr[1]/td[1]/input"));
		thirdAnswer1.click();
		WebElement thirdAnswer2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[2]/tr/td/table/tbody/tr[1]/td[1]/input"));
		thirdAnswer2.click();
		WebElement thirdAnswer3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[2]/form/table/tbody[3]/tr/td/table/tbody/tr[2]/td[1]/input"));
		thirdAnswer3.click();
		WebElement thirdFinishBtn  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/div/input"));
		thirdFinishBtn.click();
		Thread.sleep(1000);
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
		WebElement fourthCourseLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/dl/dt/span/a"));
		fourthCourseLink.click();
		WebElement fourthExercisesLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[6]/a"));
		fourthExercisesLink.click();
		WebElement statisticsIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[6]/a/img"));
		statisticsIcon.click();
		WebElement displayedUser1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[3]/td[1]"));
		WebElement displayedUser2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[4]/td[1]"));
		WebElement displayedUser3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[5]/td[1]"));
		WebElement displayedScore1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[3]/td[3]"));
		WebElement displayedScore2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[4]/td[3]"));
		WebElement displayedScore3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/table[1]/tbody/tr[5]/td[3]"));

		assertTrue(displayedUser1.getText().contains("testuser1 testuser1"));
		assertTrue(displayedScore1.getText().contains("-3"));
		assertTrue(displayedUser2.getText().contains("testuser2 testuser2"));
		assertTrue(displayedScore2.getText().contains("0"));
		assertTrue(displayedUser3.getText().contains("testuser3 testuser3"));
		assertTrue(displayedScore3.getText().contains("6"));
		WebElement lastLogoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		lastLogoutBtn.click();
	}


}
