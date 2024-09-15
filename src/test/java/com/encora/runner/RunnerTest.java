package com.encora.runner;


import com.encora.web.page.ParaBankPage;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.annotations.events.BeforeExample;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.fluentlenium.core.annotation.Page;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeMethod;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"com.encora.web.stepdefinition"},
        tags = "@EnrolamientoParaBankCreateNewLogin"
)
public class RunnerTest extends BaseTest {

    @Page
    private BaseTest paraBankPage;

    @AfterScenario
    public void tearDown() {
        if (paraBankPage.getDriver() != null) {
            paraBankPage.getDriver().quit();
        }

    }

}

