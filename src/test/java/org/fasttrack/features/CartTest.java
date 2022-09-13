package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("Cap");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        cartSteps.checkSuccessMessage("Cap");



    }



    }

