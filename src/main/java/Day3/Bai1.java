package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]"));
        element.click();
        Thread.sleep(1000);

        WebElement textbox = driver.findElement(By.xpath("//*[@id='item-0']"));
        textbox.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#userName")).sendKeys("Daniel");
        driver.findElement(By.id("userEmail")).sendKeys("sangle1802@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Hai Duong");
        driver.findElement(By.id("permanentAddress")).sendKeys("Viet Nam");
        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submit);
        Thread.sleep(1000);

        WebElement result = driver.findElement(By.id("output"));
        js.executeScript("arguments[0].scrollIntoView(true);", result);
        js.executeScript("arguments[0].style.border='3px solid red'", result);

        System.out.println("Result text: " + result.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
