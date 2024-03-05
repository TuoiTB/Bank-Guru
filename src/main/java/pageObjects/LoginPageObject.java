package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class LoginPageObject extends BasePage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public DashBoardPageObject loginToSystem(String userNameLogin, String passwordLogin) {
        waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, userNameLogin);
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordLogin);
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return new DashBoardPageObject(driver);
    }

}
