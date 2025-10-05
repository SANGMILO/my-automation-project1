package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        element.click();
        Thread.sleep(1000);

        WebElement buttons = driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
        buttons.click();
        Thread.sleep(1000);

        WebElement dbclickme = driver.findElement(By.cssSelector("#doubleClickBtn"));
        dbclickme.click();
        Thread.sleep(1000);

        WebElement rightclickme = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
        rightclickme.click();
        Thread.sleep(2000);

        WebElement clickme = driver.findElement(By.xpath("//*[@id=\"6l5FY\"]"));
        clickme.click();
        Thread.sleep(3000);
        driver.close();
    }
}
