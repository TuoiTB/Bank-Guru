package NewCustomer;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.DashBoardPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewCustomerPageObject;
import pageObjects.PageGeneratorManager;

@Epic("Customer")
@Feature("Create Customer")
public class NewCustomer_02_Verify_Name_Field extends BaseTest {
    private WebDriver driver;
    private final String userNameLogin = "mngr556112";
    private final String passwordLogin = "AgavUjU";
    DashBoardPageObject dashBoardPage;
    LoginPageObject loginPage;
    NewCustomerPageObject newCustomerPage;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.loginToSystem(userNameLogin, passwordLogin);
        dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
        newCustomerPage = dashBoardPage.newCustomerPage();
        newCustomerPage.closeAdPopup();
    }

    @Description("TC_01")
    @Story("Add Employee")
    @Test
    public void Name_cannot_be_empty() {
        log.info("Step 01: Do not enter a value in NAME field");

        log.info("Step 02: Press TAB and move to next field");
        newCustomerPage.pressTabCustomerName();
        log.info("Step 03: Verify error message");
        verifyTrue(newCustomerPage.isErrorMessageDisplayed());
    }

    public void Name_cannot_be_numeric() {
        log.info("Step 01: Open PIM link at menu");


    }

    public void Name_cannot_have_special_characters() {
        log.info("Step 01: Open PIM link at menu");


    }

    public void Name_cannot_have_first_characters_as_blank_space() {
        log.info("Step 01: Open PIM link at menu");


    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }
}
