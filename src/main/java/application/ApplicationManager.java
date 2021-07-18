package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HelperTextBox helper;

    public void init(){
        wd = new ChromeDriver();
        helper = new HelperTextBox(wd);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
    }

    public void stop(){
        wd.quit();
    }

    public HelperTextBox helper(){
        return helper;
    }

}
