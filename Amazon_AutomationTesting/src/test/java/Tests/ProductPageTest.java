package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends TestBase {

    @Test
    public void testProductSelection() throws InterruptedException {
        homePage.search("IPhone");
        Thread.sleep(2000);

        productsPage.clickFourStarsAndUpFilter();
        Thread.sleep(4000);

        productsPage.clickSixthProduct();
        Thread.sleep(5000);

        productsPage.switchToNewWindow();
        //Assert.assertTrue("Product page is not displayed", driver.getTitle().contains("Product"));
    }

}