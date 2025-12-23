import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    private final By addToCart =By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack");
    private final By firstName =By.id("first-name");
    private  final By lastName  =By.id("last-name");
    private final By postelCode=By.id("postal-code");
    private final By continueButton=By.id("continue");
    private final By cancelButton=By.id("cancel");


    public void addIteamToCart()
    {
        driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.id("first-name")).sendKeys("shereen");
        driver.findElement(By.id("last-name")).sendKeys("ibrahim");
        driver.findElement(By.id("postal-code")).sendKeys("12345658768");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
    public void addIteamToCartNegative()
    {
        driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.id("first-name")).sendKeys("shereen");
        driver.findElement(By.id("last-name")).sendKeys("ibrahim");
        driver.findElement(By.id("postal-code")).sendKeys("12345658768");
      //  driver.findElement(By.id("continue")).click();
       // driver.findElement(By.id("finish")).click();
    }

}
