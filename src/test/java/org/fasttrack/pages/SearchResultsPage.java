package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(css = ".entry-title")
    private List<WebElementFacade> listOfProductsName;

    public SearchResultsPage(WebElementFacade searchAndEnter) {
        this.searchAndEnter = searchAndEnter;
    }

    public boolean findProductInListAndOpen(String productName){
        for (WebElementFacade element: listOfProductsName){
            if (element.getText().equalsIgnoreCase(productName)){
                element.typeAndEnter(productName);
                return false;
            }
        }

        return true;
    }

    @FindBy(css = ".search-field")
    private WebElementFacade searchAndEnter;

    public boolean searchProductAndEnter(String productName){
        for (WebElementFacade element: searchAndEnter){
            if(element.getText().equalsIgnoreCase(productName)){
                element.typeAndEnter(productName);
            }
        }
        return false;
    }

    @FindBy(css = ".entry-title a")
    private WebElementFacade productSearched;

    public void clickProductSearched(){
        clickOn(productSearched);
    }
}




