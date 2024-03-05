package pageObjects;

import org.openqa.selenium.WebDriver;

public class EditCustomerPageObject extends SideBarPageObject{
    WebDriver driver;

    public EditCustomerPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
