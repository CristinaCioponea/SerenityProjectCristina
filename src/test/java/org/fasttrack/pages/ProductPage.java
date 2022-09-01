package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy (css = ".add-to-cart-buttons button")
    private WebElementFacade addToCartButton;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }



}
