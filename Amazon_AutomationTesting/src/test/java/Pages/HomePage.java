package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBar;


    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchButton;

    public boolean search(String product){
        try{
            searchBar.sendKeys(product);
            searchButton.click();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}