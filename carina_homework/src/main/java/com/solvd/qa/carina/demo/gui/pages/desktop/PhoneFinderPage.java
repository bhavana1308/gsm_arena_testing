package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class PhoneFinderPage extends AbstractPage {

    public PhoneFinderPage(WebDriver driver) {
        super(driver);
        setPageURL("/search.php3");
    }
}
