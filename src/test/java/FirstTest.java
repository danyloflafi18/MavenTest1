import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

    }
}
