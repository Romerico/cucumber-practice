package CucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        (features = "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\BDDCucumberTest\\Features\\DecemberBoys.feature",
        plugin ={"pretty", "html:html-output", "json:json-output", "junit:junit_xml_output/cucum.xml"},
        glue = "StepDefinitions")
public class TestRunnerDecemberBoys
{
}
