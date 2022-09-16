package org.fasttrack.steps;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.fasttrack.utils.Constants;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void navigateToCheckoutPage(){
        cartPage.clickCheckoutButton();
    }
    @Step
    public  void setFirstNameBill(String name){
    checkoutPage.setFirstNameBillField("Cioponea");
    }
    @Step
    public void setLastNameBill(String name){
        checkoutPage.setLastNameBillField("Cristina");
    }
    @Step
    public void setCountryBill(String name){
        checkoutPage.setCountryBillField("Romania");
    }
    @Step
    public void setStreetAddressBill(String name){
        checkoutPage.setAddressBillField("Decembrie");
    }
    @Step
    public void setCityBill(String name){
        checkoutPage.setCityBillField("Deva");
    }
    @Step
    public void setPostcodeBill(String value){
        checkoutPage.setPostcodeBillField("335200");
    }
    @Step
    public void setPhoneBillField(String value){
        checkoutPage.setPhoneBillField("0741123123");
    }
    @Step
    public void setEmailAddressBill(String email){
        checkoutPage.setEmailBillField(Constants.userEmail);
    }
    @Step
    public void clickPlaceOrder(){
        checkoutPage.clickPlaceOrderButton();
    }

}






