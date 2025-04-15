package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	protected WebDriverWait wait;
	
	public Wait(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
	}
	
	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitVisibility(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitClickability(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitClickability(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void waitForTextToBe(By locator, String text) {
		wait.until(ExpectedConditions.textToBe(locator, text));
	}
	
	public boolean waitForTextToDisappear(By locator, String text) {
		return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
	}
	
	public void waitVisibilityRefreshed(WebElement element) {
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}
	
}
