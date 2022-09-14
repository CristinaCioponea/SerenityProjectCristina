package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-58 a")
    private WebElementFacade accountLink;

    @FindBy(css = ".u-column1 h2")
    private WebElementFacade loginLink;


    @FindBy(css = ".search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".u-column2 h2")
    private WebElementFacade registerLink;

    @FindBy(id = "menu-item-59")
    private WebElementFacade cartLink;



    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }
    public void clickCartLink(){
        clickOn(cartLink);
    }

}




