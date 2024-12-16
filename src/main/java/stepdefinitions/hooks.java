package stepdefinitions;

import context.TestContext;
import context.Util;
import io.cucumber.java.After;

public class hooks extends Util {

    public hooks(TestContext context) {
        super(context);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
