package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkMessageSuccess("SILVER DESERT NECKLACE");
    }

    @Test
    public void checkTotalAndSubtotalTest() {

        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkMessageSuccess("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("LARGE CAMERA BAG");
        cartSteps.addProductToCart();
        cartSteps.checkMessageSuccess("LARGE CAMERA BAG");

        searchSteps.navigateToProductName("HERALD GLASS VASE");
        cartSteps.addProductToCart();
        cartSteps.checkMessageSuccess("HERALD GLASS VASE");

        cartSteps.checkSubtotalMatches();




    }
}
