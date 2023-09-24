package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testMoveSliderToFour() {
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.moveSliderTo("4");

        assertEquals(horizontalSliderPage.getRange(),
                "4",
                "Incorrect value");
    }
}
