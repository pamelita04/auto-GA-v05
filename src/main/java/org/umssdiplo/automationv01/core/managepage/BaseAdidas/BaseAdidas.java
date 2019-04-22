package org.umssdiplo.automationv01.core.managepage.BaseAdidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class BaseAdidas extends BasePage {

    @FindBy(xpath = "html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement tabHombre;

    public void clickTabHombre() {
//        CommonEvents.hoverToElement(tabHombre);
    }
}

