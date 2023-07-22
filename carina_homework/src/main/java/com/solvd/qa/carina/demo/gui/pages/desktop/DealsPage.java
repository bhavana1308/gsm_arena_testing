package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class DealsPage extends AbstractPage {

    public DealsPage(WebDriver driver) {
        super(driver);
        setPageURL("/deals.php3");
    }
}
