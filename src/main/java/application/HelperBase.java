package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    public void type(By locator, String text){
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size() > 0;
    }

    public String getText(By locator){
        return wd.findElement(locator).getText();
    }

    public void pause(long millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void waitForElementPresent(long timeout, By locator){
        new WebDriverWait(wd, timeout).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
