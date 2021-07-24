package application;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HelperElements helperElements;

    public void init(){
        wd = new ChromeDriver();
        helperElements = new HelperElements(wd);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
    }

    public void stop(){
        wd.quit();
    }

    public HelperElements helperElements(){
        return helperElements;
    }

}
