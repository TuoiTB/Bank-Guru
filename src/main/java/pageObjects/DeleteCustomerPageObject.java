package pageObjects;

import org.openqa.selenium.WebDriver;

public class DeleteCustomerPageObject extends SideBarPageObject{
    WebDriver driver;

    public DeleteCustomerPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
