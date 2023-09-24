package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJsAlertsLink();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getAlertText(),
                "You successfully clicked an alert",
                "Incorrect message   displayed");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJsAlertsLink();

        alertsPage.triggerConfirm();
        String alertText = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(alertText,
                "I am a JS Confirm",
                "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert() {
        var alertsPage = homePage.clickJsAlertsLink();
        alertsPage.triggerPrompt();

        String text = "I am Rock!";
        alertsPage.alert_setPromptText(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getAlertText(),
                "You entered: "+ text,
                "Incorrect prompt Alert!!!");
    }
}
