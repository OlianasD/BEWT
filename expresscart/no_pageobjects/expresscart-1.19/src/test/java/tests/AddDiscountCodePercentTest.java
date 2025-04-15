package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class AddDiscountCodePercentTest extends BaseTest {
	
	@Test
	public void testExpressCartAddDiscountCodePercent() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div/h2/div/a")).click();
		driver.findElement(By.id("discountCode")).sendKeys("discperc000");
		new Select(driver.findElement(By.id("discountType"))).selectByVisibleText("Percent");
		driver.findElement(By.id("discountValue")).sendKeys("50");
		driver.findElement(By.id("discountStart")).sendKeys("12/02/2023 00:00");
		driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();
		driver.findElement(By.id("discountEnd")).sendKeys("12/02/2030 00:00");
		driver.findElement(By.xpath("/html/body/div[11]/div/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"discountNewForm\"]/div[1]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[4]/a")).click();
		
		assertEquals("Code:  discperc000", driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div/ul/li[6]/div/div[1]/span")).getText());
	}


}
