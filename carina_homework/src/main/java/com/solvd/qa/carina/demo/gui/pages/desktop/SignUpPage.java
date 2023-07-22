package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(css = "input[name='sNickname']")
    public ExtendedWebElement nickName;

    @FindBy(xpath = "//fieldset[@id='udata-f']/input[2]")
    public ExtendedWebElement emailForSignUp;

    @FindBy(xpath = "//div[@id='user-submit']/form/input")
    public ExtendedWebElement passwordForSignup;

    @FindBy(xpath = "//label[@for='iagree1']")
    public ExtendedWebElement checkbox1;

    @FindBy(xpath = "//label[@for='iagree2']")
    public ExtendedWebElement checkbox2;

    @FindBy(css = "input[class='button float-right']")
    public ExtendedWebElement submit;

    @FindBy(css = "div[class='normal-text res-success']")
    public ExtendedWebElement successMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);
        setPageURL("/register.php3");
    }

    public void sendKeysToNickName(String text) {
        nickName.click();
        nickName.type(text);
    }

    public void sendKeysToemail(String text) {
        emailForSignUp.click();
        emailForSignUp.type(text);
    }

    public void sendKeysToPassword(String text) {
        passwordForSignup.click();
        passwordForSignup.type(text);
    }

    public void clickCheckBox1() {
        checkbox1.click();
    }

    public void clickCheckBox2() {
        checkbox2.click();
    }

    public void clickSubmit() {
        submit.click();
    }

    public String successMessage() {
        return successMessage.getText();
    }


}
