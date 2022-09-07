package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".woocommerce-form-login button")
    private WebElementFacade loginButton;





    public void setEmailField(String value) {
        typeInto(emailField, value);
    }
    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }

}
