package org.fasttrack.features;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
        loginSteps.setPassword(Constants.userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Cioponea C Cristina");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
        loginSteps.setPassword(Constants.userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
