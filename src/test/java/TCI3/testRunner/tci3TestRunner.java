package TCI3.testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/Features",
        glue = {"TCI3.StepsDefinitions"},
        tags = { "@login or @search or @add or @edit or @delete" }
)

@RunWith(CucumberSerenityRunner.class)
public class tci3TestRunner {
}
