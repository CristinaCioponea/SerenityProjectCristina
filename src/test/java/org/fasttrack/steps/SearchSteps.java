package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void searchForKeyword(String keyword) {
        homePage.setSearchField(keyword);
        homePage.enter(keyword);
    }

    @Step
public void findProductInAListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInListAndOpen(productName));
    }

    public void navigateToProductName(String productName){
        searchForKeyword(productName);
        findProductInAListAndOpen(productName);
    }
    @Step
    public void findProductInListAndOpen (String productName) {
        Assert.assertTrue(searchResultsPage.findProductInListAndOpen(productName));
    }
    @Step
    public void navigateToProductNameInList (String productName){
        searchForKeyword(productName);
        findProductInListAndOpen(productName);
    }
}




