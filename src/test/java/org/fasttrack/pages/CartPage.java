package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;


    @FindBy(css = ".product-subtotal .woocommerce-Price-amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "td.product-remove")
    private WebElementFacade removeProduct;


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
    public boolean verifyIfSubtotalMatches(){
        int expected = getSubtotalProducts();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }

    public void clickRemoveProduct(){
        clickOn(removeProduct);

    }

        }



