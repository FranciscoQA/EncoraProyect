package com.encora.web.page.mapeos;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    /**
     * Web Elements
     */
    protected By InputUserName = By.name("username");
    protected By InputPassword = By.name("password");
    protected By ButtonLogin = By.xpath("//div[@class='login']//input[@type='submit']");
//    protected By LinkRegister = By.linkText("Create an account");
//    public By LinkLogout = By.linkText("Logout");

    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Methods
     */
//    public void goToRegisterNewAccount() {
//        click(LinkRegister);
//    }

    public void fillOutFormLogin(String username, String password) {
        type(InputUserName, username);
        type(InputPassword, password);
    }

    public void clickLoginButton() {
        click(ButtonLogin);
    }

}
