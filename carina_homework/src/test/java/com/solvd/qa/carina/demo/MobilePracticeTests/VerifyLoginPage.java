package com.solvd.qa.carina.demo.MobilePracticeTests;

import com.solvd.qa.carina.demo.mobile.gui.pages.android.LoginPage;
import com.solvd.qa.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.solvd.qa.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyLoginPage implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "Bhavana")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginPage() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        LoginPage loginPage = new LoginPage(getDriver());
        welcomePage.clickNextBtn();
        Assert.assertFalse(loginPage.isLoginBtnActive(), "Login button is active when it should be disabled");
        //verify name,password,female radio button,male radio button, privacy policy check box fields
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isNamePresent(), "Name Field is not Present");
        softAssert.assertTrue(loginPage.isPasswordPresent(), "Password field is not present");
        softAssert.assertTrue(loginPage.isFemaleRadioPresent(), "Female Radio Button is not present");
        softAssert.assertTrue(loginPage.isMaleRadioPresent(), "Male Radio Button is not present");
        softAssert.assertTrue(loginPage.isPrivacyPolicyPresent(), "Privacy policy is not present");
        //verify male/female and privacy policy isn't checked
        softAssert.assertFalse(loginPage.isMaleRadioSelected(), "Male Radio is selected");
        softAssert.assertFalse(loginPage.isFemaleRadioSelected(), "Female Radio is selected");
        Assert.assertFalse(loginPage.isPrivacyPolicyChecked(), "privacy policy is checked");
        //type name, password -> name and password are typed
        loginPage.typeName(username);
        loginPage.typePassword(password);
        Assert.assertTrue(loginPage.getTypedName().contains(username), "Name is not typed");
        Assert.assertTrue(loginPage.getTypedPassword().contains(password), "Password is not Typed");
        //chose sex -> male or female is checked
        loginPage.selectMaleSex();
        Assert.assertTrue(loginPage.isMaleRadioSelected(), "Male Radio is not selected");
        //tap Privacy Policy checkbox -> checkbox is checked
        loginPage.checkPrivacyPolicyCheckbox();
        Assert.assertTrue(loginPage.isPrivacyPolicyChecked(), "Privacy policy is not checked");
        //click Sign Up btn -> user is login
        // , Web View page is opened
        WebViewPageBase webViewPage = loginPage.openWebViewPage();
        Assert.assertTrue(webViewPage.isPageOpened(), "Web View page isn't opened");
        softAssert.assertAll();
    }
}