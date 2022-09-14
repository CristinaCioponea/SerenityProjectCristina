package org.fasttrack.steps;
import net.thucydides.core.annotations.Step;

import org.fasttrack.utils.Constants;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{
    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }
    @Step
    public void setUserEmailRegister(){
        registerPage.setEmailFieldRegister(Constants.userEmail);
    }
    @Step
    public void setUserPassRegister(){
        registerPage.setPassFieldRegister(Constants.userPass);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyIfUserIsAlreadyRegistred(){
       Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", registerPage.getErrorMessageError());
    }



}
