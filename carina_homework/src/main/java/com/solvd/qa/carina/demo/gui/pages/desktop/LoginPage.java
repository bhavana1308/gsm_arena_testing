package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//div[contains(@class,'normal-text')]/h3")
    private ExtendedWebElement loginMessage;

    @FindBy(xpath = "//div[contains(@class,'normal-text')]/p")
    private ExtendedWebElement reasonMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("/login.php3");
    }


    public String readLoginMessage() {
        return loginMessage.getText();
    }

    public String readReasonMessage() {
        return reasonMessage.getText();
    }
}
