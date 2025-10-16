package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class StopOnboarding extends BaseTest {

    @Test
    public void stopOnboarding() {
        driver.findElement(By.name("email")).sendKeys(adminMail);
        driver.findElement(By.name("passwd")).sendKeys(adminPsw);
        driver.findElement(By.name("submitLogin")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.linkText("Skip this tutorial")).click();
        driver.findElement(By.linkText("Stop the OnBoarding")).click();
    }
}
