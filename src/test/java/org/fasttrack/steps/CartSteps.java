package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;
import org.yecht.Data;

import java.util.Locale;

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

    }

