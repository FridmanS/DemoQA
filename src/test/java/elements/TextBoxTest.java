package elements;

import models.Person;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TextBoxTest extends TestBase {

    @Test
    public void textBoxTestPositive(){
        Person p = new Person();
        app.helperElements().closeBunner();
        app.helperElements().openListOfElements();
        app.helperElements().openTextBoxPage();
        app.helperElements().fillFullNameTextBox(p.getFullName());
        app.helperElements().fillEmailTextBox(p.getEmail());
        app.helperElements().fillCurrentAddressTextBox(p.getAddress());
        app.helperElements().fillPermanentAddressTextBox(p.getAddress());
        app.helperElements().clickubmitButton();

        Assert.assertEquals(app.helperElements().resultText(), p.getFullName() + p.getEmail() +
                p.getAddress() + p.getAddress());
    }

}
