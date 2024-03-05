package pageObjects;

import org.openqa.selenium.WebDriver;

public class FundTransferPageObject extends SideBarPageObject{
    WebDriver driver;

    public FundTransferPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
