package CucuRunn;


import hooks.BaseMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/featuress", 
					glue = { "stepdef", "hooks" }, 
					monochrome = true, publish = true,
					tags="@Sanity"
					)
public class Runnerr extends BaseMethod {

}
