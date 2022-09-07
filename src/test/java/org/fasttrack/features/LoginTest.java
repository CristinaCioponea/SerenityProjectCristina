package org.fasttrack.features;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
        loginSteps.setPassword(Constants.userPass);
        loginSteps.clickLogin();

    }

    }



