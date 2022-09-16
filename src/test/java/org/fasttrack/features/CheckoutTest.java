package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;
public class CheckoutTest extends BaseTest{
    @Test
    public void checkoutTest(){
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("Beanie");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();
        searchSteps.navigateToProductName("Cap");
        searchSteps.clickProductSearched();
        cartSteps.addToCartAProduct();

        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.setFirstNameBill("Cioponea");
        checkoutSteps.setLastNameBill("Cristina");
        checkoutSteps.setCountryBill("Romania");
        checkoutSteps.setStreetAddressBill("Decembrie");
        checkoutSteps.setCityBill("Cluj");
        checkoutSteps.setPostcodeBill("335200");
        checkoutSteps.setPhoneBillField("0741123123");
        checkoutSteps.setEmailAddressBill(Constants.userEmail);
        checkoutSteps.clickPlaceOrder();

    }
}
