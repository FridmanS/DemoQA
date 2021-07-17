package elements;

import models.Person;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TextBoxTest extends TestBase {

    @Test
    public void textBoxTestPositive(){
        Person p = new Person();
        app.helper().openListOfElements();
        app.helper().openTextBoxPage();
        app.helper().fillFullNameTextBox(p.getfName() + " " + p.getlName());
        app.helper().fillEmailTextBox(p.getEmail());
        app.helper().fillCurrentAddressTextBox(p.getAddress());
        app.helper().fillPermanentAddressTextBox(p.getAddress());

    }

}
