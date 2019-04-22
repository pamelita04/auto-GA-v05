package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.BaseAdidas.BaseAdidas;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepDefPuma {
    private Login login;
    private BaseAdidas basePage;


    @Given("^'www.adidas.mx' page is loaded$")
    public void wwwAdidasMxPageIsLoaded() {
        login = LoadPage.loginPage();
    }

    @And("^click tab 'Hombre'$")
    public void clickTabHombre() {
        login.clickTabHombre();
    }
}

