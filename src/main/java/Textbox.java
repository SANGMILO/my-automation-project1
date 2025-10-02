import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Daniel");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys("sangle1802@gmail.com");
        Thread.sleep(1000);

        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.sendKeys("Hair Duong");
        Thread.sleep(1000);

        WebElement PermanentAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        PermanentAddress.sendKeys("VietNam");
        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();
        Thread.sleep(1000);
        driver.close();

    }
}
