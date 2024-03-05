package pageObjects;

import org.openqa.selenium.WebDriver;
import pageUI.NewCustomerPageUI;

public class NewCustomerPageObject extends SideBarPageObject {
    WebDriver driver;

    public NewCustomerPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void pressTabCustomerName() {
        waitForElementClickable(driver, NewCustomerPageUI.CUSTOMER_NAME);
        clickToElement(driver, NewCustomerPageUI.CUSTOMER_NAME);
        TABKeyBoard(driver);
    }

    public boolean isErrorMessageDisplayed() {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_ERROR_MSG);
        return isElementDisplayed(driver, NewCustomerPageUI.CUSTOMER_NAME_ERROR_MSG);
    }

    public void closeAdPopup() {
        waitForElementPresence(driver, NewCustomerPageUI.IFRAME_AD);
        switchToFrame(driver, NewCustomerPageUI.IFRAME_AD);
        clickToElementByJS(driver, NewCustomerPageUI.CLOSE_AD);
        switchToDefaultContent(driver);
    }
}