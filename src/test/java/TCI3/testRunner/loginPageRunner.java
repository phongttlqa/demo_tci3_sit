package TCI3.testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/Features/01_Login.feature",
        glue = {"TCI3.StepsDefinitions"},
        tags = { "@login" }
)

@RunWith(CucumberSerenityRunner.class)
public class loginPageRunner {
}
