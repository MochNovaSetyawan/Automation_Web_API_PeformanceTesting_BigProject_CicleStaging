package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/BigProject-Web-GroupchatPositive.json",
                "html:target/cucumber-reports/BigProject-Web-GroupchatPositive.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue ={"MyStepdefs"},
        monochrome = true,
        dryRun = false,
        tags = "@GroupchatPositive"
)

public class TestRunner {
}
