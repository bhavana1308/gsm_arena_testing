package com.solvd.qa.carina.demo.WebPracticeTests;

import com.solvd.qa.carina.demo.gui.components.header.HeaderMenuBase;
import com.solvd.qa.carina.demo.gui.components.header.MainMenu;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;


public class MainMenuTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openNewsPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        NewsPage newsPage = mainMenu.openNews();
        Assert.assertTrue(newsPage.isPageOpened(), "News page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openReviewsPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        ReviewsPage reviewsPage = mainMenu.openReviews();
        Assert.assertTrue(reviewsPage.isPageOpened(), "Reviews page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openVideosPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        VideosPage videosPage = mainMenu.openVideos();
        Assert.assertTrue(videosPage.isPageOpened(), "Videos page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openFeaturedPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        FeaturedPage featuredPage = mainMenu.openFeatured();
        Assert.assertTrue(featuredPage.isPageOpened(), "Featured page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openPhoneFinderPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        PhoneFinderPage phoneFinderPage = mainMenu.openPhoneFinder();
        Assert.assertTrue(phoneFinderPage.isPageOpened(), "Phone finder page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openDealsPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        DealsPage dealsPage = mainMenu.openDeals();
        Assert.assertTrue(dealsPage.isPageOpened(), "deals page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openMerch() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        MerchPage merchPage = mainMenu.openMerch();
        Set<String> windowHandles = getDriver().getWindowHandles();//2
        Iterator<String> it = windowHandles.iterator();
        while (it.hasNext()) {
            getDriver().switchTo().window(it.next());
        }
        Assert.assertTrue(merchPage.isPageOpened(), "Merch page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openCoveragePageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        CoveragePage coveragePage = mainMenu.openCoverage();
        Assert.assertTrue(coveragePage.isPageOpened(), "coverage page is not opened");
    }

    @Test
    @MethodOwner(owner = "Bhavana")
    public void openContactPageTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenuBase headerMenu = homePage.getHeaderMenu();
        MainMenu mainMenu = headerMenu.openMainMenu();
        ContactPage contactPage = mainMenu.openContact();
        Assert.assertTrue(contactPage.isPageOpened(), "contact page is not opened");
    }
}
