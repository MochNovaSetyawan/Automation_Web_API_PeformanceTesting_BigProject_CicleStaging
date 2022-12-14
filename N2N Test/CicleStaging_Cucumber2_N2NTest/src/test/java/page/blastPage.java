package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static MyStepdefs.bypass.driver;

public class blastPage {

    public blastPage() {
        PageFactory.initElements(driver,this);
    }


    //CREATE BLASH
    By blashboxmenu = By.xpath("//h1[normalize-space()='Blast!']");
    By createblashbutton = By.cssSelector("div[class='GlobalActionButton_text__31ND7'] p");
    By typetitleblash = By.cssSelector("textarea[placeholder='Type a title...']");
    By typedescriptionblash = By.cssSelector("div[class='fr-element fr-view'] p");
    By publishbutton = By.xpath("//h1[normalize-space()='Publish']");
    By verifycreateblash = By.xpath("//*[contains(text(),'Create post successful')]");


    public void Clickblashboxmenu() {
        driver.findElement(blashboxmenu).click();
    }

    public void Clickcreateblashbutton() {
        driver.findElement(createblashbutton).click();
    }

    public void Typetitleblash() {
        driver.findElement(typetitleblash).sendKeys("ini title");
    }

    public void Typedescriptionblash() {
        driver.findElement(typedescriptionblash).sendKeys("ini deskripsi");
    }

    public void Clickpublishbutton() {
        driver.findElement(publishbutton).click();
    }
    public void Verifycreateblash() {
        WebElement verifyCreateblash = driver.findElement(verifycreateblash);
        Assert.assertTrue(verifyCreateblash.isDisplayed());
    }


    //EDIT BLASH
    By chooseblash = By.xpath("//*[@class=\"Post_link__3u8eF\"][1]");
    By clickdot3icon = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv\"][@data-testid=\"MoreVertOutlinedIcon\"]");
    By clickeditinblash = By.xpath("//*[contains(text(),'Edit')]");
    By savechangesinblash = By.xpath("//*[contains(text(),'Save Changes')]");
    By typeedittitleblash = By.cssSelector("textarea[placeholder='Type a title...']");
    By typeeditdescriptionblash = By.cssSelector("div[class='fr-element fr-view'] p");
    By verifyeditblash = By.xpath("//*[contains(text(),'Update post successful')]");

    public void Chooseblash() {
        driver.findElement(chooseblash).click();
    }

    public void Clickdot3icon() {
        driver.findElement(clickdot3icon).click();
    }

    public void Clickeditbuttoninblash() {
        driver.findElement(clickeditinblash).click();
    }

    public void Clicksavechangesinblash() {
        driver.findElement(savechangesinblash).click();
    }

    public void Typeedittitle() {
        driver.findElement(typeedittitleblash).clear();
        driver.findElement(typeedittitleblash).sendKeys("ini edit title");
    }
    public void VerifyEditblash() {
        WebElement verifyEditblash = driver.findElement(verifyeditblash);
        Assert.assertTrue(verifyEditblash.isDisplayed());
    }


    public void Typeeditdescription() {
        driver.findElement(typeeditdescriptionblash).clear();
        driver.findElement(typeeditdescriptionblash).sendKeys("ini edit deskripsi");
    }


    //ADD COMMENT IN BLASH
    By clickcommentcoloumninblash = By.xpath("//*[@class=\"Main_input__qq9k9 Main_secondary__2bXP3\"]");
    By typecommentinblash = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By clickpostinblash = By.xpath("//*[contains(text(),'Post')]");
    By verifyaddcomment = By.xpath("//*[contains(text(),'Create comment on blast post successful')]");

    public void Typecommentinblash() {
        driver.findElement(clickcommentcoloumninblash).click();
        driver.findElement(typecommentinblash).sendKeys("ini comment");
    }

    public void Clickpostinblash() {
        driver.findElement(clickpostinblash).click();
    }
    public void Verifyaddcomment() {
        WebElement addCommentinblash = driver.findElement(verifyaddcomment);
        Assert.assertTrue(addCommentinblash.isDisplayed());
    }

    //CHEERS
    By clickcheersinblash = By.cssSelector(".PostBlastPage_cheersSection__1pXFk .CheersButton_buttonCheers__2mJix img");
    By typecheersinblash = By.xpath("//*[@placeholder=\"Give'em cheers!\"]");
    By clickcheklistbutton = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium CheersButton_checkIcon__1ub7w css-vubbuv\"]");
    By verifyaddcheers = By.xpath("//*[contains(text(),'Create cheers on post successful')]");

    public void Clickcheersinblash() {
        driver.findElement(clickcheersinblash).click();
    }

    public void Typecheersinblash() {
        driver.findElement(typecheersinblash).sendKeys("ini cheers");
    }

    public void Clickcheklistbutton() {
        driver.findElement(clickcheklistbutton).click();
    }
    public void Verifyaddcheers() {
        WebElement addCheersinblash = driver.findElement(verifyaddcheers);
        Assert.assertTrue(addCheersinblash.isDisplayed());
    }

    //EDIT COMMENT
    By clickdot3commentinblash = By.xpath("//*[@class=\"CommentItem_commentMenuSection__1dW17\"][last()]");
    By typeeditcommentblash = By.xpath("//div[@class='fr-element fr-view']//p");
    By verifyeditcommentinblast = By.xpath("//*[contains(text(),'Update comment on blast post successful')]");

    public void Clickdot3commentinblash() {
        driver.findElement(clickdot3commentinblash).click();
    }

    public void Typeeditcommentblash() {
        driver.findElement(typeeditcommentblash).clear();
        driver.findElement(typeeditcommentblash).sendKeys("ini edit comment");
    }
    public void Verifyeditcommentinblast() {
        WebElement editCommentinblash = driver.findElement(verifyeditcommentinblast);
        Assert.assertTrue(editCommentinblash.isDisplayed());
    }
    //ADD SUBCRIBER
    By clickplusbuttoninblash = By.xpath("//div[@class='ShowLimitMembers_plusButton__8k3vj ShowLimitMembers_secondary__2lF80']//*[name()='svg']");
    By addmemberinblash = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx']//div[2]//*[name()='svg']");
    By clickdoneinblash = By.xpath("//*[contains(text(),'Done')]");
    By clickallsubcriberinblash = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d']//div//*[name()='svg']");
    By verifyeditsubcriber = By.xpath("//*[contains(text(),'Update post successful')]");

    public void Clickplusbuttoninblash() {
        driver.findElement(clickplusbuttoninblash).click();
    }

    public void Addmemberinblash() {
        driver.findElement(clickallsubcriberinblash).click();
        driver.findElement(addmemberinblash).click();
    }

    public void Clickdoneinblash() {
        driver.findElement(clickdoneinblash).click();
    }
    public void Verifyeditsubcriber() {
        WebElement addsucriberinblash = driver.findElement(verifyeditsubcriber);
        Assert.assertTrue(addsucriberinblash.isDisplayed());
    }

