package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessage;

    @FindBy(css = ".product-cart-total")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy (css = "tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public int getSubtotalProducts() {
        int sum = 0;
        for (WebElementFacade elementFacade:subtotalProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean chechIfSubtotalMatches(){
        int expected = getSubtotalProducts();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
}
