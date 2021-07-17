package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helper extends HelperBase {

    public Helper(WebDriver wd) {
        super(wd);
    }

    public void openListOfElements() {
        click(By.xpath("//path[@d='M16']"));//???????????????
    }

    public void openTextBoxPage() {
        click(By.xpath("//div[@class='element-group'][1]//li[@id='item-0']"));
    }

    public void fillFullNameTextBox(String fullName) {
    }

    public void fillEmailTextBox(String email) {
    }

    public void fillCurrentAddressTextBox(String address) {
    }

    public void fillPermanentAddressTextBox(String address) {
    }
}
