import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

public  class LoginTest extends BaseTest {
    LoginPage loginPage;
    @Parameters("browser")
    @BeforeClass
    public void setupTestsLogin()
    {
        System.out.print("LoginTestClass");
        loginPage = new LoginPage(driver);

    }
    @Test(priority = 2,description = "This is the happy scenario",dataProvider = "validLogin",dataProviderClass = DataProviderClass.class)
    public void validLogIn(String user,String pass)
    {
        loginPage.login(user,pass);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","You are in the WrongPosition");

    }
    @Test(priority = 1,dataProvider = "InvalidLogin", dataProviderClass = DataProviderClass.class)
    public void InvalidLogIn(String user, String pass) {
        loginPage.login(user, pass);
        Assert.assertEquals(loginPage.errorMessageDisplayed(), true, "No error message found");


    }
//    public void EmptyFielder()
//    {
//        LoginPage loginPage = new LoginPage(driver);
//        Assert.assertEquals(driver.findElement(loginPage.getPassWordField()).getDomProperty("value"),
//                }
}
