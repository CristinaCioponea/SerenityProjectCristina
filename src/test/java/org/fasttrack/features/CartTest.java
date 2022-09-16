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
//        cartSteps.checkSuccessMessage("Cap");
    }
    @Test
    public void loginAndAddTwoProductsToCartTest(){
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("Beanie");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        searchSteps.navigateToProductName("Cap");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
    }
    @Test
    public void verifySubtotalCartPricesTest(){
        searchSteps.navigateToProductName("Beanie");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        searchSteps.navigateToProductName("Cap");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        cartSteps.navigateToCartPage();
        cartSteps.verifySubtotalMatches();
    }

    @Test
    public void emptyCartTest(){
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        cartSteps.removeCartProducts();
    }







    }

