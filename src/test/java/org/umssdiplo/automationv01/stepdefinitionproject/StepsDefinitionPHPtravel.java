package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.SSIService;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private SSIService ssiService;

    @Given("^'SisSecurity' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        ssiService = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        ssiService.setCredentials();
        ssiService.eliminarRegistro("abc");
    }

    @And("^click 'Registrar Maquinaria' tab in 'Header' page$")
    public void clickRegistrarMaquinariaTabInHeaderPage() throws Throwable {
//        ssiService.clickRegistrarMaquinariTab();
    }

    @And("^fill \"([^\"]*)\" nombre maquinaria campo en 'Formulario Maquina' form$")
    public void fillNombreMaquinariaCampoEnFormularioMaquinaForm(String nombreMaquinaria) throws Throwable {

    }

    @Then("^verificar que \"([^\"]*)\" esta desplago en 'Lista de Maquinarias' tabla$")
    public void verificarQueEstaDesplagoEnListaDeMaquinariasTabla(String nombreMaquinariaExperado) throws Throwable {
//        String nombreMaquinariaActual = nombreObjectoTable.getNombreTableInsertada();

//        Assert.assertEquals(nombreMaquinariaActual, nombreMaquinariaExperado);
    }

    @Given("^'IsoCode' page is loaded$")
    public void isocodePageIsLoaded() {
        ssiService = LoadPage.loginPage();
    }

    @And("^choose option one click 'Ver detalle' on card item$")
    public void chooseOptionOneClickVerDetalleOnCardItem() {
        ssiService.clickButtonViewDetailItem();
    }

    @And("^choose option one click 'Catalog'$")
    public void chooseOptionOneClickCatalog() {
        ssiService.redirectCatalog();
    }

    @And("^presionar botton 'Plus'$")
    public void presionarBottonPlus() {
        ssiService.clickButtonAdd();
    }


    @And("^llenar informacion \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" del item$")
    public void llenarInformacionDelItem(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ssiService.llenarInfoItem(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @Then("^verificar el registro del item$")
    public void verificarElRegistroDelItem() {
        ssiService.verificarRegistro();
    }
}
