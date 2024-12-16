import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdefinitions"},
        plugin = {"html:target/cucumber-reports/htmlReports.html","json:target/cucumber-reports/cucumber.json","rerun:target/rerun.txt"},
        tags = "@demo",
        monochrome = true
)
public class TestJunitRunner {
}
