package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;


public class RegisterPage extends BasePage{
    @FindBy(id = "reg_email")
    private WebElementFacade emailFieldRegister;

    @FindBy(id = "reg_password")
    private WebElementFacade passFieldRegister;

    @FindBy(css = ".woocommerce-FormRow button")
    private WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade messageErrorRegister;




    public void setEmailFieldRegister(String value){
        typeInto(emailFieldRegister,value);
    }
    public void setPassFieldRegister(String value){
        typeInto(passFieldRegister, value);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public String getErrorMessageError(){
        return messageErrorRegister.getText();
    }

}
