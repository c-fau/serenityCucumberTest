package starter.pageObjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitElementFinder;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class testPage extends PageObject {

    //@FindBy(css ="#W0wltc > div:nth-child(1)")
    public static final By TEST_ELEMENT = By.cssSelector("#W0wltc > div:nth-chilld(1)");



}
