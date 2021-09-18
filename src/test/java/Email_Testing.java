import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Email_Testing extends SetUp {
    @Test
    public void EmailTesting() {
        driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&hl=en-GB&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#identifierId"))).sendKeys("aminrahman1961@gmail.com");
        driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']//button[@type='button']")).sendKeys(Keys.ENTER);
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//input[@type='password']"))).sendKeys("fardinaminarpon@gmail.com");
        //String text = driver.findElement(By.id("uploadedFilePath")).getText();
        //Assert.assertTrue(text.contains("Couldn't sign you in"));
    }

    @Test
    public void SigninGmail_language_convertedToEnglish(){
        driver.get("https://www.gmail.com");
        wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//div[@class='ry3kXd Ulgu9']")).click();
        driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed']//div[@class='MocG8c B9IrJb LMgvRb']//span[@class='vRMGwf oJeWuf'][contains(text(),'English (United States)')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.xpath("//div[@class='ry3kXd Ulgu9']")).click();
        driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed']//div[@class='MocG8c B9IrJb LMgvRb']//span[@class='vRMGwf oJeWuf'][contains(text(),'English (United States)')]")).click();
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("fardinaminarpon@gmail.com");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys(Keys.ENTER);
//      driver.findElement(By.cssSelector("")).sendKeys(""); //send password in here
        String text = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d')]")).getText();
        Assert.assertTrue(text.contains("Next"));
    }
}
