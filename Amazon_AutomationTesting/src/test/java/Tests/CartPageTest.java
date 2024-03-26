package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase{

    @Test
    public void verifyCartAndBuy() throws InterruptedException {
        homePage.search("IPhone");
        productsPage.clickFourStarsAndUpFilter();
        productsPage.clickSixthProduct();
        productsPage.switchToNewWindow();

        productDetailPage.clickAddToCartButton();
        productDetailPage.clickGoToCartButton();

        Assert.assertNotNull(cartPage.getShoppingCart());
        //Thread.sleep(3000);

        cartPage.getShoppingCart();
        cartPage.clickProceedToBuyButton();
        Thread.sleep(2000);
    }

}