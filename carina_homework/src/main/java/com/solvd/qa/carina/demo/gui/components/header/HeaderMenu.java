package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.desktop.HomePage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignUpPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends HeaderMenuBase {

    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(id = "login-active")
    private ExtendedWebElement logInIcon;

    @FindBy(xpath = "//*[@id='header']/div/div/button")
    private ExtendedWebElement mainMenu;

    @FindBy(xpath = "//a[@href='register.php3']/i")
    private ExtendedWebElement signUpButton;

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }

    @Override
    public LogInPopUp openLoginPopUp() {
        logInIcon.hover();
        logInIcon.click();
        return new LogInPopUp(driver);
    }

    @Override
    public MainMenu openMainMenu() {
        mainMenu.hover();
        mainMenu.click();
        return new MainMenu(driver);
    }

    @Override
    public SignUpPage clickSignupButton() {
        signUpButton.hover();
        signUpButton.click();
        return new SignUpPage(driver);
    }
}
