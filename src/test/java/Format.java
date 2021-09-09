//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class Format {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
//        FirefoxOptions ops = new FirefoxOptions();
//        ops.addArguments("--headed");
//        driver = new FirefoxDriver(ops);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }
//
//    Add to build.gradle
//    //implementation group: 'org.apache.poi', name: 'poi', version: '5.0.0'
//    public static void readFromExcel(String filePath,String fileName,String sheetName) throws
//            IOException {
//        File file = new File(filePath+"\\"+fileName);
//        FileInputStream inputStream = new FileInputStream(file);
//        Workbook workbook = null;
//        String fileExtensionName = fileName.substring(fileName.indexOf("."));
//        if(fileExtensionName.equals(".xls")){
//            workbook = new HSSFWorkbook(inputStream);
//        }
//        Sheet sheet = workbook.getSheet(sheetName);
//        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//        for (int i = 0; i < rowCount+1; i++) {
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//                System.out.print((row.getCell(j).getStringCellValue()) +"|| ");
//            }
//            System.out.println();
//        }
//    }
//    @Test
//    public void readExcelFile() throws IOException, InvalidFormatException {
//        String filePath = ".\\src\\test\\resources";
//        Utils.readFromExcel(filePath,"ExportExcel.xls","Sheet1");
//    }y.xpath("//input[@id='RZJ9Ub']")).sendKeys(Keys.ENTER);
//
//        @After
//        public void finishTest () {
//            driver.close();
//        }
//
//    }
