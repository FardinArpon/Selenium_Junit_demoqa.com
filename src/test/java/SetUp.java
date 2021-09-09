//public class SetUp {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//        FirefoxOptions ops = new FirefoxOptions();
//        //ops.addArguments("--headed");
//        ops.addArguments("--headed");//for not opening browser
//        driver = new FirefoxDriver(ops);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//    @Test
//    public void handleIframe() {
//        driver.get("https://d...content-available-to-author-only...a.com/frames");
//        driver.switchTo().frame("frame2");
//        String text = driver.findElement(By.id("sampleHeading")).getText();
//        Assert.assertTrue(text.contains("This is a sample page"));
//        driver.switchTo().defaultContent();
//    }
//
//    @After
//    public void finishTest() {
//
//        driver.close();
//    }
//}
