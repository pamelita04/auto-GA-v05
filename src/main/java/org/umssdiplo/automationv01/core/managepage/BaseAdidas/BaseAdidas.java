package org.umssdiplo.automationv01.core.managepage.BaseAdidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class BaseAdidas extends BasePage {

    @FindBy(xpath = "html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement tabHombre;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement buttonFutbol;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/a/div[2]/div[2]/span[1]")
    private WebElement priceFirstElement;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/a")
    private WebElement firstItemElement;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/button/span")
    private WebElement selectSizeElement;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[1]/button")
    private WebElement selectFirstItemSizeElement;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[3]/button")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[1]/div[3]/div/div[1]")
    private WebElement amountElement;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[1]/div[3]/div/a[1]")
    private WebElement buttonSeeCart;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[1]/div[1]/div[1]/div[2]/form/div/div/div[2]/div[2]/div[2]/a")
    private WebElement titleItemElement;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[1]/div[1]/div[2]/div[1]/div/div[3]/section/div[4]/div/div[2]")
    private WebElement priceTotalElement;


    public void hoverHombreTab() {
        CommonEvents.hoverToElement(tabHombre);
    }

    public void clickButtonFutbol() {
        CommonEvents.clickButton(buttonFutbol);
    }

    public String getPriceFromItem() {
        String price = CommonEvents.getTextContent(priceFirstElement);
        price = price.replaceAll("\\D+","");
//        int priceExpected = Integer.parseInt(price);
        return price;
    }

    public void clickFirstElement() {
        CommonEvents.clickButton(firstItemElement);
    }

    public void selectFirstSize() {
        CommonEvents.clickButton(selectSizeElement);
        CommonEvents.clickButton(selectFirstItemSizeElement);

    }

    public void clickButtonInAddToCart() {
        CommonEvents.clickButton(buttonAddToCart);
    }

    public String getAmountFromItem() {
        String amount = CommonEvents.getTextContent(amountElement);
        amount = amount.replaceAll("\\D+","");
        return amount;
    }

    public void clickSeeCartLink() {
        CommonEvents.clickButton(buttonSeeCart);
    }

    public String getItemNameTitle() {
        return CommonEvents.getTextContent(titleItemElement);
    }

    public String getPriceTotal() {
        String priceTotal = CommonEvents.getTextContent(priceTotalElement);
//        priceTotal = priceTotal.replaceAll("\\D+","");
        return priceTotal;
    }
}

