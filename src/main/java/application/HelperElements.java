package application;

import models.CheckBoxes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class HelperElements extends HelperBase {

    public HelperElements(WebDriver wd) {
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

    public void openCheckBoxPage() {
        click(By.xpath("//*[.='Check Box']"));
    }

    public void openAllCheckBoxes() {
        JavascriptExecutor js = (JavascriptExecutor)wd;
        js.executeScript("document.querySelector('footer').style.display='none'");
        click(By.xpath("//*[@title='Expand all']"));
    }

    public CheckBoxes chooseCheckBoxes() {
        CheckBoxes ch = CheckBoxes.builder()
                .veu(true)
                .commands(true)
                .notes(true)
                .build();
        HashMap<String, Boolean> checkBoxes = ch.getMap();
        for(String key : checkBoxes.keySet()){
            if(checkBoxes.get(key)){
                click(By.xpath("//span[@class='rct-title'][.='" + key + "']"));
            }
        }
        return ch;
    }

    public String actualResult() {
        String result = "";
        if(isElementPresent(By.cssSelector("div#result span"))) {
            List<WebElement> l = getElements(By.cssSelector("div#result span"));
            for (int i = 1; i < l.size(); i++) {
                result += l.get(i).getText();
            }
        }
        return result;
    }

    public String expectedResult(CheckBoxes ch) {
        String result = "";
        LinkedHashMap<String, Boolean> map = ch.getMapRes();
        for(String key : map.keySet()){
            System.out.println("================================");
            System.out.println(map.get(key));
            if(map.get(key)){
                if(key.equals("Word File.doc")){
                    result += "wordFile";
                }else if(key.equals("Excel File.doc")) {
                    result += "excelFile";
                } else {
                    result += key.toLowerCase();
                }
            }
        }
        return result;
    }
}
