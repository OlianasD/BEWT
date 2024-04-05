package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class ShippingPage extends MainNavBar {
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[1]/a[2]")
	protected WebElement goToPaymentBtn;
	
	protected Waiter wait;

	public ShippingPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public PaymentPage goToPayment() {
		wait.waitClickability(goToPaymentBtn);
		goToPaymentBtn.click();
		return new PaymentPage(driver);
	}

}
