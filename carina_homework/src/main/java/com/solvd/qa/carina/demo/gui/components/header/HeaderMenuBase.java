package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class HeaderMenuBase extends AbstractUIObject {

    public HeaderMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract HomePageBase openHomePage();

    public abstract Login openLoginPopUp();
}
