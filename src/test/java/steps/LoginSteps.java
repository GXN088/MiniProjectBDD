package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {
    WebDriver driver;

    @Given("I open the login page")
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I enter username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see the success message")
    public void checkSuccess() {
        WebElement message = driver.findElement(By.id("flash"));
        assertTrue(message.getText().contains("You logged into a secure area!"));
        driver.quit();
    }
}
