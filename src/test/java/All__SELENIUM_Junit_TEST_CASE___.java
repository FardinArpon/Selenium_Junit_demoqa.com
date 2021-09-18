import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class All__SELENIUM_Junit_TEST_CASE___ {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed");
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    //----------``Start Test Case``----------//
    //---------------------------GET_TITLE---------------------------------//

    @Test
    public void getTitle() {
        driver.get("https://demoqa.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("ToolsQA"));
    }


    //----------------------Check If Elements Exists------------------------//

    @Test
    public void checkIfElementExists() throws InterruptedException {
        driver.get("https://demoqa.com");
        Boolean status = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertEquals(status, true);
    }


    //--------------------------Write on Text-box---------------------------//

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


    //------------------Click on button from multiple elements-----------------//

    @Test
    public void clickOnButon() {
        driver.get("https://demoqa.com/buttons");
        Actions action = new Actions(driver);
        List<WebElement> list = driver.findElements(By.cssSelector("button"));
        action.doubleClick(list.get(1)).perform();
        String text = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertTrue(text.contains("You have done a double click"));

        action.contextClick(list.get(2)).perform();
        String text2 = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertTrue(text2.contains("You have done a right click"));

        list.get(3).click();
        String text3 = driver.findElement(By.id("dynamicClickMessage")).getText();
        Assert.assertTrue(text3.contains("You have done a dynamic click"));
    }


    //--------------------Select Dropdown-----------------------//

    @Test
    public void selectDropdown() {
        driver.get("https://demoqa.com/select-menu");
        Select color = new Select(driver.findElement(By.id("oldSelectMenu")));
        color.selectByValue("3");
    }


    //---------------------Select Date--------------------------//

    @Test
    public void selectDate() {
        driver.get("https://demoqa.com/date-picker");
        driver.findElement(By.id("datePickerMonthYearInput")).clear();
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("05/08/1993");
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.ENTER);
    }


    //------------------------Handle Alerts---------------------------//

    @Test
    public void handleAlerts() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id(("alertButton"))).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id(("promtButton"))).click();
        driver.switchTo().alert().sendKeys("Fahim");
        sleep(2000);
        driver.switchTo().alert().accept();
        String text = driver.findElement(By.id("promptResult")).getText();
        Assert.assertTrue(text.contains("Fahim"));
    }


    //-------------------------Handle Tabs---------------------------//

    @Test
    public void handleTabs() throws InterruptedException {
        driver.get("https://demoqa.com/links");
        driver.findElement(By.id("simpleLink")).click();
        sleep(2000);
        ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
        //switch to open tab
        driver.switchTo().window(w.get(1));
        System.out.println("New tab title: " + driver.getTitle());
        // for(String childTab:driver.getWindowHandles()){
        // driver.switchTo().window(childTab);
        // }
        // System.out.printf(driver.getTitle());
        Boolean status =
                driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertEquals(true, status);
        driver.close();
        driver.switchTo().window(w.get(0));
    }



    //--------------------------image  Upload---------------------------//

    @Test
    public void uploadImage() {
        driver.get("https://demoqa.com/upload-download");
        WebElement uploadElement = driver.findElement(By.cssSelector("#uploadFile"));
        uploadElement.sendKeys("D:\\Automaton_Project\\Selinium Junit\\src\\test\\resources\\cat.jpg");

        String text = driver.findElement(By.id("uploadedFilePath")).getText();
        Assert.assertTrue(text.contains("C:\\fakepath\\cat.jpg"));
    }


    //-----------------Web-Table Testing-------------------//

    @Test
    public void WebTablesEdit() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[1]")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Fardin Arpon");
        driver.findElement(By.id("submit")).click();
    }

    @Test
    public void DeleteWebTables() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(3) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(2) div.rt-tr.-even div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) > svg:nth-child(1)")).click();
        Boolean status = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]")).isDisplayed();
        Assert.assertEquals(status, true);
    }


    //--------------------------Image Search google---------------------------//

    @Test
    public void imageSearchByURL() {
        driver.get("https://www.google.com.bd/imghp?hl=en&tab=ri&ogbl");
        driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/div[@id='qbc']/form[@id='tsf']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]")).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Ycyxxc']"))).sendKeys("https://i.ytimg.com/vi/1Ne1hqOXKKI/maxresdefault.jpg");
        driver.findElement(By.xpath("//input[@id='RZJ9Ub']")).sendKeys(Keys.ENTER);

    }

    @Test
    public void searchImageByUpload() {
        driver.get("https://www.google.com/ncr");
        driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
        driver.findElement(By.xpath("//div[@class='ZaFQO']")).click();
        //driver.findElement(By.xpath("//input[@id='Ycyxxc']")).sendKeys("image_url_here"); //if search by image link
        driver.findElement(By.xpath("//a[contains(text(),'Upload an image')]")).click();

        File file = new File("./src/test/resources/cat.jpg");
        driver.findElement(By.name("encoded_image")).sendKeys(file.getAbsolutePath());
        Boolean status = driver.findElement(By.xpath("//img[@class='GMzDwb']")).isDisplayed();
        Assert.assertEquals(status, true);
    }


    //--------------------------Handle Iframe Test---------------------------//

    @Test
    public void handleIframe() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame2");
        String text = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertTrue(text.contains("This is a sample page"));
        driver.switchTo().defaultContent();
    }


    //--------------------------Scrap Data Test---------------------------//

    @Test
    public void scrapData() {
        driver.get("https://demoqa.com/webtables");
        WebElement table = driver.findElement(By.className("rt-tbody"));
        List<WebElement> allRows = table.findElements(By.className("rt-tr"));
        int i = 0;
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.className("rt-td"));
            for (WebElement cell : cells) {
                i++;
                System.out.println("num[" + i + "] " + cell.getText());
            }
        }
    }


    //--------------------------Mouse Hover Testing---------------------------//

    @Test
    public void mouseHover() throws InterruptedException {
        driver.get("https://green.edu.bd/");

        WebElement mainMenu = driver.findElement(By.xpath("//a[@class='dropdown-\n" +
                "toggle'][contains(text(),'About Us')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        Thread.sleep(3000);

        WebElement subMenu = driver.findElement(By.xpath("//li[@id='menu-item-\n" +
                "325']//a[contains(text(),'History')]"));

        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }


    //--------------------------Screen Shot Capture ---------------------------//

    @Test
    public void takeScreenShot() throws IOException {
        driver.get("https://demoqa.com");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
        String fileWithPath = "./src/test/resources/screenshots/" + time + ".png";
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(screenshotFile, DestFile);
    }


    //--------------------------Keyboard Events---------------------------//

    @Test
    public void keyboardEvents() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchElement = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        action.moveToElement(searchElement);
        action.keyDown(Keys.SHIFT);
        action.sendKeys("Selenium Webdriver")
                .keyUp(Keys.SHIFT)
                .doubleClick()
                .contextClick()
                .perform();
        Thread.sleep(5000);
    }


    //-----------------Read Data From Excel sheet Testing-------------------//

    @Test
    public void readExcelFile() throws IOException {
        String filePath = ".\\src\\test\\resources";
        Utils.readFromExcel(filePath, "Symlefile.xls", "Sheet1");
    }




    //-----------------ModalDialog Testing-------------------//

    @Test
    public void ModalDialog() {

        driver.get("https://demoqa.com/modal-dialogs");
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#showSmallModal")));
        driver.findElement(By.cssSelector("#showSmallModal")).click();
        Boolean status = driver.findElement(By.xpath("//button[@id='closeSmallModal']")).isDisplayed();
        Assert.assertEquals(status, true);

    }



    @After
    public void finishTest() {
        driver.close();
    }

}
