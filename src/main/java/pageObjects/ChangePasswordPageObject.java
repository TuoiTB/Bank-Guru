package pageObjects;

import org.openqa.selenium.WebDriver;

public class ChangePasswordPageObject extends SideBarPageObject{
    WebDriver driver;

    public ChangePasswordPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
