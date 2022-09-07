package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends BasePage{

    @FindBy(css = "#menu-item-60 a")
    private WebElementFacade shopButton;

    public void clickShopButton(){
        clickOn(shopButton);
    }
}
