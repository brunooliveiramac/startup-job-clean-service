package acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = "html:report/cucumber",
        features = {"classpath:acceptance/features"}
)
public class CucumberRoot {



}
