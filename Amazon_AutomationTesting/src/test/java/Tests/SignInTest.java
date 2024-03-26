package Tests;

import Pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase{

    @Test
    public void SignInConfirm() throws InterruptedException {

        homePage.search("IPhone");

        productsPage.clickFourStarsAndUpFilter();
        productsPage.clickSixthProduct();
        productsPage.switchToNewWindow();

        productDetailPage.clickAddToCartButton();
        productDetailPage.clickGoToCartButton();

        cartPage.clickProceedToBuyButton();


        signInPage.emailProvider("swetasharma.naju99@gmail.com");
        signInPage.passwordProvider("happy2help");
        Thread.sleep(4000);


        signInPage.setGoToHomPage();

    }
    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
    }
}