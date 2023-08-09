package TestRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="..\\CucumberJavaDemo\\Feature", 
glue= {"StepDefinition"}, 
plugin = {"pretty", "junit:target/JUnitReports/report/xml"}
)
public class runner {

}


