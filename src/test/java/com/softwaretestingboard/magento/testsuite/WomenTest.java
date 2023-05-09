package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    HomePage homepage;
    WomenPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homepage=new HomePage();
        womenPage=new WomenPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter(){
        //1. verifyTheSortByProductNameFilter
        //* Mouse Hover on Women Menu
        homepage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverToWomenTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        //* Select Sort By filter “Product Name”
        womenPage.selectSortByFilterProductName();
        //* Verify the products name display in alphabetical order
        womenPage.verifyProductsNameAlphabeticalOrder();
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter(){
        //2. verifyTheSortByPriceFilter
        //* Mouse Hover on Women Menu
        homepage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverToWomenTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        //* Select Sort By filter “Price”
        womenPage.selectSortByFilterPrice();
        //* Verify the products price display in Low to High
        womenPage.verifyProductsPriceLowToHigh();
    }
}
