package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class UnlinkMultipleSubprojectsTest extends BaseTest {

	@Test
	public void unlinkMultipleSubprojects() throws InterruptedException {
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
		WebElement unlinkFirstProject = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/form/div/div[2]/div/fieldset/div/table/tbody/tr[1]/td[7]/div/a[2]"));
		unlinkFirstProject.click();
		Thread.sleep(3000);
		WebElement subprojArea = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/form/div/div[2]"));

		assertFalse(subprojArea.getText().contains("testSubProject1"));

		WebElement unlinkSecondProject = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/form/div/div[2]/div/fieldset/div/table/tbody/tr/td[7]/div/a[2]"));
		unlinkSecondProject.click();
		Thread.sleep(3000);
		WebElement secondSubprojArea = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]"));
		assertFalse(secondSubprojArea.getText().contains("Unlink"));
		
	}
	
}