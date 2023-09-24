package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailField = By.id("email");

    private By retrievePasswordBtn = By.id("form_submit");

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrievePassword() {
        driver.findElement(retrievePasswordBtn).click();
    }
}
