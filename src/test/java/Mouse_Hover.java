import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover extends SetUp {

    @Test
    public void mouseHover() throws InterruptedException {
        driver.get("https://green.edu.bd/");

        WebElement mainMenu = driver.findElement(By.xpath("//header/nav[@id='primary-navbar']/div[1]/ul[1]/li[1]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        Thread.sleep(3000);

        WebElement subMenu = driver.findElement(By.xpath("//header/nav[@id='primary-navbar']/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));

        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

}
