import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        Thread.sleep(2000);

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

        driver.quit();
    }
}
