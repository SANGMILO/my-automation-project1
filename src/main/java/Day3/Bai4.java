package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bai4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        element.click();
        Thread.sleep(1000);

        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
        checkbox1.click();
        Thread.sleep(1000);

        WebElement homeToggle = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
        homeToggle.click();
        Thread.sleep(1000);

        WebElement desktopToggle = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"));
        desktopToggle.click();
        Thread.sleep(1000);


        List<WebElement> desktopCheckboxes = driver.findElements(
                By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li/span/label/span[@class='rct-checkbox']")
        );

        for (WebElement checkbox : desktopCheckboxes) {
            checkbox.click();
            Thread.sleep(500);
        }
        WebElement click1 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]/svg"));
        click1.click();
        Thread.sleep(1000);
        driver.close();
    }
}
