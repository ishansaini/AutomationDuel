package alerts;

import base.BaseTests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenuLink();

        contextMenuPage.rightClickOnContextArea();

        assertEquals(contextMenuPage.alert_getText(),
                "You selected a context menu",
                "Incorrect Context Menu Pop up");
        contextMenuPage.alert_Accept();
    }
}
