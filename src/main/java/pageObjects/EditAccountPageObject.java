package pageObjects;

import org.openqa.selenium.WebDriver;

public class EditAccountPageObject extends SideBarPageObject{
    WebDriver driver;

    public EditAccountPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
