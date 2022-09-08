package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(css = ".entry-title")
    private List<WebElementFacade> listOfProductsName;

    public boolean findProductInListAndOpen(String productName){
        for (WebElementFacade element: listOfProductsName){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }

        return false;
    }
}




