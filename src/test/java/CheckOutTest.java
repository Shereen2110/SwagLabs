import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest{
    LoginPage loginPage;
    CheckOutPage checkOutPage;
    @BeforeClass
    public void setupTestsCheckOut()
    {
        loginPage=new LoginPage(driver);
        checkOutPage=new CheckOutPage(driver);
    }
    @Test(dataProvider = "validLogin",dataProviderClass = DataProviderClass.class)
    public void validItemToCart(String user,String pass)
    {
        loginPage.login(user,pass);
        checkOutPage.addIteamToCart();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-complete.html","CycleNotComplete");
    }
    @Test(dataProvider = "validLogin",dataProviderClass = DataProviderClass.class)
    public void addItemToCartNegative (String user,String pass){
        loginPage.login(user,pass);
        checkOutPage.addIteamToCartNegative();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-one.html");
    }
}
