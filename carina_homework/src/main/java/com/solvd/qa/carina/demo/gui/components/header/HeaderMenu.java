package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.desktop.HomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends HeaderMenuBase {

    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(id = "login-active")
    private ExtendedWebElement logInIcon;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }


    @Override
    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }

    @Override
    public Login openLoginPopUp() {
        logInIcon.hover();
        logInIcon.click();
        return new Login(driver);
    }
}
