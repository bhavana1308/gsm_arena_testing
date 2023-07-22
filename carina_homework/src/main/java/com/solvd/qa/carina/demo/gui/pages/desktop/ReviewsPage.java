package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class ReviewsPage extends AbstractPage {

    public ReviewsPage(WebDriver driver) {
        super(driver);
        setPageURL("/reviews.php3");
    }
}
