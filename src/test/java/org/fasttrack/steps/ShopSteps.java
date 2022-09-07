package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class ShopSteps extends BaseSteps{

    @Step
    public void navigateToShopPage(){
        homePage.open();
        shopPage.clickShopButton();
    }
}
