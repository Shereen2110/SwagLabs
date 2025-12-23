import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;
import java.util.List;
public class ProductPage extends BasePage
{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCart = By.xpath("//button[text()='Add to cart']");
private final By productsIds= new ByAll(By.id("item_4_title_link"),By.id("item_0_title_link"),
              By.id("item_1_title_link"),By.id("item_5_title_link"),By.id("item_2_title_link"),
              By.id("item_3_title_link") );

   public void ItemFoundOrNot(String ProductTitle)
   {
       List<WebElement> products = driver.findElements(productsIds);
       for (WebElement element : products) {
           boolean result=element.isDisplayed();
           if(result)
           {
               System.out.print(ProductTitle+": Found");
           }
           else {
               System.out.print(ProductTitle + ":Notfound");
           }
       }

   }

    public void ClickToItemButton(String productName) {
        List<WebElement> products = driver.findElements(addToCart);
        for (WebElement element : products) {
            String idOfEachElement = element.getAttribute("id");
            if (idOfEachElement.toLowerCase().contains(productName.toLowerCase())) {
                element.click();
                break;
            }
        }

    }
}
