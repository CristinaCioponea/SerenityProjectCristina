package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;


public class CartSteps extends BaseSteps {
    @Step
    public void addToCartAProduct(){
        productPage.clickAddToCartButton();
    }
   @Step
    public void checkSuccessMessage(String productName){
       String expected = productName + " has been added to your cart.";
       String actual = cartPage.getSuccessMessage().replaceAll("[^a-zA-Z0-9 .-]", "");

       System.out.println(expected);
       System.out.println(actual);
        Assert.assertEquals(expected, actual);
   }
   @Step
    public void verifySubtotalMatches(){
       Assert.assertTrue(cartPage.verifyIfSubtotalMatches());
   }
   @Step
    public void navigateToCartPage(){
        homePage.clickCartLink();
   }
   @Step
    public void removeCartProducts(){
        cartPage.clickCartButton();
        cartPage.clickRemoveProductButton();
//        cartPage.clickUpdateCartButton();
//        cartPage.clickReturnToCartButton();

   }


    }

