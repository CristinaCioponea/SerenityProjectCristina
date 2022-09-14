package org.fasttrack.features;

import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.setUserEmailRegister();
        registerSteps.setUserPassRegister();
        registerSteps.clickRegisterButton();
        registerSteps.verifyIfUserIsAlreadyRegistred();
    }
}
