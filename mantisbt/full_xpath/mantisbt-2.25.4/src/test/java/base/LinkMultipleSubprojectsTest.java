package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class LinkMultipleSubprojectsTest extends BaseTest {

	@Test
	public void linkMultipleSubprojects() throws InterruptedException {
		WebElement loginUsr = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/label/span/input"));
		loginUsr.clear();
		loginUsr.sendKeys("administrator");
		WebElement usrLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]"));
		usrLoginBtn.click();
		Thread.sleep(500);
		WebElement loginPsw = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/label/span/input"));
		loginPsw.clear();
		loginPsw.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]"));
		pswLoginBtn.click();
		WebElement manage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[7]/a/span"));
		manage.click();
		WebElement manageProjects = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[3]/a"));
		manageProjects.click();
		WebElement projectLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/a"));
		projectLink.click();
		WebElement subprojSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/fieldset/select"));
		new Select(subprojSelect).selectByVisibleText("testSubProject1");
		WebElement addSubproject = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/fieldset/input[3]"));
		addSubproject.click();
		Thread.sleep(2000);
		WebElement subproj1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/form/div/div[2]/div/fieldset/div/table/tbody/tr[1]/td[1]/a"));

		assertTrue(subproj1.getText().contains("testSubProject1"));

		WebElement secondSubprojSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/fieldset/select"));
		new Select(secondSubprojSelect).selectByVisibleText("testSubProject2");
		WebElement secondAddSubproject = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/fieldset/input[3]"));
		secondAddSubproject.click();
		Thread.sleep(2000);
		WebElement subproj2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/form/div/div[2]/div/fieldset/div/table/tbody/tr[2]/td[1]/a"));

		assertTrue(subproj2.getText().contains("testSubProject2"));
	}

}