import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Image_Upload extends SetUp {
    @Test
    public void uploadImage() {
        driver.get("https://demoqa.com/upload-download");
        WebElement uploadElement = driver.findElement(By.cssSelector("#uploadFile"));
        uploadElement.sendKeys("D:\\Automaton_Project\\Selinium Junit\\src\\test\\resources\\cat.jpg");

        String text = driver.findElement(By.id("uploadedFilePath")).getText();
        Assert.assertTrue(text.contains("C:\\fakepath\\cat.jpg"));
    }
}
