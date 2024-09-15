package com.encora.web.page.mapeos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    /**
     * Web Elements
     */
    protected By InputFirstName = By.id("customer.firstName");
    protected By InputLastName = By.id("customer.lastName");
    protected By InputAddress = By.id("customer.address.street");
    protected By InputCity = By.id("customer.address.city");
    public By InputState = By.id("customer.address.state");
    public By InputZipCode = By.id("customer.address.zipCode");
    public By InputPhone = By.id("customer.phoneNumber");
    public By InputSSN = By.id("customer.ssn");

    public By InputUsername = By.id("customer.username");
    public By InputPassword = By.id("customer.password");
    public By InputConfirm = By.id("repeatedPassword");


   public By btnRegister = By.xpath("//tbody//input[@type='submit']");
    public String expected_Title_Header = "My Account";

    /**
     * Constructor
     */
    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Methods
     */

    public void createNewAccount(String fistname, String lastname, String addres,String city ,
                                 String state, String zipcode, String phone, String ssn,
                                 String username, String password , String  confirmpass) {
        type(InputFirstName, fistname);
        type(InputLastName, lastname);
        type(InputAddress, addres);
        type(InputCity, city);
        type(InputState, state);
        type(InputZipCode, zipcode);
        type(InputPhone, phone);
        type(InputSSN, ssn);
        type(InputUsername, username);
        type(InputPassword, password);
        type(InputConfirm, confirmpass);
    }

    public void hacerClickEnElBotonRegister() {
        click(btnRegister);
    }

//    public void clickSingUpButton() {
//        click(ButtonSingUp);
//    }
//
//    public String getExpectedTitle() {
//        return text(AccountTitle);
//    }
}
