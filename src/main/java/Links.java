import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/links");
        Thread.sleep(3000);

        WebElement home = driver.findElement(By.xpath("//*[@id=\"simpleLink\"]"));
        home.click();
        Thread.sleep(1000);

        WebElement HomePH4P4 = driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]"));
        HomePH4P4.click();
        Thread.sleep(2000);


        driver.close();

    }
}
