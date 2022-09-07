package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.Constants;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {
    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
    @Step
    public void navigateToLoginPage (){
        homePage.clickAccountLink();
        homePage.clickLoginLink();

    }

    @Step
    public void setUserEmail(String email){
        loginPage.setEmailField(Constants.userEmail);
    }
    @Step
    public void setPassword(String password){
        loginPage.setPasswordField(Constants.userPass);
    }
    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }
}
