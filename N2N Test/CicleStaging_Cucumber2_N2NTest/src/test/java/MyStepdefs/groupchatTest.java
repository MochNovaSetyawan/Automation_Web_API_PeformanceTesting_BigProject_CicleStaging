package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.groupchatPage;

public class groupchatTest {

    public WebDriver driver;
    public groupchatTest() {
        super();
        this.driver=bypass.driver;
    }
    groupchatPage GroupchatPage = new groupchatPage();

    @When("User click groupchat box menu")
    public void userClickGroupchatBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Clickgroupchatboxmenu();
    }

    @And("User type chat")
    public void userTypeChat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Typechat();
    }

    @And("User send chat")
    public void userSendChat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Sendchat();
    }

    @Then("User successfully send chat in groupchat")
    public void userSuccessfullySendChatInGroupchat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Verifysendchat();
    }

    @And("User type @ in chat")
    public void userTypeInChat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Typementionchat();
    }

    @And("User click mention user")
    public void userClickMentionUser() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Clickmentionuser();
    }

    @Then("User successfully send mention in groupchat")
    public void userSuccessfullySendMentionInGroupchat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Verifysendmention();
    }

    @And("User click menu message")
    public void userClickMenuMessage() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Clickmenuoption();
    }

    @And("User click delete message")
    public void userClickDeleteMessage() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Deletemessage();

    }

    @And("User click delete button")
    public void userClickDeleteButton() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Deletebutton();
    }

    @Then("User successfully delete chat in groupchat")
    public void userSuccessfullyDeleteChatInGroupchat() throws InterruptedException {
        Thread.sleep(2000);
        GroupchatPage.Verifydeletechat();
    }

}
