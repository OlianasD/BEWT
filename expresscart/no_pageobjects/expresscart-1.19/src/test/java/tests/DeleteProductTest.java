package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;



public class DeleteProductTest extends BaseTest {

	@Test
	public void testExpressCartDeleteProductNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[1]")).click();
		
		assertFalse(driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/a")).getText().contains("NewProduct000"));
	}


}
