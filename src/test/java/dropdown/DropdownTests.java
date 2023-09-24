package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdownLink();

        String option = "Option 1";
        dropdownPage.selectFromDropdown("Option 1");
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(
                selectedOptions.size(),
                1,
                "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
