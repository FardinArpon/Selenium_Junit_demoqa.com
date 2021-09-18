import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class WebTables extends SetUp{
    @Test
    public void Edit_WebTables() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[1]")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Fardin Arpon");
        driver.findElement(By.id("submit")).click();

    }

    @Test
    public void Delete_Web_Tables() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(3) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(2) div.rt-tr.-even div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) > svg:nth-child(1)")).click();
        Boolean status = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]")).isDisplayed();
        Assert.assertEquals(status, true);
    }
}
