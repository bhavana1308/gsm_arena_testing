package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {

    public ContactPage(WebDriver driver) {
        super(driver);
        setPageURL("/contact.php3");
    }
}
