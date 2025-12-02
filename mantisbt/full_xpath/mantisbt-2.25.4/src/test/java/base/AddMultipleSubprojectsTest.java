package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddMultipleSubprojectsTest extends BaseTest {
	
	@Test
	public void addMultipleSubprojects() throws InterruptedException {
		String projectName = "Project001";
		String status = "release";
		String description = "Description";

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
		WebElement manage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span"));
		manage.click();
		WebElement manageProjects = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[3]/a"));
		manageProjects.click();
		WebElement createProjectBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/form/button"));
		createProjectBtn.click();
		WebElement nameField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		nameField.clear();
		nameField.sendKeys(projectName);
		WebElement statusSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/form/div/div[2]/div/div/table/tbody/tr[2]/td[2]/select"));
		new Select(statusSelect).selectByVisibleText(status);
		WebElement descrField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/form/div/div[2]/div/div/table/tbody/tr[5]/td[2]/textarea"));
		descrField.clear();
		descrField.sendKeys(description);
		Thread.sleep(1000);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/form/div/div[3]/input"));
		saveBtn.click();
		WebElement secondManage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[7]/a/span"));
		secondManage.click();
		WebElement secondManageProjects = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[3]/a"));
		secondManageProjects.click();
		WebElement projectLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/a"));
		projectLink.click();
		WebElement createSubproj = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/form/button"));
		createSubproj.click();
		Thread.sleep(1000);
		WebElement subprojName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		subprojName.sendKeys("testSubProject1");
		WebElement saveSubproj = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		saveSubproj.click();
		Thread.sleep(2000);
		WebElement subproj1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/a"));

		assertTrue(subproj1.getText().contains("testSubProject1"));

		WebElement secondProjectLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/a"));
		secondProjectLink.click();
		WebElement secondCreateSubproj = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/form/button"));
		secondCreateSubproj.click();
		Thread.sleep(1000);
		WebElement secondSubprojName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		secondSubprojName.sendKeys("testSubProject2");
		WebElement secondSaveSubproj = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		secondSaveSubproj.click();
		Thread.sleep(2000);
		WebElement subproj2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/a"));
		assertTrue(subproj2.getText().contains("testSubProject2"));
		
	}
	
}