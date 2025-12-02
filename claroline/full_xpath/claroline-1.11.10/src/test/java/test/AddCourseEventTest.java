package test;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import static org.junit.Assert.assertTrue;

public class AddCourseEventTest extends BaseTest {

	@Test
	public void testClarolineAddCourseEvent() throws Exception {
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
		WebElement agendaLink = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[1]/div/div/ul[1]/li[3]/a"));
		agendaLink.click();
		WebElement addEventBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div/table/tbody/tr/td[2]/ul/li[2]/a"));
		addEventBtn.click();
		WebElement titleField = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[1]/input"));
		titleField.clear();
		titleField.sendKeys("Exam 001");
		WebElement selectDay = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[2]/select[1]"));
		WebElement selectMonth = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[2]/select[2]"));
		WebElement selectYear = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[2]/select[3]"));
		new Select(selectDay).selectByVisibleText("31");
		new Select(selectMonth).selectByVisibleText("May");
		new Select(selectYear).selectByVisibleText("2023");
		WebElement locationField = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/fieldset[1]/dl/dd[4]/input"));
		locationField.clear();
		locationField.sendKeys("Genoa");
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/form/input"));
		submitBtn.click();
		WebElement submitMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[2]/div"));
		assertTrue(submitMsg.getText()
				.contains("Event added to the agenda."));
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/ul/li[3]/span/a"));
		logoutBtn.click();
	}

}
