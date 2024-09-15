package com.encora.web.page.mapeos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    /**
     * Web Elements
     */

    //  public By AccountLogin = By.xpath("//div[@class='self-center']/a");
    // public By SearchIcon = By.className("search-icon");
    public By SearchIcon = By.id("headerPanel");
    public By btnRegister = By.xpath("//div[@id='leftPanel']//a[contains(text(),'Register')]");

    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {

        super(driver);
    }


    /**
     * Methods
     */
//    public void goToSingOption() {
//        click(AccountLogin);
//    }
    public void goToSearchIcon() {
        find(SearchIcon);
    }

    public void selectButtonRegister() {
        click(btnRegister);
    }
}
