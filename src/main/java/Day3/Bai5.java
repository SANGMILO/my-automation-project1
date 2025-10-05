package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        element.click();
        Thread.sleep(1000);

        WebElement radiobuttons = driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
        radiobuttons.click();
        Thread.sleep(1000);

        WebElement yes = driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
        yes.click();
        Thread.sleep(1000);

        driver.close();
    }
}
