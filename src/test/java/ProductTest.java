import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductTest  extends BaseTest{
    ProductPage product;
    public void setupTestsProductPage()
    {
        ProductPage product=new ProductPage(driver);
        loginPage = new LoginPage(driver);

    }
    LoginPage loginPage;
    @Test(dataProvider = "validLogin",dataProviderClass = DataProviderClass.class)
    public void validProduct(String user,String pass)
    {
        loginPage.login(user,pass);

        product.ClickToItemButton("add-to-cart-sauce-labs-backpack");
    }
    @Test(dataProvider = "validLogin",dataProviderClass = DataProviderClass.class)
    public void invalidProduct(String user,String pass)
    {
        loginPage.login(user,pass);
        product.ClickToItemButton("to-cart-sauce-labs-backpack");
    }
}
