package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void AddToCartTest(){
        searchSteps.navigateToProductName("Cap");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        cartSteps.checkSuccessMessage("Cap");
       
    }

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("Album");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
//        cartSteps.checkSuccessMessage("Cap");
    }
    @Test
    public void loginAndAddTwoProductsToCartTest(){
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("Hoodie with Zipper");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        searchSteps.navigateToProductName("Album");
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

