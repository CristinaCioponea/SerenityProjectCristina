package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameBillField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameBillField;
    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade countryBillField;
    @FindBy(id = "billing_address_1")
    private WebElementFacade addressBillField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityBillField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeBillField;
    @FindBy(id = "billing_phone")
    private WebElementFacade phoneBillField;
    @FindBy(id = "billing_email")
    private WebElementFacade emailBillField;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;





    public void setFirstNameBillField (String value){
        typeInto(firstNameBillField, value);
    }
    public void setLastNameBillField(String value){
        typeInto(lastNameBillField,value);
    }
    public void setCountryBillField(String value){
        typeInto(countryBillField, value);
    }
    public void setAddressBillField(String value){
        typeInto(addressBillField, value);
    }
    public void setCityBillField(String value){
        typeInto(cityBillField, value);
    }
    public void setPostcodeBillField(String value){
        typeInto(postcodeBillField,value);
    }
    public void setPhoneBillField(String value){
        typeInto(phoneBillField, value);
    }
    public void setEmailBillField(String value){
        typeInto(emailBillField, value);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
}


