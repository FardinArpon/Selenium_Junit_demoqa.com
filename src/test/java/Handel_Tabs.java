import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Handel_Tabs extends SetUp{

        @Test
        public void handleTabs() throws InterruptedException {
            driver.get("https://demoqa.com/links");
            driver.findElement(By.id("simpleLink")).click();
            sleep(2000);
            ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
            //switch to open tab
            driver.switchTo().window(w.get(1 ));
            System.out.println("New tab title: " + driver.getTitle());
// for(String childTab:driver.getWindowHandles()){
// driver.switchTo().window(childTab);
// }
// System.out.printf(driver.getTitle());
            Boolean status =
                    driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
            Assert.assertEquals(true,status);
            driver.close();
            driver.switchTo().window(w.get(0));
        }

    }

