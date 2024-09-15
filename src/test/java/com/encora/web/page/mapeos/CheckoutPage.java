package com.encora.web.page.mapeos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class CheckoutPage extends BasePage{


    Actions actions;
    /**
     * Web Elements
     */
    public By validationMensajeExitoso = By.xpath("//div[@id='rightPanel']//p");


    /**
     * Constructor
     */
    public CheckoutPage(WebDriver driver, Actions actions) {
        super(driver);
        this.actions = actions;
    }


    /**
     * Methods
     */
    public String getExpectedMessages(){
        return text(validationMensajeExitoso);
    }


    public boolean verificacionMessages(String valorMessages) {
       boolean validate= false;
        System.out.println(validationMensajeExitoso.toString());
        System.out.println(valorMessages);
        if (text(validationMensajeExitoso).toLowerCase(Locale.ROOT).contains
                (valorMessages.toLowerCase(Locale.ROOT))) {
           validate =true;
        }
      return validate;
    }
}
