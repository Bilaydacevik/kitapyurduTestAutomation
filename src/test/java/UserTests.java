import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests {
    @Test
    public void loginSuccessful() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/index.php?route=account/login");
        driver.findElement(By.id("login-email")).sendKeys("jamewe1526@egvoo.com");
        driver.findElement(By.id("login-password")).sendKeys("Test12345678");
        driver.findElement(By.className("ky-checkbox-input")).click();
        driver.findElement(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")).click();
        Thread.sleep(5000);

        String text = driver.findElements(By.cssSelector(".common-sprite")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Merhaba Test Test2");


    }
    @Test
    public void loginUnSuccessful() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/index.php?route=account/login");
        driver.findElement(By.id("login-email")).sendKeys("jamewe1526@egvoo.com");
        driver.findElement(By.id("login-password")).sendKeys("Test1234565");
        driver.findElement(By.className("ky-checkbox-input")).click();
        driver.findElement(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("ky-error")).getText());


    }
}
