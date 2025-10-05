package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        element.click();
        Thread.sleep(1000);

        WebElement links = driver.findElement(By.xpath("//*[@id=\"item-5\"]"));
        links.click();
        Thread.sleep(1000);

        WebElement home = driver.findElement(By.xpath("//*[@id=\"simpleLink\"]"));
        home.click();
        Thread.sleep(1000);

        WebElement HomePH4P4 = driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]"));
        HomePH4P4.click();
        Thread.sleep(2000);
        //tuong tu...
    }
}
