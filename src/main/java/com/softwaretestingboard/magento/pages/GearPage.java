package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utilities {

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Overnight Duffle ')]")
    WebElement nameOvernightDuffle;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Overnight Duffle')]")
    WebElement textOvernightDuffle;
    @CacheLookup
    @FindBy(id ="qty")
    WebElement quantity;
    @CacheLookup
    @FindBy(id ="product-addtocart-button")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath ="//div[contains(text(),'You added Overnight Duffle to your ')]")
    WebElement textaddedDuffle;
    @CacheLookup
    @FindBy(xpath ="//a[text()='shopping cart']")
    WebElement linkShoppingCart;
    @CacheLookup
    @FindBy(css ="td[class='col item'] strong[class='product-item-name']")
    WebElement textCronusYogaPant;
    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']")
    WebElement textQuantity3;
    @CacheLookup
    @FindBy(xpath ="//td[@class='col subtotal']//span[@class='price']")
    WebElement textProductPrice;
    @CacheLookup
    @FindBy(css ="td[class='col qty'] input[class*='input-text qty']")
    WebElement changeQuantity5;
    @CacheLookup
    @FindBy(xpath ="//span[text()='Update Shopping Cart']")
    WebElement updateShoppingCartButton;
    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement textProductPrice225;

    public void clickOnOvernightDuffle() {
        Reporter.log("Clicking on Overnight Duffle " + nameOvernightDuffle.toString());
        clickOnElement(nameOvernightDuffle);
        CustomListeners.test.log(Status.PASS,"Clicking Button");
    }

    public String getTextOvernightDuffle() {
        Reporter.log("Text Overnight Duffle " + textOvernightDuffle.toString());
        CustomListeners.test.log(Status.PASS,"Text Overnight Duffle ");
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeQuantity() {
        Reporter.log("Change Quantity " );
        sendTextToElement(quantity, Keys.DELETE + "3");
        CustomListeners.test.log(Status.PASS, "Change Quantity");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Add To Cart Button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Add to Cart Button");
    }

    public String gettextaddedDuffle() {
        Reporter.log("Text added Duffle " + textaddedDuffle.toString());
        CustomListeners.test.log(Status.PASS, "Text added Duffle ");
        return getTextFromElement(textaddedDuffle);
    }

    public void clickOnShoppingCartLink(){
        Reporter.log("Shopping Cart Link " + linkShoppingCart.toString());
        clickOnElement(linkShoppingCart);
        CustomListeners.test.log(Status.PASS, "Shopping Cart Link ");

    }

    public String gettextCronusYogaPant() {
        Reporter.log("Text added Duffle " + textCronusYogaPant.toString());
        CustomListeners.test.log(Status.PASS,"Text added Duffle ");
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextQuantity3() {
        Reporter.log("Text Quantity 3 " + textQuantity3.toString());
        //Assert.assertEquals(getTextFromElement(textQuantity3),"","Error");
        //String quantity=textQuantity3.getAttribute("value");
        CustomListeners.test.log(Status.PASS, "Text Quantity 3 ");
        return textQuantity3.getAttribute("value");
    }

    public String getTextProductPrice(){
        Reporter.log("Text added Duffle " + textProductPrice.toString());
        CustomListeners.test.log(Status.PASS, "Text added Duffle ");
        return getTextFromElement(textProductPrice);
    }

    public void changeQuantityTo5(){
        Reporter.log("Change Quantity to 5 " );
        sendTextToElement(changeQuantity5,Keys.DELETE+"5");
        CustomListeners.test.log(Status.PASS,"Change Quantity to 5 ");
    }

    public void clickOnUpdateShoppingCartButton(){
        Reporter.log("Shopping Cart Link " + updateShoppingCartButton.toString());
        clickOnElement(updateShoppingCartButton);
        CustomListeners.test.log(Status.PASS, "Shopping Cart Link ");
    }

    public String getTextProductPrice225(){
        Reporter.log("Text added Duffle " + textProductPrice225.toString());
        CustomListeners.test.log(Status.PASS, "Text added Duffle " );
        return getTextFromElement(textProductPrice225);
    }
}
