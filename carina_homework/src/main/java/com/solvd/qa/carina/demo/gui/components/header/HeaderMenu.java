package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//ul[@id='menu']/li[1]/a")
    public ExtendedWebElement homeInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[2]/a")
    public ExtendedWebElement newsInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[3]/a")
    public ExtendedWebElement reviewsInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[4]/a")
    public ExtendedWebElement videosInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[5]/a")
    public ExtendedWebElement featuredInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[6]/a")
    public ExtendedWebElement phoneFinderInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[7]/a")
    public ExtendedWebElement dealsInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[8]/a")
    public ExtendedWebElement merchInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[9]/a")
    public ExtendedWebElement coverageInHeader;

    @FindBy(xpath = "//ul[@id='menu']/li[10]/a")
    public ExtendedWebElement contactInHeader;


    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        homeInHeader.click();
        return new HomePage(driver);
    }

    public NewsPage openNews() {
        newsInHeader.hover();
        newsInHeader.click();
        return new NewsPage(driver);
    }

    public ReviewsPage openReviews() {
        reviewsInHeader.hover();
        reviewsInHeader.click();
        return new ReviewsPage(driver);
    }

    public VideosPage openVideos() {
        videosInHeader.hover();
        videosInHeader.click();
        return new VideosPage(driver);
    }

    public FeaturedPage openFeatured() {
        featuredInHeader.hover();
        featuredInHeader.click();
        return new FeaturedPage(driver);
    }

    public PhoneFinderPage openPhoneFinder() {
        phoneFinderInHeader.hover();
        phoneFinderInHeader.click();
        return new PhoneFinderPage(driver);
    }

    public MerchPage openMerch() {
        merchInHeader.hover();
        merchInHeader.click();
        return new MerchPage(driver);
    }

    public DealsPage openDeals() {
        dealsInHeader.hover();
        dealsInHeader.click();
        return new DealsPage(driver);
    }

    public CoveragePage openCoverage() {
        coverageInHeader.hover();
        coverageInHeader.click();
        return new CoveragePage(driver);
    }

    public ContactPage openContact() {
        contactInHeader.hover();
        contactInHeader.click();
        return new ContactPage(driver);
    }


}
