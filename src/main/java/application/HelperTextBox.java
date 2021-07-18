package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperTextBox extends HelperBase {

    public HelperTextBox(WebDriver wd) {
        super(wd);
    }

    public void openListOfElements() {
        click(By.xpath("//*[@class='card mt-4 top-card'][1]"));//???????????????
    }

    public void openTextBoxPage() {
        click(By.xpath("//*[.='Text Box']"));
    }

    public void fillFullNameTextBox(String fullName) {
        type(By.xpath("//*[@*='Full Name']"), fullName);
    }

    public void fillEmailTextBox(String email) {
        type(By.xpath("//*[@*='name@example.com']"), email);
    }

    public void fillCurrentAddressTextBox(String address) {
        type(By.xpath("//*[@*='Current Address']"), address);
    }

    public void fillPermanentAddressTextBox(String address) {
        type(By.xpath("//*[@*='permanentAddress']"), address);
    }

    public void clickubmitButton() {
        toPlaceTheObjectInTheMiddle(By.cssSelector("button#submit"));
        click(By.cssSelector("button#submit"));
    }

    public String resultText() {
        String s = "";
        List<WebElement> list = getElements(By.cssSelector(".border.col-md-12.col-sm-12 p"));
        for(WebElement el : list){
            s += el.getText().split(":", 2)[1];
        }
        return s;
    }
}
