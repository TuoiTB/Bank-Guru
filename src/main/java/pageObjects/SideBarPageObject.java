package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.SideBarPageUI;

public class SideBarPageObject extends BasePage {
    WebDriver driver;
    public SideBarPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public NewCustomerPageObject newCustomerPage() {
        waitForElementClickable(driver, SideBarPageUI.NEW_CUSTOMER_LINK);
        clickToElement(driver, SideBarPageUI.NEW_CUSTOMER_LINK);
        return PageGeneratorManager.getNewCustomerPage(driver);
    }
    public EditCustomerPageObject editCustomerPage() {
        waitForElementClickable(driver, SideBarPageUI.EDIT_CUSTOMER_LINK);
        clickToElement(driver, SideBarPageUI.EDIT_CUSTOMER_LINK);
        return PageGeneratorManager.getEditCustomerPage(driver);
    }
    public DeleteCustomerPageObject deleteCustomerPage() {
        waitForElementClickable(driver, SideBarPageUI.DELETE_CUSTOMER_LINK);
        clickToElement(driver, SideBarPageUI.DELETE_CUSTOMER_LINK);
        return PageGeneratorManager.getDeleteCustomerPage(driver);
    }
    public NewAccountPageObject newAccountPage() {
        waitForElementClickable(driver, SideBarPageUI.NEW_ACCOUNT_LINK);
        clickToElement(driver, SideBarPageUI.NEW_ACCOUNT_LINK);
        return PageGeneratorManager.getNewAccountPage(driver);
    }
    public EditAccountPageObject editAccountPage() {
        waitForElementClickable(driver, SideBarPageUI.EDIT_ACCOUNT_LINK);
        clickToElement(driver, SideBarPageUI.EDIT_ACCOUNT_LINK);
        return PageGeneratorManager.getEditAccountPage(driver);
    }
    public DeleteAccountPageObject deleteAccountPage() {
        waitForElementClickable(driver, SideBarPageUI.DELETE_ACCOUNT_LINK);
        clickToElement(driver, SideBarPageUI.DELETE_ACCOUNT_LINK);
        return PageGeneratorManager.getDeleteAccountPage(driver);
    }
    public DepositPageObject depositPage() {
        waitForElementClickable(driver, SideBarPageUI.DEPOSIT_LINK);
        clickToElement(driver, SideBarPageUI.DEPOSIT_LINK);
        return PageGeneratorManager.getDepositPage(driver);
    }
    public WithDrawalPageObject withDrawalPage() {
        waitForElementClickable(driver, SideBarPageUI.WITHDRAWAL_LINK);
        clickToElement(driver, SideBarPageUI.WITHDRAWAL_LINK);
        return PageGeneratorManager.getWithDrawalPage(driver);
    }
}
