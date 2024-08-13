package com.testing.moviles.app.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/java/features/compra.feature"
        ,tags = "@Compra"
        ,glue = "com.testing.moviles.app.stepsdefinition"
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}

