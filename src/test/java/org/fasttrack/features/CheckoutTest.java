package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
//        checkoutSteps.
    }
}
