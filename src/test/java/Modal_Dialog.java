import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Modal_Dialog extends SetUp{
    @Test
    public void ModalDialog() {

        driver.get("https://demoqa.com/modal-dialogs");
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#showSmallModal")));
        driver.findElement(By.cssSelector("#showSmallModal")).click();
        Boolean status = driver.findElement(By.xpath("//button[@id='closeSmallModal']")).isDisplayed();
        Assert.assertEquals(status, true);

    }
}
