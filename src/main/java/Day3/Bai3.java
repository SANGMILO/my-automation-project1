package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement Alerts_Frame = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        Alerts_Frame.click();
        Thread.sleep(1000);
        //alert thuong
        WebElement alerts = driver.findElement(By.xpath("(//*[@id=\"item-1\"])[2]"));
        js.executeScript("arguments[0].click();", alerts);
        Thread.sleep(2000);


        WebElement button = driver.findElement(By.xpath("(//*[@id=\"alertButton\"]"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
        //alert sau 5s
        WebElement timerAlertButton = driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]"));
        js.executeScript("arguments[0].click();", timerAlertButton);
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert sau 5s: " + alert2.getText());
        alert2.accept();

        //frame
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
        js.executeScript("arguments[0].click();", frame);
        driver.switchTo().frame("frame1");
        String frame_text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Frame text: " + frame_text);
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
    }
}
