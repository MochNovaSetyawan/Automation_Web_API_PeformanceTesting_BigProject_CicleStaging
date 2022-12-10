package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.blashPage;

public class blashTest {
    public WebDriver driver;
    public  blashTest(){
        super();
        this.driver =  bypass.driver;
    }
    blashPage BlashPage = new blashPage();

    //CREATEBLASH
    @Given("User click nova team")
    public void userClickNovaTeam() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clicknovateambutton();
    }

    @When("User click blash box menu")
    public void userClickBlashBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickblashboxmenu();
    }

    @And("User click create blash button")
    public void userClickCreateBlashButton() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcreateblashbutton();
    }

    @And("User type a title blash")
    public void userTypeATitleBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typetitleblash();
    }

    @And("User type a description blash")
    public void userTypeADescriptionBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typedescriptionblash();
    }

    @And("User click publish button")
    public void userClickPublishButton() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickpublishbutton();
    }

    @Then("User can see the result of create new blash")
    public void userCanSeeTheResultOfCreateNewBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement verifyCreateblash = driver.findElement(By.xpath("//*[contains(text(),'Create post successful')]"));
        Assert.assertTrue(verifyCreateblash.isDisplayed());
    }

    //EDIT BLASH
    @And("User choose blash")
    public void userChooseBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Chooseblash();
    }

    @And("User click dot three icon")
    public void userClickDotThreeIconInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickdot3icon();
    }

    @And("User click edit")
    public void userClickEdit() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickeditbuttoninblash();
    }

    @And("User type edit a title blash")
    public void userTypeEditATitleBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typeedittitle();
    }

    @And("User type edit a description blash")
    public void userTypeEditADescriptionBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typeeditdescription();
    }

    @And("User click save changes")
    public void userClickSaveChanges() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clicksavechangesinblash();
    }


    @Then("User can see the result of edit blash")
    public void userCanSeeTheResultOfEditBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement verifyEditblash = driver.findElement(By.xpath("//*[contains(text(),'Update post successful')]"));
        Assert.assertTrue(verifyEditblash.isDisplayed());
    }


    @And("User type comment")
    public void userTypeCommen() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typecommentinblash();
    }

    @And("User click post button")
    public void userClickPost() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickpostinblash();
    }

    @Then("User successfully add comment in blash")
    public void userSuccessfullyAddCommentInBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addCommentinblash = driver.findElement(By.xpath("//*[contains(text(),'Create comment on blast post successful')]"));
        Assert.assertTrue(addCommentinblash.isDisplayed());
    }

    @And("User click cheers in blash")
    public void userClickCheersInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcheersinblash();
    }

    @And("User type cheers in blash")
    public void userTypeCheersInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typecheersinblash();
    }

    @And("User click checklist button")
    public void userClickChecklistButton() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcheklistbutton();
    }

    @Then("User successfully cheers in blash")
    public void userSuccessfullyCheersInBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addCheersinblash = driver.findElement(By.xpath("//*[contains(text(),'Create cheers on post successful')]"));
        Assert.assertTrue(addCheersinblash.isDisplayed());
    }

    @And("User click dot three icon comment in blash")
    public void userClickDotThreeIconCommentInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickdot3commentinblash();
    }

    @And("User type edit a comment blash")
    public void userTypeEditACommentBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Typeeditcommentblash();

    }

    @Then("User can see the result of edit comment in blash")
    public void userCanSeeTheResultOfEditCommentInBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement editCommentinblash = driver.findElement(By.xpath("//*[contains(text(),'Update comment on blast post successful')]"));
        Assert.assertTrue(editCommentinblash.isDisplayed());
    }

    @Then("User cant create blash without title")
    public void userCantCreateBlashWithoutTitle() throws InterruptedException {
        Thread.sleep(2000);
        WebElement createBlashwithouttitle = driver.findElement(By.xpath("//*[contains(text(),'Field parameter not complete.')]"));
        Assert.assertTrue(createBlashwithouttitle.isDisplayed());
    }

    @And("User click plus button in blash")
    public void userClickPlusButtonInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickplusbuttoninblash();
    }

    @And("User add member in blash")
    public void userAddMemberInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Addmemberinblash();
    }

    @And("User click done in blash")
    public void userClickDoneInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickdoneinblash();
    }

    @Then("User can add sucriber in blash")
    public void userCanAddSucriberInBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addsucriberinblash = driver.findElement(By.xpath("//*[contains(text(),'Update post successful')]"));
        Assert.assertTrue(addsucriberinblash.isDisplayed());
    }


    @And("User click set due date manually")
    public void userClickSetDueDateManually() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clicksetdoudatemanualy();
    }

    @And("User click complete post")
    public void userClickCompletePost() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcompletepost();
    }

    @Then("User successfully edit complete post")
    public void userSuccessfullyEditCompletePost() throws InterruptedException {
        Thread.sleep(2000);
        WebElement editcompletepost = driver.findElement(By.xpath("//*[contains(text(),'Set post complete successful')]"));
        Assert.assertTrue(editcompletepost.isDisplayed());
    }

    @And("User click archive button")
    public void userClickArchiveButton() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickarchivebutton();
    }

    @And("User choose archive")
    public void userChooseArchive() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Choosearchive();
    }

    @Then("User successfully archive blash")
    public void userSuccessfullyArchiveBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement archiveblash = driver.findElement(By.xpath("//*[contains(text(),'Archive Post successful')]"));
        Assert.assertTrue(archiveblash.isDisplayed());
    }

    @Then("User cant create blash without description")
    public void userCantCreateBlashWithoutDescription() throws InterruptedException {
        Thread.sleep(2000);
        WebElement verifycantcreate = driver.findElement(By.xpath("//*[contains(text(),'Field parameter not complete.')]"));
        Assert.assertFalse(verifycantcreate.isDisplayed());
    }

    @And("user removes all sucriber")
    public void userRemovesAllSucriber() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Removeallsubcriber();
    }

    @Then("User can edit without subcriber in blash")
    public void userCanEditWithoutSubcriberInBlash() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addsucriberinblash = driver.findElement(By.xpath("//*[contains(text(),'Update post successful')]"));
        Assert.assertTrue(addsucriberinblash.isDisplayed());
    }

    @And("User doesn't type any word comment in blash")
    public void userDoesnTTypeAnyWordCommentInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcommentcoloumnwithoutwords();

    }

    @Then("User cant add comment with empty word")
    public void userCantAddCommentWithEmptyWord() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User doesn't type any word in blash")
    public void userDoesnTTypeAnyWordInBlash() throws InterruptedException {
        Thread.sleep(2000);
        BlashPage.Clickcheersinblashwithoutword();
    }

    @Then("User cant add cheers in blash with empty word")
    public void userCantAddCheersInBlashWithEmptyWord() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addsucriberinblash = driver.findElement(By.xpath("//*[contains(text(),'Cheer cannot be empty')]"));
        Assert.assertTrue(addsucriberinblash.isDisplayed());
    }

}