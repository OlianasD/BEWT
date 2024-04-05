package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.XpathGenerator;


public class DeleteDiscountCodePercentTest extends BaseTest {
	
	@Test
	public void testExpressCartAddDiscountCodePercent() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[4]/a")).click();
		XpathGenerator xpgen = new XpathGenerator();
		WebElement codeElem = driver.findElement(By.xpath("//*[contains(text(), 'discperc000')]"));
		String codeXpath = xpgen.generateXpath(codeElem, "");
		codeXpath = codeXpath.replace("div[1]/span[1]", "div[4]/button");
		driver.findElement(By.xpath(codeXpath)).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[4]/a")).click();
		
		assertFalse(driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div/ul")).getText().contains("Code:  discperc000"));
	}



}
