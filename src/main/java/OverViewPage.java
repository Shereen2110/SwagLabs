import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage extends BasePage {
    public OverViewPage(WebDriver driver) {
        super(driver);
    }
    private final By finishButton=By.id("finish");
    private final By cancelButton=By.id("cancel");
}
