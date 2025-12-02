package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class DeleteCategoryTest extends BaseTest {
	
	@Test
	public void deleteCategory() throws InterruptedException {
		String category = "Category002";

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
		WebElement deleteCategory = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/div/div[2]/form/button"));
		deleteCategory.click();
		Thread.sleep(1000);
		WebElement confirmDelete = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/input[5]"));
		confirmDelete.click();
		Thread.sleep(2000);
		WebElement categoriesArea = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/div[2]"));
		
		assertFalse(categoriesArea.getText().contains(category));
	}
	
	
}