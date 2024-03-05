package pageObjects;

import org.openqa.selenium.WebDriver;

public class DepositPageObject extends SideBarPageObject{
    WebDriver driver;

    public DepositPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
