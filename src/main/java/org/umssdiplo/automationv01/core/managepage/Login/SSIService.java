package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

//import static org.umssdiplo.automationv01.core.utils.c.*;

public class SSIService extends BasePage {
    public static final String MYPATH_INPUT_CONTAINS_TEXT_S = "//mypath/input[contains(text(), '%s')]";
    //    @FindBy(name = "email")
    @FindBy(xpath = "//input[@type='text']")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(id = "qa-test-lightbox-login")
    private WebElement registrarMaquinariaTab;

    @FindBy(xpath = "")
    private WebElement elementoSelect;

    @FindBy(id = "button-fab")
    private WebElement buttonAdd;

    @FindBy(id = "button-save")
    private WebElement buttonSave;

    @FindBy(id = "button-back")
    private WebElement buttonBack;

    @FindBy(id = "button-detail")
    private WebElement buttonDetail;

    @FindBy(id = "button-catalog")
    private WebElement buttonCatalog;

    @FindBy(id = "mat-input-0")
    private WebElement inputModelo;

    @FindBy(id = "mat-select-1")
    private WebElement selectMarca;

    @FindBy(id = "mat-select-2")
    private WebElement selectCategoria;

    @FindBy(id = "mat-input-1")
    private WebElement inputPotencia;

    @FindBy(id = "mat-radio-2")
    private WebElement radioEstado;

    @FindBy(id = "mat-input-2")
    private WebElement inputCantidad;

    @FindBy(id = "mat-input-3")
    private WebElement inputPrecio;


    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public void eliminarRegistro(String abc) {
        CommonEvents.clickButton(elementoSelect);

        By by = By.xpath(String.format(MYPATH_INPUT_CONTAINS_TEXT_S, abc));
        CommonEvents.clickElement(by);
    }

    public void clickButtonAdd() {
        CommonEvents.clickButton(buttonAdd);
    }

    public void redirectCatalog() {
        CommonEvents.clickButton(buttonCatalog);
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

    public void verificarRegistro() {
        CommonEvents.clickButton(buttonBack);
    }

    public void clickButtonViewDetailItem() {
        CommonEvents.clickButton(buttonDetail);
    }

//    public RegistrarMarquinaria clickRegistrarMaquinariTab() {
//        clickButton(registrarMaquinariaTab);
//        return new RegistrarMarquinaria();
//    }
}
