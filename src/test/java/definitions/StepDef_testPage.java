package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.testPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDef_testPage {
    testPage testPage;

    @Given("I am on test page")
    public void onTestPage(){
        testPage.open();
    }

    @Then("Element is {string}")
    public void elementIs(String element){
        assertEquals(element, testPage.getElementText());
    }

}
