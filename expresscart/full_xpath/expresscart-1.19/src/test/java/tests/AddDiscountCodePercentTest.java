package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddDiscountCodePercentTest extends BaseTest {
	
	@Test
	public void testExpressCartAddDiscountCodePercent() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement discountCodesLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[4]/a"));
		discountCodesLink.click();
		WebElement addDiscCode = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/h2/div/a"));
		addDiscCode.click();
		WebElement code = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[2]/div/input"));
		code.sendKeys("discperc000");
		WebElement discTypeSelect = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[3]/div/select"));
		new Select(discTypeSelect).selectByVisibleText("Percent");
		WebElement value = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[4]/div/input"));
		value.sendKeys("50");
		WebElement start = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[5]/div/div/input"));
		start.sendKeys("12/02/2023 00:00");
		WebElement firstDatePickClose = driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]"));
		firstDatePickClose.click();
		WebElement end = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[6]/div/div/input"));
		end.sendKeys("12/02/2030 00:00");
		WebElement secondDatePickCLose = driver.findElement(By.xpath("/html/body/div[11]/div/div[3]/button[1]"));
		secondDatePickCLose.click();
		WebElement addDiscountBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/div/button"));
		addDiscountBtn.click();
		WebElement secondDiscountCodesLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[4]/a"));
		secondDiscountCodesLink.click();
		Thread.sleep(1000);
		WebElement displayedDiscountCode = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/ul/li[6]/div/div[1]/span"));
		
		assertEquals("Code:  discperc000", displayedDiscountCode.getText());
	}


}
