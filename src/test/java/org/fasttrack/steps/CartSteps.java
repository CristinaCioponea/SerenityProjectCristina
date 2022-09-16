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
        Assert.assertEquals("View cart\n" +
                productName + " " + "has been added to your cart.", cartPage.getSuccessMessage());
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

