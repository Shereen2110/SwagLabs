import driver_factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver driver;
    @Parameters("browser")
    @BeforeClass
    public void setup(String browser)
    {
        driver= DriverFactory.getWebDriver(browser);
        driver.get("https://www.saucedemo.com");
    }
//    @AfterClass
//    public void tearDown()
//    {
//        driver.quit();
//    }
}
