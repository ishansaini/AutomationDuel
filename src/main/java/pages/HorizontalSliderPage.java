package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

    private WebDriver driver;

    @FindBy(css = ".sliderContainer input")
    private WebElement horizontalSlider;

    @FindBy(id = "range")
    private WebElement sliderValue;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void moveSliderTo(String value){
        while(!getRange().equals(value)) {
            horizontalSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRange() {
        return sliderValue.getText();
    }

}
