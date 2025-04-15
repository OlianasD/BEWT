package po;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class ManageFieldGroupsPage extends SiteAdminPageObject {
	
	@FindBy(xpath = "//*[@id=\"toolbar-new\"]/button")
	protected WebElement createGroupBtn;
	
	@FindBy(xpath = "//*[@id=\"toolbar-status-group\"]/button")
	protected WebElement actionsBtn;
	
	protected Wait wait;
	
	public ManageFieldGroupsPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public CreateFieldGroupPage createGroup() {
		createGroupBtn.click();
		return new CreateFieldGroupPage(driver);
	}
	
	public boolean isGroupPresent(String group) {
		try {
			wait.waitForTextToBeContained(By.id("fieldgroupList"), group);
			return driver.findElement(By.id("fieldgroupList")).getText().contains(group);
		} catch(NoSuchElementException e) {
			wait.waitForTextToBeContained(By.xpath("//*[@id=\"j-main-container\"]/div[2]"), "No Matching Results");
			if(driver.findElement(By.xpath("//*[@id=\"j-main-container\"]/div[2]")).getText().contains("No Matching Results")) {
				return false;
			}
			else {
				throw e;
			}
			
		}
		
	}
	
	public boolean isGroupPresentAtFirstRow(String group) {
		try {
			wait.waitStalenessRefreshed(driver.findElement(By.xpath("//*[@id=\"fieldgroupList\"]/tbody/tr[1]/th/div/a")));
			return driver.findElement(By.xpath("//*[@id=\"fieldgroupList\"]/tbody/tr[1]/th/div/a")).getText().contains(group);
		} catch(NoSuchElementException e) {
			if(driver.findElement(By.xpath("//*[@id=\"j-main-container\"]/div[2]")).getText().contains("No Matching Results")) {
				return false;
			}
			else {
				throw e;
			}
			
		}
		
	}
	
	public ManageFieldGroupsPage selectIthFieldGroup(int i) {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr["+i+"]/td[1]/input")).click();
		return this;
	}
	
	public ManageFieldGroupsPage deleteSelectedGroup() {
		actionsBtn.click();
		driver.findElement(By.xpath("//*[@id=\"status-group-children-trash\"]/button")).click();
		return new ManageFieldGroupsPage(driver);
	}
	

}
