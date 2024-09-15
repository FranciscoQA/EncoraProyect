package com.encora.runner;


import com.encora.evershop.logs.Log;
import com.encora.web.page.mapeos.*;
import com.encora.web.utils.Variables;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Locale;
import java.util.NoSuchElementException;


public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected HomePage homePage;
    protected CheckoutPage checkoutPage;
    public Faker faker;
    public JavascriptExecutor js;
    public Actions actions;
    public Variables variables;



    @BeforeTest
    public void loadSettings() {
        Log.info("Loading Base Url for all testing");
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(Variables.BASE_URL);
        faker = new Faker(new Locale("en-US"));
        actions = new Actions(driver);
        Log.info("Initializing Page Object Model");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver, actions);
        js = (JavascriptExecutor) driver;


    }

    @AfterMethod
    public void teardown() {
        Log.info("Closing the driver instance");
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
