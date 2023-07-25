package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignUpPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends AbstractUIObject {

    public HeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract HomePageBase openHomePage();

    public abstract LogInPopUp openLoginPopUp();

    public abstract HeaderMenu openHeaderMenu();

    public abstract SignUpPage clickSignupButton();

}
