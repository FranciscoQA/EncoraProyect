package com.encora.web.stepdefinition;

import com.encora.web.step.ParaBankStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

public class ParaBankStepDefinition {

    @Steps
    private ParaBankStep paraBankStep;
    @Dado("que ingreso a la pagina Para Bank")
    public void inicioSesionPaginaParaBank() {
        paraBankStep.openLoginPage();
    }

    @Cuando("la pagina este abierta realizo click en register")
    public void laPaginaEsteAbiertaRealizoClickEnRegister()  {
        paraBankStep.laPaginaEsteAbiertaRealizoClickEnRegister();
    }

    @Y("ingreso datos aleatorios en el formulario")
    public void ingresoDatosAleatoriosEnElFormulario() {
        paraBankStep.ingresoDatosAleatoriiosEnElFormulario();
    }

    @Y("hacer click en el boton register")
    public void hacerClickEnElBotonRegister() {
        paraBankStep.hacerClickEnElBotonRegister();
    }

    @Entonces("valido que se despliega el mensaje exitoso {string}")
    public void validoQueSeDespliegaElMensajeExitoso(String sMensaje) {
        paraBankStep.validoQueSeDespliegaElMensajeExitoso(sMensaje);
    }

    @Y("ingreso con la cuenta generada")
    public void ingresoConLaCuentaGenerada() {
        paraBankStep.ingresoConLaCuentaGenerada();

    }
}
