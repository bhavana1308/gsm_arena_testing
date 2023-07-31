package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//li/a[text()='%s']")
    public ExtendedWebElement menuInHeader;


    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        menuInHeader.format("Home").click();
        return new HomePage(driver);
    }

    public NewsPage openNews() {
        menuInHeader.format("News").click();
        return new NewsPage(driver);
    }

    public ReviewsPage openReviews() {
        menuInHeader.format("Reviews").click();
        return new ReviewsPage(driver);
    }

    public VideosPage openVideos() {
        menuInHeader.format("Videos").click();
        return new VideosPage(driver);
    }


    public FeaturedPage openFeatured() {
        menuInHeader.format("Featured").click();
        return new FeaturedPage(driver);
    }

    public PhoneFinderPage openPhoneFinder() {
        menuInHeader.format("Phone Finder").click();
        return new PhoneFinderPage(driver);
    }

    public MerchPage openMerch() {
        menuInHeader.format("Merch").click();
        return new MerchPage(driver);
    }

    public DealsPage openDeals() {
        menuInHeader.format("Deals").click();
        return new DealsPage(driver);
    }

    public CoveragePage openCoverage() {
        menuInHeader.format("Coverage").click();
        return new CoveragePage(driver);
    }

    public ContactPage openContact() {
        menuInHeader.format("Contact").click();
        return new ContactPage(driver);
    }


}
