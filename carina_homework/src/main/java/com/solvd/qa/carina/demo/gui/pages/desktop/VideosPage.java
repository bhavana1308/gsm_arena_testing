package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class VideosPage extends AbstractPage {

    public VideosPage(WebDriver driver) {
        super(driver);
        setPageURL("/videos.php3");
    }
}
