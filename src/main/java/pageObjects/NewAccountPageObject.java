package pageObjects;

import org.openqa.selenium.WebDriver;

public class NewAccountPageObject extends SideBarPageObject{
    WebDriver driver;

    public NewAccountPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
