package pageObjects;

import org.openqa.selenium.WebDriver;

public class WithDrawalPageObject extends SideBarPageObject{
    WebDriver driver;

    public WithDrawalPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
