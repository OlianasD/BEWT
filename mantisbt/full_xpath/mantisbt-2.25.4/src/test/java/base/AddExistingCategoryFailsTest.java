package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import utils.Strings;

public class AddExistingCategoryFailsTest extends BaseTest {

	@Test
	public void addExistingCategoryFails() throws InterruptedException {
		String categoryName = "Category001";

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
		WebElement categoryField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[4]/form/fieldset/input[3]"));
		categoryField.clear();
		categoryField.sendKeys(categoryName);
		WebElement addCategoryBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[4]/form/fieldset/input[4]"));
		addCategoryBtn.click();
		Thread.sleep(500);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/p[2]"));

		assertEquals(Strings.existingCategoryError, errorMsg.getText());
	}
	
}