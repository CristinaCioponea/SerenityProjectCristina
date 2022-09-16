package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.pages.CartPage;
import org.fasttrack.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected ShopSteps shopSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;


    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get("http://qa1.fasttrackit.org:8008/");

    }


}





