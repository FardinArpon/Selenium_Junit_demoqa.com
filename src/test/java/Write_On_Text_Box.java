import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Write_On_Text_Box extends SetUp {
    @Test
    public void writeOnTextBox() {
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("userName"))).sendKeys("Rahim");
//        driver.findElement(By.cssSelector("[id=userName]")).sendKeys("Rahim");
        driver.findElement(By.cssSelector("#submit")).sendKeys(Keys.ENTER);
        String text = driver.findElement(By.cssSelector("[id=name]")).getText();
        Assert.assertTrue(text.contains("Rahim"));
    }

}

