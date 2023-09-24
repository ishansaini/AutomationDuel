package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class KeysTest extends BaseTests {

    @Test
    public void testKeys() {
        var keysPage = homePage.clickKeyPressesLink();

        keysPage.enterText("A" + Keys.BACK_SPACE);

        assertEquals(keysPage.getResult(),
                "You entered: BACK_SPACE",
                "Some other key is pressed");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterPi();
    }
}
