package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsTest extends TestBase{

    @Test
    public  void verifyProductDetailPage() throws InterruptedException {
        homePage.search("IPhone");

        productsPage.clickFourStarsAndUpFilter();
        productsPage.clickSixthProduct();
        productsPage.switchToNewWindow();

        productDetailPage.clickAddToCartButton();
        Thread.sleep(2000);

        Assert.assertNotNull(productDetailPage.getCheckProductAddedInCart());
        Thread.sleep(2000);

        productDetailPage.clickGoToCartButton();
        Thread.sleep(4000);
    }

}