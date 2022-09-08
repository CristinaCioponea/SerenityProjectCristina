package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;




    public String getSuccessMessage(){

        return successMessage.getText();
    }

    }

