//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class Selinum_Junit {
//    WebDriver driver;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
//        FirefoxOptions ops = new FirefoxOptions();
//        ops.addArguments("--headed");
//        driver = new FirefoxDriver(ops);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void getTitle() {
//        driver.get("https://demoqa.com");
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertTrue(title.contains("ToolsQA"));
//    }
//
//
//    @Test
//    public void checkifElementExists() throws InterruptedException {
//        driver.get("https://demoqa.com");
//        Boolean status = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
//        Assert.assertEquals(status, true);
//    }
//
//
////    @Test
////    public void writeOnTextBox() {
////        driver.get("https://demoqa.com/elements");
////        driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
////        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id=userName]"))).sendkeys
//////        driver.findElement(By.cssSelector("[id=userName]")).sendKeys("Rahim");
////        driver.findElement(By.xpath("//button[@id='submit']")).sendKeys("Rahim");
////        String text = driver.findElement(By.cssSelector("[id=name]")).getText();
////        Assert.assertTrue(text.contains("Rahim"));
////    }
//
//
//    @Test
//    public void clickOnButon() {
//        driver.get("https://demoqa.com/buttons");
//        Actions action = new Actions(driver);
//        List<WebElement> list = driver.findElements(By.cssSelector("button"));
//        action.doubleClick(list.get(1)).perform();
//        String text = driver.findElement(By.id("doubleClickMessage")).getText();
//        Assert.assertTrue(text.contains("You have done a double click"));
//        action.contextClick(list.get(2)).perform();
//        String text2 = driver.findElement(By.id("rightClickMessage")).getText();
//        Assert.assertTrue(text2.contains("You have done a right click"));
//        list.get(3).click();
//        String text3 = driver.findElement(By.id("dynamicClickMessage")).getText();
//        Assert.assertTrue(text3.contains("You have done a dynamic click"));
//    }
//
//
////    @Test
////    public void selectDropdown(){
////        driver.get("https://demoqa.com/select-menu");
////        Select color=new Select(driver.findElement(By.id("oldSelectMenu")));
////        color.selectByValue("1");
////        Select cars=new Select(driver.findElement(By.id("cars")));
////        if (cars.isMultiple()) {
////            cars.selectByValue("volvo");
////            cars.selectByValue("audi");
////        }
////    }
//
//
//    @Test
//    public void selectDate() {
//        driver.get("https://demoqa.com/date-picker");
//        driver.findElement(By.id("datePickerMonthYearInput")).clear();
//        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("05/08/1993");
//        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.ENTER);
//    }
//
//
//    @Test
//    public void handleAlerts() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id(("alertButton"))).click();
//        driver.switchTo().alert().accept();
//        driver.findElement(By.id(("promtButton"))).click();
//        driver.switchTo().alert().sendKeys("Fahim");
//        int sleep = (2000);
//        driver.switchTo().alert().accept();
//        String text = driver.findElement(By.id("promptResult")).getText();
//        Assert.assertTrue(text.contains("Fahim"));
//    }
//
//
//    @After
//    public void finishTest() {
//        driver.close();
//    }
//}
