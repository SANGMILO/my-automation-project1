import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        WebElement yes = driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
        yes.click();
        Thread.sleep(1000);

        driver.close();
    }
}
