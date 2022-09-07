package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage {
    @FindBy(css = ".woocommerce-MyAccount-content strong:first-child")
    private WebElementFacade welcometext;


    public String getWelcomeText(){

        return welcometext.getText();
    }

}
