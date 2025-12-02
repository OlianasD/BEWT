package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddProjectTest extends BaseTest {
	
	@Test
	public void addProjectTest() throws InterruptedException {
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
		WebElement displayedProjName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/a"));
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[2]"));
		WebElement displayedVisibility = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[4]"));
		WebElement displayedDescr = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]"));
		
		assertEquals(projectName, displayedProjName.getText());
		assertEquals(status, displayedStatus.getText());
		assertEquals(Strings.visibilityPublic, displayedVisibility.getText());
		assertEquals(description, displayedDescr.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}