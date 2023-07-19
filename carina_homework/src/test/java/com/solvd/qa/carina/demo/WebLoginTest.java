package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.components.header.HeaderMenu;
import com.solvd.qa.carina.demo.gui.components.header.HeaderMenuBase;
import com.solvd.qa.carina.demo.gui.components.header.Login;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebLoginTest implements IAbstractTest {

    @Test(dataProvider = "DP1")
    @MethodOwner(owner = "Bhavana")
    public void verifyLogin(String email, String password, String loginMessage, String reasonMessage) {
        // Open GSM Arena home page and verify page is opened
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        //Open login popup
        HeaderMenuBase headerMenu = new HeaderMenu(getDriver());
        headerMenu.openLoginPopUp();
        Login login = new Login(getDriver());
        Assert.assertTrue(login.isLoginPopUpPresent(), "login pop up not present");
        login.sendKeysToEmailField(email);
        login.sendKeysToPasswordField(password);
        Assert.assertTrue(login.isLoginButtonPresent(), "login Button not present");
        Assert.assertTrue(login.isForgotPasswordPresent(), "Forgot password is not present");
        login.clickLogInButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(login.readLoginMessage(), loginMessage, "login message is not present");
        softAssert.assertEquals(login.readReasonMessage(), reasonMessage, "Reason message is not present");
        softAssert.assertAll();
    }

    @DataProvider(name = "DP1")
    public Object[][] getData() {
        return new Object[][]{
                {"s9rowa@mail.ru", "changeme", "Login successful.", "Stand-by for redirect."},
                {"s9rowabcd@mail.ru", "changeme", "Login failed.", "Reason: User record not found."},
                {"s9rowa@mail.ru", "change", "Login failed.", "Reason: Wrong password."}
        };
    }


}
