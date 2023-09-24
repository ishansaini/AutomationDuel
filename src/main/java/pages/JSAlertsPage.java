package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSAlertsPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement triggerAlertButton;

    @FindBy(id = "result")
    private WebElement alertMessage;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    private WebElement triggerConfirmButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    private WebElement triggerPromptButton;

    public JSAlertsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void triggerAlert() {
        triggerAlertButton.click();
    }

    public void triggerConfirm() {
        triggerConfirmButton.click();
    }

    public void triggerPrompt() {
        triggerPromptButton.click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void alert_setPromptText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public String getAlertText() {
        return alertMessage.getText();
    }
}
