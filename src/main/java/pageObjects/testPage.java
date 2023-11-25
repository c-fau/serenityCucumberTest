package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testPage extends PageObject {

    @FindBy(css = "#W0wltc > div:nth-child(1)")
    WebElement testElement;
    public String getElementText(){
        return testElement.getText();
    }


}
