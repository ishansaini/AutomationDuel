package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
    driver.get("https://the-internet.herokuapp.com");
    }

    public void navigateToNSE() {
        driver.get("https://www.nseindia.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
