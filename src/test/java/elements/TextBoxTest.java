package elements;

import models.Person;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TextBoxTest extends TestBase {

    @Test
    public void textBoxTestPositive(){
        Person p = new Person();
        app.helper().closeBunner();
        app.helper().openListOfElements();
        app.helper().openTextBoxPage();
        app.helper().fillFullNameTextBox(p.getFullName());
        app.helper().fillEmailTextBox(p.getEmail());
        app.helper().fillCurrentAddressTextBox(p.getAddress());
        app.helper().fillPermanentAddressTextBox(p.getAddress());
        app.helper().clickubmitButton();

        Assert.assertEquals(app.helper().resultText(), p.getFullName() + p.getEmail() +
                p.getAddress() + p.getAddress());
    }

}
