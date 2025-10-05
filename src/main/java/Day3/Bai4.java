package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Bai4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(1000);

        WebElement alertsFrame = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]"));
        alertsFrame.click();
        Thread.sleep(1000);

        WebElement browser = driver.findElement(By.xpath("//*[@id='item-0']"));
        browser.click();
        Thread.sleep(1000);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);

        WebElement newTabBtn = driver.findElement(By.id("tabButton"));
        newTabBtn.click();
        Thread.sleep(1000);

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String win : allWindows) {
            if (!win.equals(mainWindow)) {
                driver.switchTo().window(win);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                js.executeScript("arguments[0].scrollIntoView(true);", text);
                js.executeScript("arguments[0].style.border='3px solid red'", text);
                System.out.println("text ở tab mới: " + text.getText());
                Thread.sleep(1000);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        System.out.println("Tiêu đề tab cũ: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
