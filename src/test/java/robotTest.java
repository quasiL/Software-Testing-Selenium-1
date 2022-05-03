import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        login.sendKeys("khairart");
        password.sendKeys("Oasis!1996");

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

        List<WebElement> list =  (List<WebElement>) driver.findElements(By.tagName("select"));
        Select select = new Select(list.get(0));
        select.selectByVisibleText("Oberon");

        Select select2 = new Select(list.get(1));
        select2.selectByVisibleText("Rumunsko");

        driver.findElement(By.id("mod_quiz-next-nav")).click();
    }
}
