package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class AddEmptyUserFailsTest extends BaseTest {

	@Test
	public void addEmptyUserFails() {

		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.xpath("//*[@id=\"manage-user-div\"]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"manage-user-create-form\"]/div/div[3]/input")).click();

		assertEquals(Strings.errorInvalidUser, driver
				.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
	}

}