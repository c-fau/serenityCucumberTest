package starter.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.actions.testActions;
import starter.pageObjects.testPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDef_testPage {
    testActions testActions;
    testPage testPage;

    @Given("I am on test page")
    public void onTestPage(){
        testPage.open();
    }

    @Then("Element is {string}")
    public void elementIs(String element){
        testPage.open();
        assertEquals(element, testActions.getElementText());
    }

}
