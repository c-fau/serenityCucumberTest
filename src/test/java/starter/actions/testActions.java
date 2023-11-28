package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import starter.pageObjects.testPage;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class testActions extends UIInteractionSteps {

    @FindBy(css = "#W0wltc > div:nth-chilld(1)")
    WebElement elementText;
    @Step
    public String getElementText(){
        return elementText.getText();

    }
}
