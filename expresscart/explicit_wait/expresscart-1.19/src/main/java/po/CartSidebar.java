package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

public class CartSidebar extends PageObject {
	
	@FindBy(xpath = "//*[@id=\"cart\"]/div[1]/div/button")
	protected WebElement closeCartBtn;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/div[2]/div/a")
	protected WebElement checkoutBtn;
	
	protected Waiter wait;
	
	public CartSidebar(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public String getIthItem(int i, String productName) {
		By locator = By.xpath("//*[@id=\"cart\"]/div[1]/div/div[1]/div["+i+"]/div/div/div[2]/div/div[1]/h6/a");
		wait.waitForTextToBe(locator, productName);
		return driver.findElement(locator).getText();
	}
	
	public Home close() {
		closeCartBtn.click();
		return new Home(driver);
	}
	
	public CheckoutPage checkout() {
		wait.waitClickability(checkoutBtn);
		checkoutBtn.click();
		return new CheckoutPage(driver);
	}

}
