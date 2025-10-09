package base;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DeleteCategory extends BaseTest {

    @Test
    public void deleteCategory() throws Exception {
        String category = "Test Category 001";
        String expectedAlert = "Category trashed.";

        driver.findElement(By.linkText("Author Login")).click();
        driver.findElement(By.id("username")).sendKeys("administrator");
        driver.findElement(By.id("password")).sendKeys(rootPassword);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.linkText("Site Administrator")).click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver = driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.id("mod-login-username")).clear();
        driver.findElement(By.id("mod-login-username")).sendKeys("administrator");
        driver.findElement(By.id("mod-login-password")).clear();
        driver.findElement(By.id("mod-login-password")).sendKeys(rootPassword);
        driver.findElement(By.id("btn-login-submit")).click();
        driver.findElement(By.linkText("Article Categories")).click();
        driver.findElement(By.id("cb2")).click();
        driver.findElement(By.xpath("//*[@id=\"toolbar-status-group\"]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"status-group-children-trash\"]/button")).click();
        Thread.sleep(1000);

        assertEquals(expectedAlert, driver.findElement(By.className("alert-message")).getText());
        assertFalse(driver.findElement(By.id("categoryList")).getText().contains(category));

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
        driver.findElement(By.linkText("Log out")).click();
        tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.close();
        driver = driver.switchTo().window(tabs2.get(0));
        driver.findElement(By.linkText("Log out")).click();
        driver.findElement(By.className("btn-primary")).click();
    }
}
