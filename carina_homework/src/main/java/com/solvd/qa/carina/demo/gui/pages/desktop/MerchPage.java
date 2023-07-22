package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class MerchPage extends AbstractPage {

    public MerchPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://merch.gsmarena.com/");
    }
}
