import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class webTestCase {
    private WebDriver driver;

    @BeforeEach
    public void init()  {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void clean() {
        //driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
