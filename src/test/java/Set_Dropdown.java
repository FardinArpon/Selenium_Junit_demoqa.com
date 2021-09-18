import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Set_Dropdown extends SetUp{

        @Test
        public void selectDropdown() {
            driver.get("https://demoqa.com/select-menu");
            Select color = new Select(driver.findElement(By.id("oldSelectMenu")));
            color.selectByValue("3");
        }
    }

