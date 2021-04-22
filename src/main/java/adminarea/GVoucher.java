package adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

public class GVoucher {



    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/admin/");
    }

    public static void loginAdmin(String admin29, String s) {
        Browser . driver.findElement(By.id("input-username")).sendKeys("admin29");
        Browser.driver.findElement(By.name("password")).sendKeys("parola123!");
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();

    }

    public static void vouchercheck(String expectedVoucher, String messageIfFailure) {
        Browser.driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapse4\"]/li[4]/a"))).click();
        Browser.driver.findElement(By.xpath("//*[@id=\"collapse4-3\"]/li[1]/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
        String actualVoucher = Browser.driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(actualVoucher, expectedVoucher , messageIfFailure);
        System.out.println(Browser.driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[2]")).getText());
    }


    public static void voucherRemoveAndCreateNew(String peeva, String s, String s1, String valio, String s2, String s3) {
        WebDriverWait wait = new WebDriverWait(Browser.driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapse4\"]/li[4]/a")));
    }
}
