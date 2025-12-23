import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By userNameField=By.xpath("//input[@placeholder=\"Username\"]");
    private final By passWordField=By.id("password");
    private final By ButtonLoginField=By.id("login-button");
    private final By errorMessage= By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String userName, String passWord)
    {
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passWordField).clear();
        driver.findElement(passWordField).sendKeys(passWord);
        driver.findElement(ButtonLoginField).click();
    }
    public void valueOfField()
    {
        driver.findElement(userNameField).getAttribute("value");
        driver.findElement(passWordField).getDomProperty("value");
        driver.findElement(ButtonLoginField).click();
    }
    public Boolean errorMessageDisplayed()
    {
      Boolean flag=driver.findElement(errorMessage).isDisplayed();
       return flag ;

    }
//
//    public By getUserNameField() {
//        return userNameField;
//    }
//
//    public By getPassWordField() {
//        return passWordField;
//    }
}
