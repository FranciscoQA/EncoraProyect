package com.encora.web.step;

import com.encora.runner.BaseTest;
import com.encora.web.page.mapeos.BasePage;
import com.encora.web.utils.Variables;
import com.github.javafaker.Faker;
import net.serenitybdd.annotations.Step;


import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.Locale;
import java.util.NoSuchElementException;

public class ParaBankStep extends BaseTest{

@Page
    private BasePage basePage;


    @Step("Abrir la pagina")
    public void openLoginPage(){
        setup();
    }
    @Step("Le hace click en el boton Register")
    public void laPaginaEsteAbiertaRealizoClickEnRegister() {
        Assert.assertTrue(homePage.isDisplayed(homePage.SearchIcon));
        homePage.selectButtonRegister();
    }

    public void ingresoDatosAleatoriiosEnElFormulario() {

        Faker faker = new Faker(new Locale("en-US"));

        String firstname= faker.name().firstName();
        String lastname= faker.name().lastName();
        String addres= faker.address().streetAddress();
        String city= faker.address().cityName();
        String state= faker.address().state();
        String zipcode= faker.address().zipCode();
        String phone= faker.phoneNumber().phoneNumber();
        String ssn= faker.number().digits(9);

        String username= firstname+faker.number().digits(3);
        String password= lastname+faker.number().digits(3);
        Variables.usernameFinal=username;
        Variables.passwordFinal=password;

        registerPage.createNewAccount(firstname,lastname,addres,city,state,zipcode,phone,ssn,username,password, password);


    }

    public void hacerClickEnElBotonRegister() {
        registerPage.isDisplayed(registerPage.btnRegister);
        registerPage.hacerClickEnElBotonRegister();

    }

    public void validoQueSeDespliegaElMensajeExitoso(String sMensaje) {
        registerPage.isDisplayed(checkoutPage.validationMensajeExitoso);
        Assert.assertTrue(checkoutPage.verificacionMessages(sMensaje));

    }

    public void ingresoConLaCuentaGenerada() {
        loginPage.fillOutFormLogin(Variables.usernameFinal,Variables.passwordFinal);
        loginPage.clickLoginButton();
        System.out.println(Variables.usernameFinal);
        System.out.println(Variables.passwordFinal);
    }
}
