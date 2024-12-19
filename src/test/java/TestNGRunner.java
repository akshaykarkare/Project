import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdefinitions"},
        plugin = {"html:target/cucumber-reports/htmlReports.html","json:target/cucumber-reports/cucumber.json","rerun:target/rerun.txt"},
        tags = "@demo",
        monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
