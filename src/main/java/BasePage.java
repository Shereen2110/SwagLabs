import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

}

