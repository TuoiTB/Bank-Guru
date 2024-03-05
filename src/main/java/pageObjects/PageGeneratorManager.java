package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    public static NewCustomerPageObject getNewCustomerPage(WebDriver driver){
        return new NewCustomerPageObject(driver);
    }
    public static EditCustomerPageObject getEditCustomerPage(WebDriver driver){
        return new EditCustomerPageObject(driver);
    }
    public static DashBoardPageObject getDashBoardPage(WebDriver driver){
        return new DashBoardPageObject(driver);
    }
    public static DeleteCustomerPageObject getDeleteCustomerPage(WebDriver driver){
        return new DeleteCustomerPageObject(driver);
    }
    public static NewAccountPageObject getNewAccountPage(WebDriver driver){
        return new NewAccountPageObject(driver);
    }
    public static EditAccountPageObject getEditAccountPage(WebDriver driver){
        return new EditAccountPageObject(driver);
    }
    public static DeleteAccountPageObject getDeleteAccountPage(WebDriver driver){
        return new DeleteAccountPageObject(driver);
    }
    public static DepositPageObject getDepositPage(WebDriver driver){
        return new DepositPageObject(driver);
    }
    public static WithDrawalPageObject getWithDrawalPage(WebDriver driver){
        return new WithDrawalPageObject(driver);
    }
    public static ChangePasswordPageObject getChangePasswordPage(WebDriver driver){
        return new ChangePasswordPageObject(driver);
    }
    public static FundTransferPageObject getFundTransferPage(WebDriver driver){
        return new FundTransferPageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return  new LoginPageObject(driver);
    }
}
