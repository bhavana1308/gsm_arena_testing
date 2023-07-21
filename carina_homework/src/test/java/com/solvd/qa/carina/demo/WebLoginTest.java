package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.components.header.HeaderMenu;
import com.solvd.qa.carina.demo.gui.components.header.HeaderMenuBase;
import com.solvd.qa.carina.demo.gui.components.header.LogInPopUp;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.qa.carina.demo.gui.pages.common.LoginPageBase;
import com.solvd.qa.carina.demo.gui.pages.desktop.LoginPage;
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
        LogInPopUp logInPopUp = new LogInPopUp(getDriver());
        Assert.assertTrue(logInPopUp.isLoginPopUpPresent(), "login pop up not present");
        //send keys to fields
        logInPopUp.sendKeysToEmailField(email);
        logInPopUp.sendKeysToPasswordField(password);
        //validate fields
        Assert.assertTrue(logInPopUp.isLoginButtonPresent(), "login Button not present");
        Assert.assertTrue(logInPopUp.isForgotPasswordPresent(), "Forgot password is not present");
        //click login button
        logInPopUp.clickLogInButton();
        //Check for login page opening
        LoginPageBase loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        //validate messages from login page
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.readLoginMessage(), loginMessage, "login message is not present");
        softAssert.assertEquals(loginPage.readReasonMessage(), reasonMessage, "Reason message is not present");
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
