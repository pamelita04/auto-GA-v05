package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Login.IsoCodeService;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private IsoCodeService isoCodeService;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() {
        login.setCredentials();
    }

    @Given("^'IsoCode' page is loaded$")
    public void isocodePageIsLoaded(){
        login = LoadPage.loginPage();
    }

    @And("^presionar botton 'Plus'$")
    public void presionarBottonPlus() {
        isoCodeService.clickButtonPlus();
    }

    @And("^llenar informacion \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" del item$")
    public void llenarInformacionAndAndAndAndAndAndDelItem(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        isoCodeService.llenarInfoItem(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @Then("^verificar en la lista 'Catalog'$")
    public void verificarEnLaListaCatalog() {
        isoCodeService.verificarEnLista();

    }
}
