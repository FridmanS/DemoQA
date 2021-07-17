package testBase;

import application.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUPP(){
        app.init();
    }

    @AfterClass
    public void tearDown(){
        app.stop();
    }
}
