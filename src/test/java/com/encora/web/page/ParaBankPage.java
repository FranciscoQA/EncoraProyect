package com.encora.web.page;

import com.encora.web.page.mapeos.BasePage;
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")

public class ParaBankPage extends BasePage {


    public ParaBankPage(WebDriver driver) {
        super(driver);
    }
}
