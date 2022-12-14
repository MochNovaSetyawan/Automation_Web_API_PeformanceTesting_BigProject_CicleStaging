package MyStepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page.teamPage;

public class teamTest {

    public WebDriver driver;

    public teamTest() {
        super();
        this.driver=bypass.driver;
    }
    teamPage TeamPage = new teamPage();
    @Given("User click nova team")
    public void userClickNovaTeam() throws InterruptedException {
        Thread.sleep(2000);
        TeamPage.Clicknovateambutton();
    }
}
