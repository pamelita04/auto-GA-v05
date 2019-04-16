package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IsoCodeService extends BasePage {

    @FindBy(id = "button-fab")
    private WebElement buttonAdd;

    @FindBy(id = "button-save")
    private WebElement buttonSave;

    @FindBy(id = "button-back")
    private WebElement buttonBack;

    @FindBy(id = "button-detail")
    private WebElement buttonDetail;

    @FindBy(id = "tab-catalog")
    private WebElement tabCatalog;

    @FindBy(id = "button-delete")
    private WebElement buttonDelete;

    @FindBy(id = "button-add-image")
    private WebElement buttonAddImage;

    @FindBy(id = "mat-input-0")
    private WebElement inputModelo;

    @FindBy(id = "mat-select-1")
    private WebElement selectMarca;

    @FindBy(id = "mat-select-2")
    private WebElement selectCategoria;

    @FindBy(id = "filter-select")
    private WebElement filterSelect;

    @FindBy(id = "mat-input-1")
    private WebElement inputPotencia;

    @FindBy(id = "mat-radio-2")
    private WebElement radioEstado;

    @FindBy(id = "mat-input-2")
    private WebElement inputCantidad;

    @FindBy(id = "mat-input-3")
    private WebElement inputPrecio;

    public void clickButtonPlus() {
        CommonEvents.clickButton(buttonAdd);
    }

    public void llenarInfoItem(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        CommonEvents.setInputField(inputModelo, arg0);
        CommonEvents.setInputFieldSelect(selectMarca, arg1);
        CommonEvents.setInputFieldSelect(selectCategoria, arg2);
        CommonEvents.setInputField(inputPotencia, arg3);
        CommonEvents.clickButton(radioEstado);
        CommonEvents.setInputField(inputCantidad, arg5);
        CommonEvents.setInputField(inputPrecio, arg6);

        CommonEvents.clickButton(buttonSave);
    }

    public void verificarEnLista() {
        CommonEvents.clickButton(buttonBack);
    }
}

