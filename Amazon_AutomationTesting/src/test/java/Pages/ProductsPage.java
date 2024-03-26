package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@aria-label='4 Stars & Up']")
    WebElement fourStarAndUpFilter;

    @FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
    WebElement sixthProduct;

    public void clickFourStarsAndUpFilter(){
        fourStarAndUpFilter.click();
    }
    public void clickSixthProduct(){
        sixthProduct.click();

    }

    public void switchToNewWindow(){
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windowHandle : windowHandles){
            if(!windowHandle.equals(currentWindowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
