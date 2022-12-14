package org.fasttrack.features;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Test
    public void loginAndSearchForNameProductTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        shopSteps.navigateToShopPage();
        searchSteps.searchForKeyword("7");
        searchSteps.findProductInListAndOpen("6K71N");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        shopSteps.navigateToShopPage();
        searchSteps.searchForKeyword("2");
    }

    @Test
    public void loginAndSearchForCredentialsProductNameTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        shopSteps.navigateToShopPage();
        searchSteps.searchForKeyword("Beanie");
    }

    @Test
    public void searchForAProductTest(){
        shopSteps.navigateToShopPage();
        searchSteps.navigateToProductName("Album");
        searchSteps.clickProductSearched();


    }


}