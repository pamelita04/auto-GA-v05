package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.BaseAdidas.BaseAdidas;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepDefPuma {
    private BaseAdidas basePage;

    String priceFirstText;
    String amountText;


    @Given("^'www.adidas.mx' page is loaded$")
    public void wwwAdidasMxPageIsLoaded() {
        basePage = LoadPage.loadPageAdidas();
    }

    @And("^Hover 'Hombre' tab$")
    public void hoverHombreTab() {
        basePage.hoverHombreTab();
    }

    @And("^click button 'Futbol'$")
    public void clickButtonFutbol() {
        basePage.clickButtonFutbol();
    }

    @And("^Get price from first item$")
    public void getPriceFromFirstItem() {
        priceFirstText = basePage.getPriceFromItem();
        System.out.println("++++price++++" + priceFirstText);
    }

    @And("^Click first element$")
    public void clickFirstElement() {
        basePage.clickFirstElement();
    }

    @And("^Select first size$")
    public void selectFirstSize() {
        basePage.selectFirstSize();
    }

    @And("^Click button in 'Add to Cart'$")
    public void clickButtonInAddToCart() {
        basePage.clickButtonInAddToCart();
    }

    @And("^Verify that the amount is (\\d+)$")
    public void verifyThatTheAmountIs(int amount) {
        String myString = basePage.getAmountFromItem();
        int amountExpected = Integer.parseInt(myString);
        Assert.assertEquals(amount, amountExpected, "ERROR NOT EQUALS - LOAN AMOUNT.");
    }

    @And("^get amount from item$")
    public void getAmountFromItem() {
        amountText = basePage.getAmountFromItem();
        System.out.println("++++amount++++" + amountText);
    }

    @And("^Click 'See Cart' link$")
    public void clickSeeCartLink() {
        basePage.clickSeeCartLink();
    }

    @And("^Get item name title$")
    public void getItemNameTitle() {
        String itemTitle = basePage.getItemNameTitle();
        System.out.println("++++titleItem++++" + itemTitle);
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String titleItem) throws Throwable {
        String titleItemExpected = basePage.getItemNameTitle();
        Assert.assertEquals(titleItem, titleItemExpected, "ERROR NOT EQUALS - TITLE ITEM.");
    }


    @And("^Price should be \"([^\"]*)\" USD$")
    public void priceShouldBeUSD(String priceItem) throws Throwable {
        Assert.assertEquals(priceItem, priceFirstText, "ERROR NOT EQUALS - PRICE ITEM.");

    }

    @And("^Price Total should be \"([^\"]*)\" USD$")
    public void priceTotalShouldBeUSD(String priceTotalItem) throws Throwable {
        String priceTotalExpected = basePage.getPriceTotal();
        Assert.assertEquals(priceTotalItem, priceTotalExpected, "ERROR NOT EQUALS - PRICE TOTAL ITEM.");
    }
}

