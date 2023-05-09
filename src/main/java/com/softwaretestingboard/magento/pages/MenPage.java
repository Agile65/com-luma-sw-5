package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utilities {

        @CacheLookup
        @FindBy(css=".product-item-link")
        WebElement productName;
        @CacheLookup
        @FindBy(xpath="(//div[@id='option-label-size-143-item-175'])[1]")
        WebElement size32;
        @CacheLookup
        @FindBy(css="#option-label-color-93-item-49")
        WebElement colourBlack;
        @CacheLookup
        @FindBy(css=".action.tocart.primary")
        WebElement addToCartButton;
        @CacheLookup
        @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
        WebElement addedPant;
        @CacheLookup
        @FindBy(css=".message-success.success.message div a")
        WebElement linkShoppingCart;
        @CacheLookup
        @FindBy(css="main div h1 span")
        WebElement textShoppingCart;
        @CacheLookup
        @FindBy(xpath="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
        WebElement textCronusYogaPant;
        @CacheLookup
        @FindBy(css=".item-options>dd:first-of-type")
        WebElement textSize32;
        @CacheLookup
        @FindBy(css=".item-options>dd:last-of-type")
        WebElement textBlack;

        public void hoverAndClickProduct(){
                Reporter.log("Mouse hover and click "+size32.toString());
                mouseHoverToElement(productName);
                clickOnElement(size32);
                CustomListeners.test.log(Status.PASS, "Mouse hover on product and click on size");
        }
        public void hoverAndClickProductColour(){
                Reporter.log("Mouse hover and click "+colourBlack.toString());
                mouseHoverToElement(productName);
                mouseHoverToElementAndClick(colourBlack);
                CustomListeners.test.log(Status.PASS, "Mouse hover on product and click on colour");
        }
        public void hoverAndClickOnAddToCartButton(){
                Reporter.log("Mouse hover and click "+productName.toString());
                mouseHoverToElement(productName);
                mouseHoverToElementAndClick(addToCartButton);
                CustomListeners.test.log(Status.PASS, "Mouse hover on product and click on add to cart Button");
        }
        public String getTextAddedPantToShoppingCart(){
                Reporter.log("Added Pant" + addedPant.toString());
                CustomListeners.test.log(Status.PASS, "Added Pant");
                return getTextFromElement(addedPant);
        }
        public void clickOnShoppingCart(){
                Reporter.log("Shopping Cart Link " + linkShoppingCart.toString());
                clickOnElement(linkShoppingCart);
                CustomListeners.test.log(Status.PASS, "Click on Shopping Cart Link ");
        }
        public String getTextShoppingCart(){
                Reporter.log("Shopping Cart Text" + textShoppingCart.toString());
                CustomListeners.test.log(Status.PASS, "Shopping Cart Text" );
                return getTextFromElement(textShoppingCart);
        }
        public String getTextCronusYogaPant(){
                Reporter.log("Cronus Yoga Pant Text" + textCronusYogaPant.toString());
                CustomListeners.test.log(Status.PASS, "Cronus Yoga Pant Text");
                return getTextFromElement(textCronusYogaPant);
        }
        public String getTextSize32(){
                Reporter.log("Size32 Text" + textSize32.toString());
                CustomListeners.test.log(Status.PASS, "Size32 Text");
                return getTextFromElement(textSize32);
        }
        public String getTextBlack(){
                Reporter.log("Black Text" + textBlack.toString());
                CustomListeners.test.log(Status.PASS, "Black Text");
                return getTextFromElement(textBlack);
        }
}
