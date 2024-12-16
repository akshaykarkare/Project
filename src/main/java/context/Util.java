package context;

import org.openqa.selenium.WebDriver;

public class Util{
    public TestContext testContext;
    public WebDriver driver;

    public Util(TestContext context){
        testContext = context;
        driver = testContext.getDriver();
    }
}
