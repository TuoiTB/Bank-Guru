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
import pageObjects.PageGeneratorManager;
import utitlities.DataFaker;

@Epic("Customer")
@Feature("Create Customer")
public class Verify_Name_Field extends BaseTest{
        private WebDriver driver;
        private String userNameLogin = "mngr556112";
        private String passwordLogin = "AgavUjU";
        @Parameters({"browser","url"})
        @BeforeClass
        public void beforeClass(String browserName, String url) {
            driver = getBrowserDriver(browserName, url);
            loginPage = PageGeneratorManager.getLoginPage(driver);
            loginPage.loginToSystem(userNameLogin,passwordLogin);

        }
        @Description("TC_01")
        @Story("Add Employee")
        @Test
        public void PIM_01_Add_Employee() {
            log.info("PIM_01 - Step 01: Open PIM link at menu");
            dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
            dashBoardPage.openPIMPage();

        }
        @AfterClass(alwaysRun = true)
        public void afterClass() {
            //quitBrowserDriver();
        }
    }

}
