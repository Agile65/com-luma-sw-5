package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    MenPage menPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        menPage=new MenPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //1. userShouldAddProductSuccessFullyToShoppinCart()
        //* Mouse Hover on Men Menu
        homePage.mouseHoverToMenMenu();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverToMenTops();
        //* Click on Pants
        homePage.clickOnPants();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.hoverAndClickProduct();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.hoverAndClickProductColour();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.hoverAndClickOnAddToCartButton();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.","Error");
        //* Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menPage.getTextShoppingCart(),"Shopping Cart","Error");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menPage.getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
        //* Verify the product size ‘32’
        Assert.assertEquals(menPage.getTextSize32(),"32","Error");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(menPage.getTextBlack(),"Black","Error");
    }
}
