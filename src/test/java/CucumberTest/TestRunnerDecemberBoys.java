package CucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\BDDCucumberTest\\Features\\DecemberBoys.feature",
        glue = "StepDefinitions"
)
public class TestRunnerDecemberBoys
{
}
