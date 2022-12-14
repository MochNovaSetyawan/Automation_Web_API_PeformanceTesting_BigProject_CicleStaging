package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static MyStepdefs.bypass.driver;

public class teamPage {

    public teamPage() {

        PageFactory.initElements(driver,this);
    }
    By novateambutton = By.xpath("//*[@class=\"DashboardPage_container__2bMGZ\"]/div[4]/a[last()]");

    public void Clicknovateambutton() {
        driver.findElement(novateambutton).click();
    }
}
