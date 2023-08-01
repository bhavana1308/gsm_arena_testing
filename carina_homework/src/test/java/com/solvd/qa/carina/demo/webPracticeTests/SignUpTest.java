package com.solvd.qa.carina.demo.webPracticeTests;

import com.solvd.qa.carina.demo.gui.components.header.HeaderBase;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignUpPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.StringGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Bhavana")
    public void signUpTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        HeaderBase header = homePage.getHeader();
        SignUpPage signUpPage = header.clickSignupButton();
        Assert.assertTrue(signUpPage.isPageOpened(), "Sign up page not opened");
        signUpPage.sendKeysToNickName(StringGenerator.generateWord(6));
        signUpPage.sendKeysToEmail(StringGenerator.generateEmail());
        signUpPage.sendKeysToPassword(StringGenerator.generateWord(8));
        signUpPage.clickCheckBox1();
        signUpPage.clickCheckBox2();
        signUpPage.clickSubmit();
        Assert.assertEquals(signUpPage.successMessage(), "Your account was created.\nPlease check your email and click on the link to finish the process. Thank you.");
    }
}