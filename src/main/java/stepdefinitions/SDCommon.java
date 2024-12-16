package stepdefinitions;

import context.TestContext;
import context.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SDCommon extends Util {

    public SDCommon(TestContext context) {
        super(context);
    }

    @Given("^Open \"([^\"]*)\" URL$")
    public void openUrl(String url){
        driver.get(url);
    }

}
