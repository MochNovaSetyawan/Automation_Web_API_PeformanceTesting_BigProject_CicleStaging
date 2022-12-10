package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/BigProject-Web-BlashNegative.json",
                "html:target/cucumber-reports/BigProject-Web-BlashNegative.html"},

        features = "src/test/resources/features",
        glue ={"MyStepdefs"},
        tags = "@BlashNegative"
)

public class TestRunner {
}
