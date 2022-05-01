import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class robotTest extends webTestCase{

    private WebDriver driver;

    @Test
    public void openTest() {
        WebDriver driver = getDriver();
        driver.get("https://moodle.fel.cvut.cz");

        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.linkText("SSO Login")).click();
        WebElement login = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        //Login and Password
        login.sendKeys("");
        password.sendKeys("");

        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.linkText("My courses")).click();
        driver.findElement(By.xpath("//h5[text()='Software Testing']")).click();
        driver.findElement(By.partialLinkText("Test pro Robota")).click();
        driver.get("https://moodle.fel.cvut.cz/mod/quiz/view.php?id=233484");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.id("id_submitbutton")).click();

        WebElement textarea = driver.findElement(By.tagName("textarea"));
        textarea.sendKeys("Name cv robot");

        WebElement text = driver.findElement(By.cssSelector("input[type=\"text\"]"));
        text.sendKeys("86400");

        WebElement path = driver.findElement(By.xpath("//select[@class ='select custom-select custom-select place1'][0]"));
        Select select = new Select(path);
        select.selectByVisibleText("Oberon");

        WebElement path2 = driver.findElement(By.xpath("//select[@class ='select custom-select custom-select place1'][1]"));
        Select select2 = new Select(path2);
        select2.selectByVisibleText("Rumunsko");
    }

}
