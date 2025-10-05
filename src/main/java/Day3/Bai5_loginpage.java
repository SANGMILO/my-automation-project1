package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai5_loginpage {

    WebDriver driver;

    // Khai báo locators
    By username = By.id("userName");
    By password = By.id("password");
    By login = By.id("login");

    // Constructor để truyền driver từ bên ngoài
    public Bai5_loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Hàm login chung
    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login).click();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/login");
        Thread.sleep(1000);

        Bai5_loginpage loginPage = new Bai5_loginpage(driver);
        loginPage.login("testuser", "12345");
        WebElement loginBtn = driver.findElement(By.id("login"));
        js.executeScript("arguments[0].click();", loginBtn);

        Thread.sleep(2000);
        System.out.println("Sau khi login: " + driver.getCurrentUrl());

        driver.quit();
    }
}
