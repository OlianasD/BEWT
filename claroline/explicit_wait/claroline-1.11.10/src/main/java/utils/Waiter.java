package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
	
	protected WebDriverWait wait;
	
	public Waiter(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
	}
	
	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitClickability(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForTextToBe(By locator, String text) {
		wait.until(ExpectedConditions.textToBe(locator, text));
	}
}
