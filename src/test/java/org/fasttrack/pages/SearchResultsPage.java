package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(css = ".entry-title")
    private List<WebElementFacade> listOfProductsName;


    @FindBy(css = ".entry-title a")
    private WebElementFacade selectProductSearched;


    public boolean findProductInListAndOpen(String productName){
        for (WebElementFacade element: listOfProductsName){
            if (element.getText().equalsIgnoreCase(productName)){
                element.typeAndEnter(productName);
                return false;
            }
        }

        return true;
    }


    public void clickProductSearched(){
        clickOn(selectProductSearched);

    }
}




