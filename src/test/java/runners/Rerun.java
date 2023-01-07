package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "rerun:target/rerun2.txt",
        features = "@target/rerun.txt",
        glue = "steps"
)
public class Rerun {
}
