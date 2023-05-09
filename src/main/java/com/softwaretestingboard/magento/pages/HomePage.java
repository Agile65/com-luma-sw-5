package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utilities {

    @CacheLookup
    @FindBy(css = "a[id='ui-id-4'] span:nth-child(1)")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(css = "a[id='ui-id-9'] span:nth-child(1)")
    WebElement womenTops;
    @CacheLookup
    @FindBy(css = "a[id='ui-id-11'] span:nth-child(1)")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
    WebElement menMenu;
    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement menBottoms;
    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement menPants;
    @CacheLookup
    @FindBy(css = "a[id='ui-id-6'] span:nth-child(2)")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(css = "a[id='ui-id-25'] span")
    WebElement bags;

    public void hoverOnGearMenu() {
        Reporter.log("Gear Menu " + gearMenu.toString());
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS, "Gear menu ");
    }

    public void clickOnBags() {
        Reporter.log("Bags " + bags.toString());
        clickOnElement(bags);
        CustomListeners.test.log(Status.PASS, "Click on bags");
    }

    public void mouseHoverToWomenMenu() {
        Reporter.log("Women Menu " + womenMenu.toString());
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS, "Mouse Hover to women menu");

    }

    public void mouseHoverToWomenTops() {
        Reporter.log("Women Tops " + womenTops.toString());
        mouseHoverToElement(womenTops);
        CustomListeners.test.log(Status.PASS, "Mouse hover to women tops");
    }

    public void clickOnJackets() {
        Reporter.log("Women Jackets " + womenJackets.toString());
        clickOnElement(womenJackets);
        CustomListeners.test.log(Status.PASS, "Click on Jackets");
    }

    public void mouseHoverToMenMenu() {
        Reporter.log("Men Menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS, "Mouse hover to men menu");
    }

    public void mouseHoverToMenTops() {
        Reporter.log("Men Bottoms" + menMenu.toString());
        mouseHoverToElement(menBottoms);
        CustomListeners.test.log(Status.PASS, "Mouse hover to men Bottom");
    }

    public void clickOnPants() {
        Reporter.log("Men Pants" + menPants.toString());
        clickOnElement(menPants);
        CustomListeners.test.log(Status.PASS, "Click on pants");
    }
}
