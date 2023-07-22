package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class FeaturedPage extends AbstractPage {

    public FeaturedPage(WebDriver driver) {
        super(driver);
        setPageURL("/news.php3?sTag=Featured");
    }
}
