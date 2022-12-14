package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.boardPage;

public class boardTest {
    public WebDriver driver;
    public boardTest() {
        super();
        this.driver= bypass.driver;
    }
    boardPage BoardPage = new boardPage();


    @When("User click board box menu")
    public void userClickBoardBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickboardboxmenu();
    }

    @And("User click add new list")
    public void userClickAddNewList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddnewlist();
    }

    @And("User type list Coloumn")
    public void userTypeListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typelistcoloumn();
    }

    @And("User click create button")
    public void userClickCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcreatebutton();
    }

    @Then("User can see the result of create new board")
    public void userCanSeeTheResultOfCreateNewBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatenewboard();
    }

    @And("User click add card")
    public void userClickAddCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddcard();
    }

    @And("User type card name")
    public void userTypeCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typecardname();
    }

    @And("User click add card button")
    public void userClickAddCardButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddcardbutton();
    }

    @Then("User can see the result of create new card")
    public void userCanSeeTheResultOfCreateNewCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatenewcard();
    }

    @And("User click list name")
    public void userClickListName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklistname();
    }

    @And("User type edit list coloumn")
    public void userTypeEditListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditlistcoloumn();
    }

    @Then("User successfully edit board list")
    public void userSuccessfullyEditBoardList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditlist();
    }

    @And("User choose card")
    public void userChooseCard() throws InterruptedException {
        Thread.sleep(3000);
        BoardPage.Choosecard();
    }

    @And("User click card name")
    public void userClickCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcardname();
    }

    @And("User type edit card coloumn")
    public void userTypeEditCardColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditcardcoloumn();
    }

    @And("User successfully edit card")
    public void userSuccessfullyEditCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditcard();
    }

    @And("User click notes button")
    public void userClickNotesButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicknotesbutton();
    }

    @And("User type edit description")
    public void userTypeEditDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditdescription();
    }

    @And("User click Save button")
    public void userClickSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.ClickSavebutton();
    }

    @Then("User successfully edit description")
    public void userSuccessfullyEditDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditdescription();
    }

    @Then("User successfully add comment in board")
    public void userSuccessfullyAddCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyaddcommenttinblash();
    }

    @And("User click plus button in board")
    public void userClickPlusButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickplusbuttoninboard();
    }

    @And("User click apply member button")
    public void userClickApplyMemberButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickapplymemberbutton();
    }

    @Then("User can add sucriber in board")
    public void userCanAddSucriberInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verfyaddsubcriberinboard();
    }

    @And("User click label button")
    public void userClickLabelButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklabelbutton();
    }

    @And("User click add label button")
    public void userClickAddLabelButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddlabelbutton();
    }

    @And("User type name label coloumn")
    public void userTypeNameLabelColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typenamelabelcoloumn();
    }

    @And("User choose color label")
    public void userChooseColorLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Choosecolorlabel();
    }

    @Then("User can add label in board")
    public void userCanAddLabelInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatelabel();
    }

    @And("User type description")
    public void userTypeDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typedescription();
    }

    @And("User choose label")
    public void userChooseLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Chooselabel();
    }

    @And("User click apply labels")
    public void userClickApplyLabels() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickapplylabels();
    }

    @Then("User successfully add label")
    public void userSuccessfullyAddLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyaddlabel();
    }

    @And("User click edit label button")
    public void userClickEditLabelButton() throws InterruptedException {
        Thread.sleep(5000);
        BoardPage.Clickeditbutton();
    }

    @Then("User successfully delete label")
    public void userSuccessfullyDeleteLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifydeletelabel();
    }

    @And("User click delete button in board")
    public void userClickDeleteButtonInBoard() throws InterruptedException {
        Thread.sleep(5000);
        BoardPage.Clickdeletebuttoninboard();
    }

    @And("User choose move card")
    public void userChooseMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Choosemovecard();
    }

    @And("User click move button")
    public void userClickMoveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickmovebutton();
    }

    @And("User click move list")
    public void userClickMoveList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklistbutton();
    }

    @And("User choose move list")
    public void userChooseMoveList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Chooseboardlist();
    }

    @And("User click move")
    public void userClickMove() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickmovebutoon();
    }

    @Then("User successfully move card")
    public void userSuccessfullyMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifymovecard();
        Thread.sleep(2000);
    }

//    @And("User card back to normal")
//    public void userCardBackToNormal() throws InterruptedException {
//        Thread.sleep(2000);
//        BoardPage.Closecard();
//        Thread.sleep(2000);
//        BoardPage.Choosemovecard2();
//        Thread.sleep(2000);
//        BoardPage.Clickmovebutton();
//        Thread.sleep(2000);
//        BoardPage.Clicklistbutton();
//        Thread.sleep(2000);
//        BoardPage.Chooseboardlist2();
//        Thread.sleep(2000);
//        BoardPage.Clickmovebutoon();
//        Thread.sleep(2000);
//    }

    @And("User click attachment button")
    public void userClickAttachmentButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickattachmentbutton();
    }

    @And("User send Attachment")
    public void userSendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Sendattachment();
    }

    @And("User successfully send attachment")
    public void userSuccessfullySendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyattachment();
    }

    @And("User type link name")
    public void userTypeLinkName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typelinkname();
    }

    @And("User click update")
    public void userClickUpdate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Updatebutton();
    }

    @Then("User successfully edit name attachment")
    public void userSuccessfullyEditNameAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditattachment();
    }

    @And("User click delete in attachment")
    public void userClickDeleteInAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickdeletebuttoninattachment();
    }

    @And("User click delete")
    public void userClickDelete() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickdelete();
    }

    @Then("User successfully delete attachment")
    public void userSuccessfullyDeleteAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifydeleteattachment();
    }

    @And("User click private card")
    public void userClickPrivateCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.clickprivatecard();
    }

    @Then("User successfully makes the card private")
    public void userSuccessfullyMakesTheCardPrivate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyprivatecard();
    }

    @Then("User successfully makes the card public")
    public void userSuccessfullyMakesTheCardPublic() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifypubliccard();
    }

    @And("User click public card")
    public void userClickPublicCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickpubliccard();
    }

    @And("User click due date button")
    public void userClickDueDateButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickduedatebutton();
    }

    @And("User type date")
    public void userTypeDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typedate();
    }

    @And("User type time")
    public void userTypeTime() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typetime();
    }

    @Then("User successfully set due date")
    public void userSuccessfullySetDueDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifysetduedate();
    }

    @And("User click remove button")
    public void userClickRemoveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickremovebutton();
    }

    @Then("User successfully remove due date")
    public void userSuccessfullyRemoveDueDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyremoveduedate();
    }
}
