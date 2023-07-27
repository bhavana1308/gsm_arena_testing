package com.solvd.qa.carina.demo.mobile.gui.pages.android;

import com.solvd.qa.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.qa.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(id = "name")
    private ExtendedWebElement nameInputField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "radio_male")
    private ExtendedWebElement maleRadioBtn;

    @FindBy(id = "radio_female")
    private ExtendedWebElement femaleRadioBtn;

    @FindBy(id = "checkbox")
    private ExtendedWebElement privacyPolicyCheckbox;

    @FindBy(id = "login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNamePresent() {
        return nameInputField.isElementPresent();
    }

    @Override
    public void typeName(String name) {
        nameInputField.type(name);
        hideKeyboard();
    }


    public boolean isPasswordPresent() {
        return passwordInputField.isElementPresent();
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    public String getTypedName() {
        return nameInputField.getText();
    }

    public String getTypedPassword() {
        return passwordInputField.getText();
    }

    public boolean isMaleRadioPresent() {
        return maleRadioBtn.isElementPresent();
    }

    public boolean isFemaleRadioPresent() {
        return femaleRadioBtn.isElementPresent();
    }

    public boolean isMaleRadioSelected() {
        return maleRadioBtn.isChecked();
    }

    public boolean isFemaleRadioSelected() {
        return femaleRadioBtn.isChecked();
    }

    @Override
    public void selectMaleSex() {
        maleRadioBtn.click();
    }

    public boolean isPrivacyPolicyPresent() {
        return privacyPolicyCheckbox.isElementPresent();
    }

    @Override
    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    public boolean isPrivacyPolicyChecked() {
        return privacyPolicyCheckbox.isChecked();
    }

    @Override
    public CarinaDescriptionPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), CarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }


    @Override
    public CarinaDescriptionPageBase login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        typeName(username);
        typePassword(password);
        selectMaleSex();
        checkPrivacyPolicyCheckbox();
        return clickLoginBtn();
    }

    public WebViewPage openWebViewPage() {
        loginBtn.click();
        return new WebViewPage(getDriver());
    }

}
