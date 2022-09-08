package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("7cS9z");
        cartSteps.addToCartAProduct();
        cartSteps.checkSuccessMessage("7cS9z");
    }



    }

