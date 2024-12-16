package context;

import org.openqa.selenium.WebDriver;

public class TestContext {

    public WebDriver driver;
    public WebDriverManager driverManager;
    public TestContext(){
        driverManager = new WebDriverManager();
    }

    public WebDriver getDriver(){
        driver = driverManager.getDriver();
        return driver;
    }

}