//COMPLETE POST

    By choosesetdoudatemanualy = By.xpath("//*[contains(text(),'Auto complete')]");
    By clicksetdoudatemanualy = By.xpath("//*[contains(text(),'Set due date manually')]");
    By clickcompletepost = By.cssSelector(".SubAction_container__ejtbG");
    By verifyeditcompletepost = By.xpath("//*[contains(text(),'Set post complete successful')]");

    public void Clicksetdoudatemanualy() {
        driver.findElement(choosesetdoudatemanualy).click();
        driver.findElement(clicksetdoudatemanualy).click();
    }

    public void Clickcompletepost() {
        driver.findElement(clickcompletepost).click();
    }
    public void Verifyeditcompletepost() {
        driver.findElement(verifyeditcompletepost).click();
    }

    //ARCHIVE BLASH
    By clickarchivebutton = By.cssSelector("[data-testid=\"ArchiveOutlinedIcon\"]");
    By choosearchive = By.cssSelector("[class=\"Main_iconText__f-xVC Main_iconBlueAquamarine__1b129 Main_iconPositionStart__IWQqT\"]");
    By verifyarchiveblash = By.xpath("//*[contains(text(),'Archive Post successful')]");

    public void Clickarchivebutton() {
        driver.findElement(clickarchivebutton).click();
    }

    public void Choosearchive() {
        driver.findElement(choosearchive).click();
    }
    public void Verifyarchiveblash() {
        WebElement archiveblash = driver.findElement(verifyarchiveblash);
        Assert.assertTrue(archiveblash.isDisplayed());
    }

    //REMOVE ALL SUBCRIBER
    By removeallsubcriber = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d']//div//*[name()='svg']");

    public void Removeallsubcriber() {
        driver.findElement(removeallsubcriber).click();
    }

    //COMMENT WITHOUT WORD
    By clickcommentcoloumnwithoutwords = By.xpath("//*[@class=\"CreateCommentForm_inputComment__2G2m9\"][last()]");

    public void Clickcommentcoloumnwithoutwords() {
        driver.findElement(clickcommentcoloumnwithoutwords).sendKeys("");
    }

    //CHEERS WITHOUT WORD
    By clickcheersinblashwithoutword = By.cssSelector(".PostBlastPage_cheersSection__1pXFk .CheersButton_buttonCheers__2mJix img");

    public void Clickcheersinblashwithoutword() {
        driver.findElement(clickcheersinblashwithoutword).sendKeys("");
    }

    //CREATE BLASH WITHOUT TITLE
    By verifycreateblashwithouttitle = By.xpath("//*[contains(text(),'Field parameter not complete.')]");
    public void VerifycreateBlashwithouttitle() {
        WebElement createBlashwithouttitle = driver.findElement(verifycreateblashwithouttitle);
        Assert.assertTrue(createBlashwithouttitle.isDisplayed());
    }
    //CREATE BLASH WITHOUT DESCRIPTION
    By verifycreateblashwithoutdescription = By.xpath("//*[contains(text(),'Field parameter not complete.')]");
    public void VerifycreateBlashwithoutdescription() {
        WebElement verifycreateBlashwithoutdescription = driver.findElement(verifycreateblashwithoutdescription);
        Assert.assertTrue(verifycreateBlashwithoutdescription.isDisplayed());
    }
    //EDIT WITHOUT SUBCRIBER IN BLASH
    By verifyeditwithoutsubcriber = By.xpath("//*[contains(text(),'Update post successful')]");
    public void Verifyeditwithoutsubcriber() {
        WebElement addsucriberinblash = driver.findElement(verifyeditwithoutsubcriber);
        Assert.assertTrue(addsucriberinblash.isDisplayed());
    }
}

