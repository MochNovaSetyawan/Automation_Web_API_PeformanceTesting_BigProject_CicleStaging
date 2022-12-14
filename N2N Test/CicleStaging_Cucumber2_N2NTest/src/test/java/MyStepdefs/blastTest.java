package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.blastPage;

public class blastTest {

    public WebDriver driver;
    public blastTest() {
        super();
        this.driver=bypass.driver;
    }
    blastPage BlastPage = new blastPage();

    @When("User click blast box menu")
    public void userClickBlastBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickblashboxmenu();
    }

    @And("User click create blast button")
    public void userClickCreateBlastButton() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcreateblashbutton();
    }

    @And("User type a title blast")
    public void userTypeATitleBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typetitleblash();
    }

    @And("User type a description blast")
    public void userTypeADescriptionBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typedescriptionblash();
    }

    @And("User click publish button")
    public void userClickPublishButton() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickpublishbutton();
    }

    @Then("User can see the result of create new blast")
    public void userCanSeeTheResultOfCreateNewBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifycreateblash();
    }

    //EDIT BLASH
    @And("User choose blast")
    public void userChooseBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Chooseblash();
    }

    @And("User click dot three icon")
    public void userClickDotThreeIconInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickdot3icon();
    }

    @And("User click edit")
    public void userClickEdit() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickeditbuttoninblash();
    }

    @And("User type edit a title blast")
    public void userTypeEditATitleBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typeedittitle();
    }

    @And("User type edit a description blast")
    public void userTypeEditADescriptionBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typeeditdescription();
    }

    @And("User click save changes")
    public void userClickSaveChanges() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clicksavechangesinblash();
    }


    @Then("User can see the result of edit blast")
    public void userCanSeeTheResultOfEditBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.VerifyEditblash();
    }


    @And("User type comment")
    public void userTypeComment() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typecommentinblash();
    }

    @And("User click post button")
    public void userClickPost() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickpostinblash();
    }

    @Then("User successfully add comment in blast")
    public void userSuccessfullyAddCommentInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyaddcomment();
    }

    @And("User click cheers in blast")
    public void userClickCheersInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcheersinblash();
    }

    @And("User type cheers in blast")
    public void userTypeCheersInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typecheersinblash();
    }

    @And("User click checklist button")
    public void userClickChecklistButton() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcheklistbutton();
    }

    @Then("User successfully cheers in blast")
    public void userSuccessfullyCheersInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyaddcheers();
    }

    @And("User click dot three icon comment in blast")
    public void userClickDotThreeIconCommentInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickdot3commentinblash();
    }

    @And("User type edit a comment blast")
    public void userTypeEditACommentBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Typeeditcommentblash();

    }

    @Then("User can see the result of edit comment in blast")
    public void userCanSeeTheResultOfEditCommentInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyeditcommentinblast();
    }

    @Then("User cant create blash without title")
    public void userCantCreateBlashWithoutTitle() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.VerifycreateBlashwithouttitle();
    }

    @And("User click plus button in blast")
    public void userClickPlusButtonInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickplusbuttoninblash();
    }

    @And("User add member in blast")
    public void userAddMemberInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Addmemberinblash();
    }

    @And("User click done in blast")
    public void userClickDoneInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickdoneinblash();
    }

    @Then("User can add sucriber in blast")
    public void userCanAddSucriberInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyeditsubcriber();
    }


    @And("User click set due date manually")
    public void userClickSetDueDateManually() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clicksetdoudatemanualy();
    }

    @And("User click complete post")
    public void userClickCompletePost() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcompletepost();
    }

    @Then("User successfully edit complete post")
    public void userSuccessfullyEditCompletePost() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyeditcompletepost();
    }

    @And("User click archive button")
    public void userClickArchiveButton() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickarchivebutton();
    }

    @And("User choose archive")
    public void userChooseArchive() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Choosearchive();
    }

    @Then("User successfully archive blast")
    public void userSuccessfullyArchiveBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyarchiveblash();
    }

    @Then("User cant create blash without description")
    public void userCantCreateBlashWithoutDescription() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.VerifycreateBlashwithoutdescription();
    }

    @And("user removes all sucriber")
    public void userRemovesAllSucriber() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Removeallsubcriber();
    }

    @Then("User can edit without subcriber in blast")
    public void userCanEditWithoutSubcriberInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Verifyeditwithoutsubcriber();
    }

    @And("User doesn't type any word comment in blast")
    public void userDoesnTTypeAnyWordCommentInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcommentcoloumnwithoutwords();

    }

    @Then("User cant add comment with empty word")
    public void userCantAddCommentWithEmptyWord() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User doesn't type any word in blast")
    public void userDoesnTTypeAnyWordInBlast() throws InterruptedException {
        Thread.sleep(2000);
        BlastPage.Clickcheersinblashwithoutword();
    }
}