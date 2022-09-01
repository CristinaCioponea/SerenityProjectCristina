package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

import java.util.Locale;

public class CartSteps extends BaseSteps {

    @Step
    public void addProductToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkMessageSuccess(String productName) {
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart.".toLowerCase(), cartPage.getSuccessMessage().toLowerCase());
    }

    @Step
    public void checkSubtotalMatches() {
        Assert.assertTrue(cartPage.chechIfSubtotalMatches());
    }
}
