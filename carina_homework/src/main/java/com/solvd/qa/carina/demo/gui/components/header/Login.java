package com.solvd.qa.carina.demo.gui.components.header;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Login extends AbstractUIObject {

    @FindBy(id = "login-popup2")
    private ExtendedWebElement loginPopUp;

    @FindBy(css = "input[id='email']")
    private ExtendedWebElement email;

    @FindBy(css = "input[id='upass']")
    private ExtendedWebElement password;

    @FindBy(css = "input[value='Log in']")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//div[contains(@class,'normal-text')]/h3")
    private ExtendedWebElement loginMessage;

    @FindBy(xpath = "//div[contains(@class,'normal-text')]/p")
    private ExtendedWebElement reasonMessage;

    @FindBy(linkText = "I forgot my password")
    private ExtendedWebElement forgotPassword;

    public Login(WebDriver driver) {
        super(driver);
    }


    public boolean isLoginPopUpPresent() {
        return loginPopUp.isElementPresent();
    }


    public void sendKeysToEmailField(String text) {
        email.click();
        email.type(text);
    }

    public void sendKeysToPasswordField(String text) {
        password.click();
        password.type(text);
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public boolean isLoginButtonPresent() {
        return logInButton.isElementPresent();
    }

    public String readLoginMessage() {
        return loginMessage.getText();
    }

    public String readReasonMessage() {
        return reasonMessage.getText();
    }

    public boolean isForgotPasswordPresent() {
        return forgotPassword.isElementPresent();
    }

}
