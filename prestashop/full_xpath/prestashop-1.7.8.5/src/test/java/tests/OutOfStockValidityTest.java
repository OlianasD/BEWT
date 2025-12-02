package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OutOfStockValidityTest extends BaseTest {

	@Test
	public void test_outofstockNoPO() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement orders = driver.findElement(By.xpath("/html/body/nav/div/ul/li[3]/a"));
		orders.click();
		WebElement ordersSublink = driver.findElement(By.xpath("/html/body/nav/div/ul/li[3]/ul/li[1]/a"));
		ordersSublink.click();
		WebElement addOrder = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addOrder.click();
		WebElement searchCustomer = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/input"));
		searchCustomer.sendKeys("John");
		WebElement chooseCustomer = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div[4]/div/div/div/div/div[3]/button[1]"));
		chooseCustomer.click();
		WebElement productSearch = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[2]/input"));
		productSearch.sendKeys("Blue");
		WebElement quantity = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[5]/div/div[1]/form/div[4]/div[2]/input"));
		quantity.clear();
		quantity.sendKeys("4");
		WebElement addToCart = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[5]/div/div[1]/form/div[5]/div/button"));
		addToCart.click();
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div"));
		assertTrue(errorMsg.getText().contains("There are not enough products in stock."));

	}
}
