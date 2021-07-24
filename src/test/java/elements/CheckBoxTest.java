package elements;

import models.CheckBoxes;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class CheckBoxTest extends TestBase {

    @Test
    public void checkBoxTestPositive(){
        app.helperElements().closeBunner();
        app.helperElements().openListOfElements();
        app.helperElements().openCheckBoxPage();
        app.helperElements().openAllCheckBoxes();
        CheckBoxes ch = app.helperElements().chooseCheckBoxes();
        app.helperElements().pause(5000);
        Assert.assertEquals(app.helperElements().actualResult(), app.helperElements().expectedResult(ch));

    }

}
