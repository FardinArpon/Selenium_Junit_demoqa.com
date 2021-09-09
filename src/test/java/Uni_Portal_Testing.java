import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Uni_Portal_Testing {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup_GeckoDriver() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed");
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

//    @Before
//    public void setup_ChromeDriver(){
//        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
//        ChromeOptions ops = new ChromeOptions();
//        ops.addArguments("--headed");
//        driver=new ChromeDriver(ops);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

    @Test
    public void PortalTesting() throws InterruptedException {
        driver.get("http://173.254.242.107:81/index.php?logout=1");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) > input.class1"))).sendKeys("191002065");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input.class1"))).sendKeys("bAAAl");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) center:nth-child(3) > input.class1:nth-child(1)"))).sendKeys(Keys.ENTER);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preregistration')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Schedule')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Billing')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Result')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Teacher Evaluation')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]"))).sendKeys(Keys.ENTER);
    }


    @Test
    public void PortalTesting_Multipal() throws InterruptedException {
        driver.get("http://173.254.242.107:81/index.php?logout=1");
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) > input.class1"))).sendKeys("191002065");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input.class1"))).sendKeys("bAAAl");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) center:nth-child(3) > input.class1:nth-child(1)"))).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preregistration')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Schedule')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Billing')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Result')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Teacher Evaluation')]"))).sendKeys(Keys.ENTER);
        sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]"))).sendKeys(Keys.ENTER);



        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) > input.class1"))).sendKeys("191002065");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input.class1"))).sendKeys("bAAAl");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) center:nth-child(3) > input.class1:nth-child(1)"))).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preregistration')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Schedule')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Billing')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Result')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Teacher Evaluation')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]"))).sendKeys(Keys.ENTER);




        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) > input.class1"))).sendKeys("201002145");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input.class1"))).sendKeys("ssuumm");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) center:nth-child(3) > input.class1:nth-child(1)"))).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preregistration')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Schedule')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Billing')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Result')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Teacher Evaluation')]"))).sendKeys(Keys.ENTER);
            sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]"))).sendKeys(Keys.ENTER);
    }




    @After
    public void finishTest() {
        driver.close();
    }
}



