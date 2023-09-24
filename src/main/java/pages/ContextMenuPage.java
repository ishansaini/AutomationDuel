package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {

    private WebDriver driver;

    @FindBy(id = "hot-spot")
    private WebElement contextArea;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void rightClickOnContextArea() {
        Actions actions = new Actions(driver);
        actions.moveToElement(contextArea).contextClick().perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_Accept() {
        driver.switchTo().alert().accept();
    }
}
