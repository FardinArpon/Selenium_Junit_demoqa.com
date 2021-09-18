import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Handel_IFrame extends SetUp {
    @Test
    public void handleIframe() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame2");
        String text = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertTrue(text.contains("This is a sample page"));
        driver.switchTo().defaultContent();
    }
}
